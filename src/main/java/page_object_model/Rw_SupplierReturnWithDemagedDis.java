package page_object_model;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import properties.Configuration_Reader;

public class Rw_SupplierReturnWithDemagedDis {
	
	public WebDriver driver;
	
	public String get_Supplier_Name() throws IOException {

		String gettext = Configuration_Reader.getCR().getFRM().getSupplierName();
		String name = "//div[contains(text(), '" + gettext + "')]";
		return name;
	}
	
	@FindBy(xpath = "//a[text()='Supplier Return']")
	private WebElement clickSupplierReturn;
	
	@FindBy (xpath = "//label[text() = 'Txn Id']//parent::td//parent::tr//child::td//child::p-autocomplete//child::span//child::input")
	private WebElement clickSupplierSearch;
	
	@FindBy (xpath = "//*[@id=\"ui-accordiontab-13-content\"]/div/div/div[1]/div/table/tbody/tr[2]/td[2]/rw-supplier-search/p-autocomplete/span/div/ul/li/div/div")
	private WebElement clickSupplierSearchSuggestion; 
	
	@FindBy (xpath = "//label[text()='Txn Id']//parent::td//parent::tr//child::td//child::input[@class='rw-component-space ng-untouched ng-pristine ng-valid']")
	private WebElement clickTnxId;
	
	@FindBy (xpath = "//span[text()='Search']//parent::button")
	private WebElement clickSearchButton;
	
	@FindBy (xpath = "//p-dtradiobutton[@class='ng-star-inserted']//child::div[@class='ui-radiobutton-box ui-widget ui-radiobutton-relative ui-state-default']")
	private WebElement selectSupplierWithTnxId;
	
	@FindBy(xpath = "//label[text()='Exclude Ok dispositions']")
	private WebElement unselectExcludeOkdispositions;
	
	@FindBy (xpath = "//span[text()='Make Return']")
	private WebElement clickMakeReturn;
	
	@FindBy(xpath = "//label[text()='Return Type']//parent::td//parent::tr//child::td//child::rw-code-component//child::p-dropdown//child::label//child::span")
	private WebElement selectSupplierType;
	
	@FindBy (xpath = "//div[text()='Rack Return']")
	private WebElement selectRackReturn;
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[13]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition1;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemOneDisposition;
	
	@FindBy(xpath = "//span[text()='Banned Product']")
	private WebElement lineItemOneBannedProductDis;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemOneBatchMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemOneDamaged;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemOneBannedProdect;
	
	@FindBy(xpath = "//div[text()='Expired']")
	private WebElement lineItemOneExpiry;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemOneNotforonlinesale;
	
	@FindBy(xpath = "//div[text()='Sale Close This Pack Size']")
	private WebElement lineItemOneSaleCloseThisPackSize;
	
	@FindBy(xpath = "//div[text()='DPCO Issue']")
	private WebElement lineItemOneDPCOIssue;
	
	@FindBy(xpath = "//div[text()='Short Expiry']")
	private WebElement lineItemOneShortExpiry;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath ="//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[13]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition2;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemTwoDisposition;
	
	@FindBy(xpath = "//span[text()='Banned Product']")
	private WebElement lineItemTwoBannedProductDis;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemTwoBatchMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemTwoDamaged;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemTwoBannedProdect;
	
	@FindBy(xpath = "//div[text()='Expired']")
	private WebElement lineItemTwoExpiry;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemTwoNotforonlinesale;
	
	@FindBy(xpath = "//div[text()='Sale Close This Pack Size']")
	private WebElement lineItemTwoSaleCloseThisPackSize;
	
	@FindBy(xpath = "//div[text()='DPCO Issue']")
	private WebElement lineItemTwoDPCOIssue;
	
	@FindBy(xpath = "//div[text()='Short Expiry']")
	private WebElement lineItemTwoShortExpiry;
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[3]/td[13]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition3;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemThreeDisposition;
	
	@FindBy(xpath = "//span[text()='Banned Product']")
	private WebElement lineItemThreeBannedProductDis;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemThreeBatchMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemThreeDamaged;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemThreeBannedProdect;
	
	@FindBy(xpath = "//div[text()='Expired']")
	private WebElement lineItemThreeExpiry;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemThreeNotforonlinesale;
	
	@FindBy(xpath = "//div[text()='Sale Close This Pack Size']")
	private WebElement lineItemThreeSaleCloseThisPackSize;
	
	@FindBy(xpath = "//div[text()='DPCO Issue']")
	private WebElement lineItemThreeDPCOIssue;
	
