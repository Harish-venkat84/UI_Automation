package page_object_model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_Business_Unit {

	public WebDriver driver;

	public String pro = "//span[text()='Proceed']";
	
	@FindBy(xpath = "//span[text() = '102  - NMS']")
	private WebElement select;
	
	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceed;

	public RW_Business_Unit(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getSelect() {
		return select;
	}

}
