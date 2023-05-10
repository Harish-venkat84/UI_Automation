package com.stepdefinitions;

import java.io.IOException;
import base_class.Common_Methods;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@SuppressWarnings("static-access")
public class RW_Login extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	public static Logger logger = LogManager.getLogger(RW_Login.class);
	
	@AfterStep(order = 0)
	public void checkingScenario(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
			scenario.attach(screenshot, "image/png", "imagepass");
			
			String name = scenario.getName();
			logger.info("Scenario Fail : "+name);
		}
	}
	
	
	@Given("user Must Launch Url In The Url Field")
	public void user_must_launch_url_in_the_url_field() throws IOException {

		urlLaunch(Configuration_Reader.getCR().getFRM().getURL());

	}

	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() throws IOException {

		waitElementToCickable(pageobject.getLoginPage().getUsername());
		sendkeys(pageobject.getLoginPage().getUsername(), Configuration_Reader.getCR().getFRM().getUsername());

	}

	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() throws IOException {

		sendkeys(pageobject.getLoginPage().getPassword(), Configuration_Reader.getCR().getFRM().getPassword());
	}

	@When("user must unselect default business unit")
	public void user_must_unselect_default_business_unit() throws InterruptedException {
		
		Thread.sleep(300);
		click(pageobject.getLoginPage().getUndefault());
	}

	@When("user Click The Singin Botton and It Navigates To The Netmeds RWOS Page")
	public void user_click_the_singin_botton_and_it_navigates_to_the_netmeds_rwos_page() {

		click(pageobject.getLoginPage().getSign_in());

	}

	@SuppressWarnings("unused")
	@Then("user if already login click the yes botton")
	public void user_if_already_login_click_the_yes_botton() {

		explicitWait(pageobject.getLoginPage().alreadyLogIn);
		if (getText(pageobject.getLoginPage().getAlreadyLogged()).contains("already logged")) {
			click(pageobject.getLoginPage().getConfirmYes());
		} else {
			int a = 0;
		}
	}

	@Given("User Must Select Common Business Unit")
	public void user_must_select_common_business_unit() throws InterruptedException {

		Thread.sleep(400);
		waitElementToCickable(pageobject.getbusiness_Unit().getSelect());
		click(pageobject.getbusiness_Unit().getSelect());
	}

	@When("user click the process button")
	public void user_click_the_process_button() {

		explicitWait(pageobject.getbusiness_Unit().pro);
		click(pageobject.getbusiness_Unit().getProceed());
	}

}