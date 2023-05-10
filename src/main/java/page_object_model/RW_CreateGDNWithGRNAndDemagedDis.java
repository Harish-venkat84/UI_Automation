package page_object_model;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import properties.Configuration_Reader;

public class RW_CreateGDNWithGRNAndDemagedDis {

	public WebDriver driver;

	@FindBy(xpath = "//img[@class='tenantIcon menu']")
	private WebElement switchFC;

	@FindBy(xpath = "//span[text()='768 - HX0E - BWDI']//parent::div")
	private WebElement selectFC;

	@FindBy(xpath = "//li[@class='sidebar-list ng-star-inserted']//descendant::span[@class='menu-icon fa fa-truck fa-lg']")
	private WebElement clickSupplierGDN;

	@FindBy(xpath = "//ul[@class='submenu ng-star-inserted']//descendant::a[text()='Import GDN']")
	private WebElement clickImportGDN;

	//purchase-order[@class='ng-star-inserted']//child::rw-invoice-uploader//child::div[@style='margin-top:25px']//child::p-fileupload//div[@class='rw-custom-uploader ui-fileupload ui-widget ng-star-inserted']//child::span[text()='Choose']
	
	@FindBy(xpath = "//span[text() = 'Choose']//parent::span//child::input//parent::span")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//span[text() = 'Choose']//preceding::span[text() = 'Choose']//parent::span//child::input//parent::span")
	private WebElement choosefile2;

	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement uploadfile;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-dialog[5]/div/div[1]/a/span")
	private WebElement closeImportGRN;

	@FindBy(xpath = "//span[text()='Cancel GDN']//preceding::span[text()='Close']")
	private WebElement closeGDNPage;
	
//	Create New supplier GRN
	
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
	
	@FindBy(xpath = "//label[text()='RWOS Supplier Order (PO) references which are mentioned in invoice']//parent::div//child::p-autocomplete//child::li//child::input")
	private WebElement clickPO;

	@FindBy(xpath = "//label[text()='Long Term']")
	private WebElement clickSupplyType;

	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement clickProceed;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition1;

	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemOneDisposition;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemOneBannedDis;
	
	@FindBy(xpath = "//div[text()='Damage in Transit']")
	private WebElement lineItemOneDamageInTransit;
	
	@FindBy(xpath = "//div[text()='Lost in Transist']")
	private WebElement lineItemOneLostInTransist;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Rejected']")
	private WebElement lineItemOneMRPMismatchRejected;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Accepted']")
	private WebElement lineItemOneMRPMismatchAccpted;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemOneNotForOnlineSale;
	
	@FindBy(xpath ="//div[text()='Expired']")
	private WebElement lineItemOneExpired;
	
	@FindBy(xpath = "//div[text()='Diff Pack Size']")
	private WebElement lineItemOneDiffPackSize;
	
	@FindBy(xpath = "//div[text()='Not Ordered']")
	private WebElement lineItemOneNotOrdered;
	
	@FindBy(xpath = "//div[text()='Not Supplied']")
	private WebElement lineItemOneNotSupplied ;
	
	@FindBy(xpath = "//div[text()='Wrong Batch']")
	private WebElement lineItemOneWrongBatch;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemOneMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Item Master Missing']")
	private WebElement lineItemOneItemMasterMissing;
	
	@FindBy(xpath = "//div[text()='Short Supply']")
	private WebElement lineItemOneShortSupply;
	
	
	
	
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition2;
	
	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemTwoDisposition;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemTwoBannedDis;
	
	@FindBy(xpath = "//div[text()='Damage in Transit']")
	private WebElement lineItemTwoDamageInTransit;
	
	@FindBy(xpath = "//div[text()='Lost in Transist']")
	private WebElement lineItemTwoLostInTransist;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Rejected']")
	private WebElement lineItemTwoMRPMismatchRejected;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Accepted']")
	private WebElement lineItemTwoMRPMismatchAccpted;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemTwoNotForOnlineSale;
	
	@FindBy(xpath ="//div[text()='Expired']")
	private WebElement lineItemTwoExpired;
	
	@FindBy(xpath = "//div[text()='Diff Pack Size']")
	private WebElement lineItemTwoDiffPackSize;
	
	@FindBy(xpath = "//div[text()='Not Ordered']")
	private WebElement lineItemTwoNotOrdered;
	
	@FindBy(xpath = "//div[text()='Not Supplied']")
	private WebElement lineItemTwoNotSupplied ;
	
