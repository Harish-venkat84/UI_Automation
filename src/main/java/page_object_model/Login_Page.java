package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static String alreadyLogIn = "//span[contains(text(), 'already logged')]";

	public WebDriver driver;

	@FindBy(id = "userName")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//label[contains(text(), 'Sign-in into' )]//parent::p-checkbox//descendant::span")
	private WebElement undefault;

	@FindBy(id = "signIn")
	private WebElement sign_in;

	@FindBy(xpath = "//span[contains(text(), 'already logged')]")
	private WebElement alreadyLogged;

	@FindBy(xpath = "//span[text()= 'Yes']")
	private WebElement confirmYes;

	public Login_Page(WebDriver driver2) {

		if (driver == null) {
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		}
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {

		return password;
	}

	public WebElement getUndefault() {
		return undefault;
	}

	public WebElement getSign_in() {
		return sign_in;
	}

	public WebElement getAlreadyLogged() {
		return alreadyLogged;
	}

	public WebElement getConfirmYes() {
		return confirmYes;
	}

}
