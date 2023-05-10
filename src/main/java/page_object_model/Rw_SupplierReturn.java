package page_object_model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import properties.Configuration_Reader;

public class Rw_SupplierReturn {
	
	public WebDriver driver;
	
	public WebElement clickAddIcon() throws Exception {
		
		WebElement invoiceNumber = driver.findElement(By.xpath("//span[text()='"
				+Configuration_Reader.getCR().getFRM().getSupplierInvoicNo()
						+"']//parent::td//parent::tr//descendant::span//child::span[@title]"));
		
		return invoiceNumber;
	}
	
	@FindBy(xpath = "//a[text()='Supplier Return']")
	private WebElement clickSupplierReturn;
	
	@FindBy(xpath = "//label[text()='Cancel this dialog and proceed for Rack Return']//parent::div//child::button[@label='Cancel']")
	private WebElement clickcancel;

	@FindBy (xpath = "//p-autocomplete[@placeholder='Item Search...']//child::span//child::input")
	private WebElement clickItemSearch;
	
//	/html/body/div[6]/ul/li/div/div/div[1]
	
	@FindBy (xpath = "//span[text()='Change Password']//parent::div//following::div[@class='ng-star-inserted']//child::div[@tooltipposition='top']")
	private WebElement clickSuggestion;
	
	@FindBy(xpath = "//p-autocomplete[@name]//child::span//child::input")
	private WebElement clickBatch;
	
//	/html/body/div[7]/ul/li/div/div[1]
	@FindBy(xpath = "//span[text()='Change Password']//parent::div//following::li//parent::div//child::div[@ptooltip='BatchId']")
	private WebElement clickBatchSuggestion;
	
	@FindBy(xpath = "//span//child::p[text() = '1'][1]")
	private WebElement clickInsideBox;
	
	
	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/ng-component/div[1]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[15]/span/span")
	private WebElement clickAddIcon;
	
//	@FindBy (xpath ="//p[text() = 'TT-21-30114065']//parent::span//parent::td//parent::tr//descendant::span[text() = '5']")
//	private WebElement captureInwardQty;
	
	@FindBy(xpath = "//span//child::p[text() = 'TT-21-20113726']//parent::span//parent::td//parent::tr//child::td//descendant::span//child::rw-number-input//child::input[1]")
	private WebElement providereturnQty;
	
	
	@FindBy (xpath = "//rw-number-input//child::input//preceding::td//child::span//child::rw-number-input//child::input")
	private WebElement giveReturnQty;
	
	@FindBy(xpath = "//footer//child::button//child::span[text() = 'Close']")
	private WebElement closenullqty;
	
	@FindBy(xpath = "//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")
	private WebElement clickCheckBox;
	
	@FindBy(xpath = "//span[text()='Proceed']//parent::button")
	private WebElement clickProceedbutton;
	
	@FindBy (xpath ="//div[@style='width: 195px;']//child::label//child::span")
	private WebElement selectDisposition;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement provideDisposition;
	
	@FindBy(xpath = "//div[text()='Expired']")
	private WebElement ExpiredDisposition;
	
	@FindBy(xpath = "//div[text()='Short Expiry']")
	private WebElement ShortExpiredDisposition;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement BannedproductDisposition;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement DamagedDisposition;
	
	@FindBy(xpath = "//div[text()='Sale Close This Pack Size']")
	private WebElement SaleclosesthispackSizeDisposition;
	
	@FindBy(xpath = "//div[text()='DPCO Issue']")
	private WebElement DPCOIssueDisposition;
	
	
	
	@FindBy (xpath ="//span[text()='Close']//parent::button//parent::div//child::button[@type='text']//child::span[text()='Submit']")
	private WebElement clickSubmitButton;
	
	@FindBy(xpath = "//div[@style='text-align:right; margin-top:10px;']//child::button//child::span[text()='Close']")
	private WebElement clickClosebutton;
	
	
	public Rw_SupplierReturn(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getClickSupplierReturn() {
		return clickSupplierReturn;
	}
	
	public WebElement getClickcancel() {
		return clickcancel;
	}
	
	public WebElement getClickItemSearch() {
		return clickItemSearch;
	}
	
	public WebElement getClickSuggestion() {
		return clickSuggestion;
	}
	
	public WebElement getClickBatch() {
		return clickBatch;
	}
	
	public WebElement getClickBatchSuggestion() {
		return clickBatchSuggestion;
	}
	
	public WebElement getClickInsideBox() {
		return clickInsideBox;
	}
	
	public WebElement getClickAddIcon() {
		return clickAddIcon;
	}
		
//	public WebElement getCaptureInwardQty() {
//		return captureInwardQty;
//	}
	public WebElement getClosenullqty() {
		return closenullqty;
	}
	
	public WebElement getProvidereturnQty() {
		return providereturnQty;
	}
	
	public WebElement getGiveReturnQty() {
		return giveReturnQty;
	}
	
	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}
	
	public WebElement getClickProceedbutton() {
		return clickProceedbutton;
	}
	
	public WebElement getSelectDisposition() {
		return selectDisposition;
	}
	
	
	
	
	
	
	public WebElement getProvideDisposition() {
		return provideDisposition;
	}
	
	public WebElement getExpiredDisposition() {
		return ExpiredDisposition;
	}
	
	public WebElement getShortExpiredDisposition() {
		return ShortExpiredDisposition;
	}
	
	public WebElement getBannedproductDisposition() {
		return BannedproductDisposition;
	}
	
	public WebElement getDamagedDisposition() {
		return DamagedDisposition;
	}
	
	public WebElement getSaleclosesthispackSizeDisposition() {
		return SaleclosesthispackSizeDisposition;
	}
	
	public WebElement getDPCOIssueDisposition() {
		return DPCOIssueDisposition;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getClickSubmitButton() {
		return clickSubmitButton;
	}
	
	public WebElement getClickClosebutton() {
		return clickClosebutton;
	}
}
