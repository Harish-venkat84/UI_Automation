package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_Sync_SupplierToDC {

	public WebDriver driver;

	@FindBy(xpath = "//label[text() = 'Supplier Name']//preceding::td//child::input")
	private WebElement provideSupplierID;

	@FindBy(xpath = "//span[text() = 'Search']")
	private WebElement clickSearchSync;

	@FindBy(xpath = "//i[@title='Click to View']")
	private WebElement clickToView;

	@FindBy(xpath = "//span[text()='Party Sync']")
	private WebElement clickPartySync;

	@FindBy(xpath = "//span[@class=\"ui-inputgroup-addon\"]//following::input[@style='width:100%']")
	private WebElement searchDC;

	@FindBy(xpath = "//label[text()='768-BWDI']")
	private WebElement selectDC;

	@FindBy(xpath = "//span[text()='Sync']")
	private WebElement sync;

	@FindBy(xpath = "//div[@style='text-align:right; margin-top:5px;']//child::button")
	private WebElement closeSyncDCPage;

	public RW_Sync_SupplierToDC(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProvideSupplierID() {
		return provideSupplierID;
	}

	public WebElement getClickSearchSync() {
		return clickSearchSync;
	}

	public WebElement getClickToView() {
		return clickToView;
	}

	public WebElement getClickPartySync() {
		return clickPartySync;
	}

	public WebElement getSearchDC() {
		return searchDC;
	}

	public WebElement getSelectDC() {
		return selectDC;
	}

	public WebElement getSync() {
		return sync;
	}

	public WebElement getCloseSyncDCPage() {
		return closeSyncDCPage;
	}

}