	@FindBy(xpath = "//div[text()='Wrong Batch']")
	private WebElement lineItemTwoWrongBatch;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemTwoMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Item Master Missing']")
	private WebElement lineItemTwoItemMasterMissing;
	
	@FindBy(xpath = "//div[text()='Short Supply']")
	private WebElement lineItemTwoShortSupply;
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[3]/td[16]/span/rw-code-component/p-dropdown/div/label/span")
	private WebElement selectDisposition3;

	@FindBy(xpath = "//div[text()='Damaged']")
	private WebElement lineItemThreeDisposition;
	
	@FindBy(xpath = "//div[text()='Banned Product']")
	private WebElement lineItemThreeBannedDis;
	
	@FindBy(xpath = "//div[text()='Damage in Transit']")
	private WebElement lineItemThreeDamageInTransit;
	
	@FindBy(xpath = "//div[text()='Lost in Transist']")
	private WebElement lineItemThreeLostInTransist;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Rejected']")
	private WebElement lineItemThreeMRPMismatchRejected;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch - Accepted']")
	private WebElement lineItemThreeMRPMismatchAccpted;
	
	@FindBy(xpath = "//div[text()='Not for Online Sale']")
	private WebElement lineItemThreeNotForOnlineSale;
	
	@FindBy(xpath ="//div[text()='Expired']")
	private WebElement lineItemThreeExpired;
	
	@FindBy(xpath = "//div[text()='Diff Pack Size']")
	private WebElement lineItemThreeDiffPackSize;
	
	@FindBy(xpath = "//div[text()='Not Ordered']")
	private WebElement lineItemThreeNotOrdered;
	
	@FindBy(xpath = "//div[text()='Not Supplied']")
	private WebElement lineItemThreeNotSupplied ;
	
	@FindBy(xpath = "//div[text()='Wrong Batch']")
	private WebElement lineItemThreeWrongBatch;
	
	@FindBy(xpath = "//div[text()='Batch MRP Mismatch']")
	private WebElement lineItemThreeMRPMismatch;
	
	@FindBy(xpath = "//div[text()='Item Master Missing']")
	private WebElement lineItemThreeItemMasterMissing;
	
	@FindBy(xpath = "//div[text()='Short Supply']")
	private WebElement lineItemThreeShortSupply;
	
	
	
	
	
	
	

	@FindBy(xpath = "//td[text()='Diff Amt']//preceding::td[@class='billAmtColumn']//child::P")
	private WebElement captureCalculatedAmount;

	@FindBy(xpath = "//td[text()='Calculated Amt']//preceding::td[@class='billAmtColumn']//child::input")
	private WebElement provideSupplierBillAmount;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button[1]/span")
	private WebElement submitSupplierGRN;

	@FindBy(xpath = "//span[@title='Upload Supplier Invoice Scan Copies']")
	private WebElement clickUploadIcon;
	
	//span[text()='Upload']//preceding::input[@accept='image/*']
	
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
	
	
	//GRN verification 
	
	@FindBy(xpath = "//label[text()='Transaction Id']//following::input[@id='txnNo']")
	private WebElement transactionId;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement clickSearch;

	@FindBy(xpath = "//i[@title='Click to Edit']")
	private WebElement clickEditIcon;
	
	@FindBy(xpath="//td[text()= 'Allow Intransit Lost or Damage']//parent::tr//following::div[@class=\"ui-inputswitch-handle ui-state-default\"]")
	private WebElement AllowIntransitLostOrDamage;
	
	@FindBy(xpath ="//span[text()='Heads Up!']//parent::div//parent::div//parent::p-confirmdialog//child::div//child::button[@label='Yes']")
	private WebElement confirmLostInTransit;

	@FindBy(xpath = "//span[text()='I Verify']")
	private WebElement clickIVerify;

	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement clickApprove;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button/span")
	private WebElement closeCurrentGRNPage;

	
	// GSTIN Number Verification
	

	@FindBy(xpath = "//label[text()='Transaction Id']//following::input[@id='txnNo']")
	private WebElement transactionIdGSTIN;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement clickSearchGSTIN;

	@FindBy(xpath = "//i[@title='Click to Edit']")
	private WebElement clickEditIconGSTIN;

	@FindBy(xpath = "//span[text()='I Verify']")
	private WebElement clickIVerifyGSTIN;

	@FindBy(xpath = "//label[text()='Verified, Invoice is belongs to']")
	private WebElement clickVerifiedInvoice;

	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement clickVerifyGSTIN;

