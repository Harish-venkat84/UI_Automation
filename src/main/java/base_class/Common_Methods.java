package base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Methods {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String main;
	public static Scanner scanner;

	static ChromeOptions option = new ChromeOptions();

	static Map<String, Object> connectSetting = new HashMap<>();
	static Map<String, Object> profile = new HashMap<>();
	static Map<String, Object> prefs = new HashMap<>();

	public static WebDriver browserLauch(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			connectSetting.put("clipboard", 1);
			profile.put("managed_default_content_settings", connectSetting);
			prefs.put("profile", profile);
			option.setExperimentalOption("prefs", prefs);

			option.addArguments("user-data-dir=" + System.getProperty("user.dir") + "/ChromeCache");

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void urlLaunch(String url) {

		driver.get(url);
	}

	public static void quite() {

		driver.quit();
	}

	public static void sendkeys(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void click(WebElement ele) {

		ele.click();

	}

	public static String getText(WebElement element) {

		String text = element.getText();
		return text;
	}

	public static void explicitWait(String input) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(input)));
	}

	public static void waitvisibilityOfAllElements(WebElement input) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(input));
	}

	public static void waitElementTovisibility(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitElementToCickable(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitElementToSelected(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void waitPresenceOfElement(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

	}

	public static void waitInvisibilityOfElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));

	}

	public static void waitTextToBePresentInElement(WebElement element, String text) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	}

	public static void selectByVisibleText(WebElement element, String input) {

		Select s2 = new Select(element);
		s2.selectByVisibleText(input);
	}

	public static String getElementText(WebElement element) {

		String text = element.getAttribute("value");
		return text;
	}

	public static String getElementType(WebElement element) {

		String text = element.getAttribute("type");
		return text;
	}

	public static void copingFileLocation(String path) throws AWTException, InterruptedException {

		StringSelection select = new StringSelection(System.getProperty("user.dir") + path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

		Thread.sleep(200);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void pressnum() throws AWTException {
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_5);
		robo.keyRelease(KeyEvent.VK_5);
	}

	public static void getWindHandle() {

		main = driver.getWindowHandle();

	}

	public static void driverSwitch() {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {

			if (driver.switchTo().window(string).getTitle().equals("Netmeds RWOS - BWDI")) {
				driver.switchTo().window(string);
			}
		}
	}

	public static void alert() {

		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();

	}

	public static String scan() {

		if (scanner == null) {

			scanner = new Scanner(System.in);
		}
		return scanner.nextLine();
	}
	
	public static void clear(WebElement element) {
		
		element.clear();
		
	}
	
	public static void pagedown() {
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
	public static void selectAll() throws AWTException {
		Robot ss = new Robot();
		
		ss.keyPress(KeyEvent.VK_CONTROL);
		ss.keyPress(KeyEvent.VK_A);
		ss.keyRelease(KeyEvent.VK_A);
		ss.keyRelease(KeyEvent.VK_CONTROL);
	}

}
