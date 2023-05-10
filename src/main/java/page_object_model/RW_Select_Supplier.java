package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_Select_Supplier {

	public WebDriver driver;

	@FindBy(xpath = " //a[text() = 'Common Supplier']")
	private WebElement commonSupplier;

	@FindBy(xpath = "//*[@id=\"ui-accordiontab-0-content\"]/div/div/table/tbody/tr[1]/td[6]/input")
	private WebElement provideGSTIN;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement searchSupplier;

	public RW_Select_Supplier(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCommonSupplier() {
		return commonSupplier;
	}

	public WebElement getProvideGSTIN() {
		return provideGSTIN;

	}

	public WebElement getSearchSupplier() {
		return searchSupplier;
	}
}
