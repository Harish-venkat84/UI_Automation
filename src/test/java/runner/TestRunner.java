package runner;

import java.io.IOException;
import java.util.stream.Stream;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import base_class.Common_Methods;
import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import properties.Configuration_Reader;
import properties.FileReaderManager;

@CucumberOptions(features = {"D:\\New folder (2)\\Eclipse\\Lambda_Maven\\rwos_UI_automation\\feature"},
				glue = ("com.stepdefinitions"), 
plugin = {
		"json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"runner.MyTestListener" 
		}
		,tags = ("@Login_page"))

public class TestRunner extends AbstractTestNGCucumberTests {

	static String featurePath = System.getProperty("user.dir") + "\\feature";
	static String stepdefinitionsPath = "com.stepdefinitions";
	static String tags = Common_Methods.scan();

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		System.out.println("Cucumber tags has been entered");
		
		FileReaderManager.propertyFilePath();
		
		System.out.println(Configuration_Reader.getCR().getFRM().getTag());

		driver = Common_Methods.browserLauch("Chrome");

	}
	
	private static String[] defaultOptions = {

			featurePath, "--glue", stepdefinitionsPath, 
			"--tags", tags, "--plugin",
			"json:target/cucumber-report/cucumber.json", "--plugin", "html:target/cucumber-report/cucumber.html",
			"--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", };

	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) throws Throwable {
		setUp();

		try {

			Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
			Main main = new Main();
			main.run(cucumberOptions.toArray(String[]::new));

		} catch (Exception e) {

		}
	}

}
