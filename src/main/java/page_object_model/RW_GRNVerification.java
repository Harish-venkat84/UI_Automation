package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_GRNVerification {

	public WebDriver driver;

	@FindBy(xpath = "//label[text()='Transaction Id']//following::input[@id='txnNo']")
	private WebElement transactionId;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement clickSearch;

	@FindBy(xpath = "//i[@title='Click to Edit']")
	private WebElement clickEditIcon;

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

	@FindBy(xpath = "//span[text()='Putaway Print']//parent::button//parent::div//child::button//child::span[text()='Close']")
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

	public RW_GRNVerification(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTransactionId() {
		return transactionId;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getClickEditIcon() {
		return clickEditIcon;
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
