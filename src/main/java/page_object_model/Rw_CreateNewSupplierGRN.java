package page_object_model;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.Configuration_Reader;

public class Rw_CreateNewSupplierGRN {

	public WebDriver driver;

	public String get_Supplier_Name() throws IOException {

		String gettext = Configuration_Reader.getCR().getFRM().getSupplierName();
		String name = "//div[contains(text(), '" + gettext + "')]";
		return name;
	}
	

	@FindBy(xpath = "//span[@ptooltip='Supplier GRN (Alt+F7)']")
	private WebElement clickSupplierGRN;

	@FindBy(xpath = "//label[text()='Supplier Name']//parent::div//child::input")
	private WebElement provideSupplierName;

	@FindBy(xpath = "//rw-partytxnid[@id='suppInvoiceNumber']//child::input[@type='text']")
	private WebElement provideInvoiceNumber;

	@FindBy(xpath = "//div[@ptooltip='Supp Inv No']")
	private WebElement clickSuggestion;

	@FindBy(xpath = "//label[text()='Long Term']")
	private WebElement clickSupplyType;

	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement clickProceed;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition1;

	@FindBy(xpath = "//div[text()='Ok']")
	private WebElement lineItemOneDisposition;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition2;
	
//	@FindAll(@FindBy(xpath = "//span[text() = '-Select-']//parent::label//parent::div//child::div//child::select//child::option[text()='Ok']"))
//	private List<WebElement> select123;
//	
//	public List<WebElement> getSelect123() {
//		return select123;
//	}
	
	@FindBy(xpath = "//div[text()='Ok']")
	private WebElement lineItemTwoDisposition;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[3]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition3;

	@FindBy(xpath = "//div[text()='Ok']")
	private WebElement lineItemThreeDisposition;

	@FindBy(xpath = "//td[text()='Diff Amt']//preceding::td[@class='billAmtColumn']//child::P")
	private WebElement captureCalculatedAmount;

	@FindBy(xpath = "//td[text()='Calculated Amt']//preceding::td[@class='billAmtColumn']//child::input")
	private WebElement provideSupplierBillAmount;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button[1]/span")
	private WebElement submitSupplierGRN;

	@FindBy(xpath = "//span[@title='Upload Supplier Invoice Scan Copies']")
	private WebElement clickUploadIcon;

	@FindBy(xpath = "//p-fileupload[@maxfilesize='10000000']//child::span[text()='Choose']//parent::span//child::input//parent::span")
	private WebElement clickChooseFile;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/p-dialog[1]/div/div[2]/div/rw-invoice-uploader/div/p-fileupload/div/div[1]/button[3]/span[2]")
	private WebElement clickUpload;

	@FindBy(xpath = "//label[contains(text(),'Verified, attached ')]")
	private WebElement verifyScanCopy;

	@FindBy(xpath = "//label[contains(text(),'Margin variance ')]//preceding::span[text()='Approve']")
	private WebElement approveScanCopy;

	@FindBy(xpath = "//span[text()='Supplier Invoices']//parent::div//child::a//child::span")
	private WebElement closeSupplierInvoicepage;

	@FindBy(xpath = "//label[text()='Txn Id']//following::input[@name='txnId']")
	private WebElement captureTxnID;

	@FindBy(xpath = "//span[text()='Supplier Invoices']//preceding::span[text()='Close']")
	private WebElement closeSupplierGRNPage;

	public Rw_CreateNewSupplierGRN(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// create New Supplier GRN

	public WebElement getClickSupplierGRN() {
		return clickSupplierGRN;

	}

	public WebElement getProvideSuppliername() {
		return provideSupplierName;
	}

	public WebElement getProvideInvoiceNumber() {
		return provideInvoiceNumber;
	}

	public WebElement getClickSuggestion() {
		return clickSuggestion;
	}

	public WebElement getClickSupplyType() {
		return clickSupplyType;
	}

	public WebElement getClickProceed() {
		return clickProceed;
	}

	public WebElement getSelectDisposition1() {
		return selectDisposition1;
	}

	public WebElement getLineItemOneDisposition() {
		return lineItemOneDisposition;
	}

	public WebElement getSelectDisposition2() {
		return selectDisposition2;
	}

	public WebElement getLineItemTwoDisposition() {
		return lineItemTwoDisposition;
	}

	public WebElement getSelectDisposition3() {
		return selectDisposition3;
	}

	public WebElement getLineItemThreeDisposition() {
		return lineItemThreeDisposition;
	}

	public WebElement getCaptureCalculatedAmount() {
		return captureCalculatedAmount;
	}

	public WebElement getProvideSupplierBillAmount() {
		return provideSupplierBillAmount;
	}

	public WebElement getSubmitSupplierGRN() {
		return submitSupplierGRN;
	}

	public WebElement getClickUploadIcon() {
		return clickUploadIcon;
	}

	public WebElement getVerifyScanCopy() {
		return verifyScanCopy;
	}

	public WebElement getApproveScanCopy() {
		return approveScanCopy;
	}

	public WebElement getClickChooseFile() {
		return clickChooseFile;
	}

	public WebElement getClickUpload() {
		return clickUpload;
	}

	public WebElement getCloseSupplierInvoicepage() {
		return closeSupplierInvoicepage;
	}

	public WebElement getCaptureTxnID() {
		return captureTxnID;
	}

	public WebElement getCloseSupplierGRNPage() {
		return closeSupplierGRNPage;
	}

}