	@FindBy(xpath = "//div[text()='Short Expiry']")
	private WebElement lineItemThreeShortExpiry;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='New GRN Immediate Return - Select GRN']//parent::div//preceding::span[text()='Submit']")
	private WebElement submitSupplierRuturn;
	
	@FindBy(xpath = "//span[text()='New GRN Immediate Return - Select GRN']//preceding::span[text()='Close']")
	private WebElement closeSupplierReturnpage;
	
	public Rw_SupplierReturnWithDemagedDis(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getClickSupplierReturn() {
		return clickSupplierReturn;
	}
	public WebElement getClickSupplierSearch() {
		return clickSupplierSearch;
	}
	
	public WebElement getClickSupplierSearchSuggestion() {
		return clickSupplierSearchSuggestion;
	}
	
	public WebElement getClickTnxId() {
		return clickTnxId;
	}
	
	public WebElement getClickSearchButton() {
		return clickSearchButton;
	}
	
	public WebElement getSelectSupplierWithTnxId() {
		return selectSupplierWithTnxId;
	}
	
	public WebElement getUnselectExcludeOkdispositions() {
		return unselectExcludeOkdispositions;
	}
	
	public WebElement getClickMakeReturn() {
		return clickMakeReturn;
	}
	
	public WebElement getSelectSupplierType() {
		return selectSupplierType;
	}
	
	public WebElement getSelectRackReturn() {
		return selectRackReturn;
	}
	
	public WebElement getSelectDisposition1() {
		return selectDisposition1;
	}
	public WebElement getLineItemOneDisposition() {
		return lineItemOneDisposition;
	}
	
	public WebElement getLineItemOneBannedProductDis() {
		return lineItemOneBannedProductDis;
	}
	
	public WebElement getLineItemOneBatchMRPMismatch() {
		return lineItemOneBatchMRPMismatch;
	}
	
	public WebElement getLineItemOneDamaged() {
		return lineItemOneDamaged;
	}
	
	public WebElement getLineItemOneBannedProdect() {
		return lineItemOneBannedProdect;
	}
	
	public WebElement getLineItemOneExpiry() {
		return lineItemOneExpiry;
	}
	public WebElement getLineItemOneNotforonlinesale() {
		return lineItemOneNotforonlinesale;
	}
	
	public WebElement getLineItemOneSaleCloseThisPackSize() {
		return lineItemOneSaleCloseThisPackSize;
	}
	public WebElement getLineItemOneDPCOIssue() {
		return lineItemOneDPCOIssue;
	}
	
	public WebElement getLineItemOneShortExpiry() {
		return lineItemOneShortExpiry;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getSelectDisposition2() {
		return selectDisposition2;
	}
	
	public WebElement getLineItemTwoDisposition() {
		return lineItemTwoDisposition;
	}
	public WebElement getLineItemTwoBannedProductDis() {
		return lineItemTwoBannedProductDis;
	}
	
	public WebElement getLineItemTwoBatchMRPMismatch() {
		return lineItemTwoBatchMRPMismatch;
	}
	
	public WebElement getLineItemTwoDamaged() {
		return lineItemTwoDamaged;
	}
	
	public WebElement getLineItemTwoBannedProdect() {
		return lineItemTwoBannedProdect;
	}
	
	public WebElement getLineItemTwoExpiry() {
		return lineItemTwoExpiry;
	}
	
	
	public WebElement getLineItemTwoNotforonlinesale() {
		return lineItemTwoNotforonlinesale;
	}
	
	public WebElement getLineItemTwoSaleCloseThisPackSize() {
		return lineItemTwoSaleCloseThisPackSize;
	}
	
	public WebElement getLineItemTwoDPCOIssue() {
		return lineItemTwoDPCOIssue;
	}
	
	public WebElement getLineItemTwoShortExpiry() {
		return lineItemTwoShortExpiry;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getSelectDisposition3() {
		return selectDisposition3;
	}
	
	public WebElement getLineItemThreeDisposition() {
		return lineItemThreeDisposition;
	}
	public WebElement getLineItemThreeBannedProductDis() {
		return lineItemThreeBannedProductDis;
	}
	
	public WebElement getLineItemThreeBatchMRPMismatch() {
		return lineItemThreeBatchMRPMismatch;
	}
	
	public WebElement getLineItemThreeDamaged() {
		return lineItemThreeDamaged;
	}
	
	
	public WebElement getLineItemThreeBannedProdect() {
		return lineItemThreeBannedProdect;
	}
	
	public WebElement getLineItemThreeExpiry() {
		return lineItemThreeExpiry;
	}
	
	public WebElement getLineItemThreeNotforonlinesale() {
		return lineItemThreeNotforonlinesale;
	}
	
	public WebElement getLineItemThreeSaleCloseThisPackSize() {
		return lineItemThreeSaleCloseThisPackSize;
	}
	
	public WebElement getLineItemThreeDPCOIssue() {
		return lineItemThreeDPCOIssue;
	}
	
	public WebElement getLineItemThreeShortExpiry() {
		return lineItemThreeShortExpiry;
	}
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getSubmitSupplierRuturn() {
		return submitSupplierRuturn;
	}
	
	public WebElement getCloseSupplierReturnpage() {
		return closeSupplierReturnpage;
	}
	
	
	
	

}