	@FindBy(xpath = "//span[text()='Submit & Print Label']")
	private WebElement clickSubmitAndPrintLabel;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button[3]/span")
	private WebElement closeGSTINVerificationPage;

	
	// PutAway process
	

	@FindBy(xpath = "//label[text()='Transaction Id']//following::input[@id='txnNo']")
	private WebElement transactionIdPutAway;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement clickSearchPutAway;

	@FindBy(xpath = "//i[@title='Click to Edit']")
	private WebElement clickEditIconPutAway;

	@FindBy(xpath = "//td[text()='Putaway Done']//parent::tr//descendant::div[@class='ui-inputswitch-handle ui-state-default']")
	private WebElement clickPutAwayYes;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button[1]/span")
	private WebElement clickSubmitPutaway;

	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/div[2]/purchase-order/div/form/div[3]/button[3]/span")
	private WebElement closePutAwayPage;


	public RW_CreateGDNWithGRNAndDemagedDis(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSwitchFC() {
		return switchFC;
	}

	public WebElement getSelectFC() {
		return selectFC;
	}

	public WebElement getClickSupplierGDN() {
		return clickSupplierGDN;
	}

	public WebElement getClickImportGDN() {
		return clickImportGDN;
	}

	public WebElement getChooseFile() {
		return chooseFile;
	}
	
	public WebElement getChoosefile2() {
		return choosefile2;
	}

	public WebElement getUploadfile() {
		return uploadfile;
	}

	public WebElement getCloseImportGRN() {
		return closeImportGRN;
	}

	public WebElement getCloseGDNPage() {
		return closeGDNPage;
	}
	
//Create New Supplier GRN
	
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
	
	public WebElement getClickPO() {
		return clickPO;
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
	
	public WebElement getLineItemOneBannedDis() {
		return lineItemOneBannedDis;
	}
	
	public WebElement getLineItemOneDamageInTransit() {
		return lineItemOneDamageInTransit;
	}
	
	public WebElement getLineItemOneLostInTransist() {
		return lineItemOneLostInTransist;
	}
	
	public WebElement getLineItemOneMRPMismatchRejected() {
		return lineItemOneMRPMismatchRejected;
	}
	
	public WebElement getLineItemOneMRPMismatchAccpted() {
		return lineItemOneMRPMismatchAccpted;
	}
	
	public WebElement getLineItemOneNotForOnlineSale() {
		return lineItemOneNotForOnlineSale;
	}
	
	public WebElement getLineItemOneExpired() {
		return lineItemOneExpired;
	}
	
	public WebElement getLineItemOneDiffPackSize() {
		return lineItemOneDiffPackSize;
	}
	
	public WebElement getLineItemOneNotOrdered() {
		return lineItemOneNotOrdered;
	}
	
	public WebElement getLineItemOneNotSupplied() {
		return lineItemOneNotSupplied;
	}
	
	public WebElement getLineItemOneWrongBatch() {
		return lineItemOneWrongBatch;
	}
	
	public WebElement getLineItemOneMRPMismatch() {
		return lineItemOneMRPMismatch;
	}
	
	public WebElement getLineItemOneItemMasterMissing() {
		return lineItemOneItemMasterMissing;
	}
	
	public WebElement getLineItemOneShortSupply() {
		return lineItemOneShortSupply;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getSelectDisposition2() {
		return selectDisposition2;
	}

	public WebElement getLineItemTwoDisposition() {
		return lineItemTwoDisposition;
	}
	
	public WebElement getLineItemTwoBannedDis() {
		return lineItemTwoBannedDis;
	}
	public WebElement getLineItemTwoDamageInTransit() {
		return lineItemTwoDamageInTransit;
	}
	
	public WebElement getLineItemTwoLostInTransist() {
		return lineItemTwoLostInTransist;
	}
	
	public WebElement getLineItemTwoMRPMismatchRejected() {
		return lineItemTwoMRPMismatchRejected;
	}
	
	public WebElement getLineItemTwoMRPMismatchAccpted() {
		return lineItemTwoMRPMismatchAccpted;
	}
	
	public WebElement getLineItemTwoNotForOnlineSale() {
		return lineItemTwoNotForOnlineSale;
	}
	
	public WebElement getLineItemTwoExpired() {
		return lineItemTwoExpired;
	}
	
	public WebElement getLineItemTwoDiffPackSize() {
		return lineItemTwoDiffPackSize;
	}
	
	public WebElement getLineItemTwoNotOrdered() {
		return lineItemTwoNotOrdered;
	}
	
	public WebElement getLineItemTwoNotSupplied() {
		return lineItemTwoNotSupplied;
	}
	
	public WebElement getLineItemTwoWrongBatch() {
		return lineItemTwoWrongBatch;
	}
	
	public WebElement getLineItemTwoMRPMismatch() {
		return lineItemTwoMRPMismatch;
	}
	
	public WebElement getLineItemTwoItemMasterMissing() {
		return lineItemTwoItemMasterMissing;
	}
	
	public WebElement getLineItemTwoShortSupply() {
		return lineItemTwoShortSupply;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getSelectDisposition3() {
		return selectDisposition3;
	}

	public WebElement getLineItemThreeDisposition() {
		return lineItemThreeDisposition;
	}
	
	public WebElement getLineItemThreeBannedDis() {
		return lineItemThreeBannedDis;
	}
	
	public WebElement getLineItemThreeDamageInTransit() {
		return lineItemThreeDamageInTransit;
	}
	
	public WebElement getLineItemThreeLostInTransist() {
		return lineItemThreeLostInTransist;
	}
	
	public WebElement getLineItemThreeMRPMismatchRejected() {
		return lineItemThreeMRPMismatchRejected;
	}
	
	public WebElement getLineItemThreeMRPMismatchAccpted() {
		return lineItemThreeMRPMismatchAccpted;
	}
	
	public WebElement getLineItemThreeNotForOnlineSale() {
		return lineItemThreeNotForOnlineSale;
	}
	
	public WebElement getLineItemThreeExpired() {
		return lineItemThreeExpired;
	}
	
	public WebElement getLineItemThreeDiffPackSize() {
		return lineItemThreeDiffPackSize;
	}
	
	public WebElement getLineItemThreeNotOrdered() {
		return lineItemThreeNotOrdered;
	}
	
	public WebElement getLineItemThreeNotSupplied() {
		return lineItemThreeNotSupplied;
	}
	
	public WebElement getLineItemThreeWrongBatch() {
		return lineItemThreeWrongBatch;
	}
	
	public WebElement getLineItemThreeMRPMismatch() {
		return lineItemThreeMRPMismatch;
	}
	
	public WebElement getLineItemThreeItemMasterMissing() {
		return lineItemThreeItemMasterMissing;
	}
	
	public WebElement getLineItemThreeShortSupply() {
		return lineItemThreeShortSupply;
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
	
	//GRN verification 
	
	public WebElement getTransactionId() {
		return transactionId;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getClickEditIcon() {
		return clickEditIcon;
	}
	
	
	public WebElement getAllowIntransitLostOrDamage() {
		return AllowIntransitLostOrDamage;
	}
	
	public WebElement getConfirmLostInTransit() {
		return confirmLostInTransit;
	}
	
	public WebElement getClickIVerify() {
		return clickIVerify;
	}

	public WebElement getClickApprove() {
		return clickApprove;
	}

	public WebElement getCloseCurrentGRNPage() {
		return closeCurrentGRNPage;
	}

	// GSTIN Number Verification

	public WebElement getTransactionIdGSTIN() {
		return transactionId;
	}

	public WebElement getClickSearchGSTIN() {
		return clickSearch;
	}

	public WebElement getClickEditIconGSTIN() {
		return clickEditIcon;
	}

	public WebElement getClickIVerifyGSTIN() {
		return clickIVerifyGSTIN;
	}

	public WebElement getClickVerifiedInvoice() {
		return clickVerifiedInvoice;
	}

	public WebElement getClickVerifyGSTIN() {
		return clickVerifyGSTIN;
	}

	public WebElement getClickSubmitAndPrintLabel() {
		return clickSubmitAndPrintLabel;
	}

	public WebElement getCloseGSTINVerificationPage() {
		return closeGSTINVerificationPage;
	}

	// PutAway process

	public WebElement getTransactionIdPutAway() {
		return transactionIdPutAway;
	}

	public WebElement getClickSearchPutAway() {
		return clickSearchPutAway;
	}

	public WebElement getClickEditIconPutAway() {
		return clickEditIconPutAway;
	}

	public WebElement getClickPutAwayYes() {
		return clickPutAwayYes;
	}

	public WebElement getClickSubmitPutaway() {
		return clickSubmitPutaway;
	}

	public WebElement getClosePutAwayPage() {
		return closePutAwayPage;
	}

	

}
