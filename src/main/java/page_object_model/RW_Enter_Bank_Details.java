package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_Enter_Bank_Details {

	public WebDriver driver;
	public static String search = "//label[text() = 'Supplier Name']//preceding::td//child::input";

	@FindBy(xpath = "//label[text() = 'Supplier Name']//preceding::td//child::input")
	private WebElement searchSupplierID;

	@FindBy(xpath = "//span[text() = 'Search']")
	private WebElement clickSearch;

	@FindBy(xpath = "//i[@class='fa fa-pencil ng-star-inserted']")
	private WebElement supplierEditOption;

	@FindBy(xpath = "//span[text()='Bank Detail']")
	private WebElement clickingBankDetails;

	@FindBy(xpath = "//input[@name='benificiaryName']")
	private WebElement beneficiaryName;

	@FindBy(xpath = "//input[@id='accountNo']")
	private WebElement enterACNumber;

	@FindBy(xpath = "//label[text() = 'A/C Number (Re-Confirm)']//parent::div//child::input")
	private WebElement reenterACNumber;

	@FindBy(xpath = "//input[@name='bankName']")
	private WebElement enterBankName;

	@FindBy(xpath = "//input[@name='ifscCode']")
	private WebElement enterIFSCCode;

	@FindBy(xpath = "//input[@name='acType']")
	private WebElement enterACType;

	@FindBy(xpath = "//input[@id='benificiaryaddress1']")
	private WebElement enterBeneficiaryAddress;

	@FindBy(xpath = "//label[text()='Active']//parent::div//descendant::p-checkbox")
	private WebElement bankActiveCheckBox;

	@FindBy(xpath = "//span[text()='Save Account Details']")
	private WebElement saveAccountdetails;

	@FindBy(xpath = "//span[text()='Approve Account Details']")
	private WebElement approveAccountDetails;

	@FindBy(xpath = "//span[text()='Yes']")
	private WebElement confirmBankVerified;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-growl/div/div[1]/div/div[1]")
	private WebElement supplierAccountUpdatePopup1;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-growl/div/div[2]/div/div[1]")
	private WebElement supplierAccountUpdatePopup2;

	@FindBy(xpath = "//span[text()='Save Supplier Details']")
	private WebElement bankpageSaveSupplierDetails;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-growl/div/div[1]/div/div[1]")
	private WebElement bankDetailsPopUp;

	@FindBy(xpath = "//span[text()='Yes']//parent::button")
	private WebElement syncCompartmnents;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-growl/div/div[2]/div/div[1]")
	private WebElement syncCompartmnentsPopUp;

	@FindBy(xpath = "//div[@style='text-align:right; margin-top:5px;']//child::button")
	private WebElement closeBankDetailsPage;

	public RW_Enter_Bank_Details(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchSupplierID() {
		return searchSupplierID;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getSupplierEditOption() {
		return supplierEditOption;
	}

	public WebElement getClickingBankDetails() {
		return clickingBankDetails;
	}

	public WebElement getBeneficiaryName() {
		return beneficiaryName;
	}

	public WebElement getEnterACNumber() {
		return enterACNumber;
	}

	public WebElement getReenterACNumber() {
		return reenterACNumber;
	}

	public WebElement getEnterBankName() {
		return enterBankName;
	}

	public WebElement getEnterIFSCCode() {
		return enterIFSCCode;
	}

	public WebElement getEnterACType() {
		return enterACType;
	}

	public WebElement getEnterBeneficiaryAddress() {
		return enterBeneficiaryAddress;
	}

	public WebElement getBankActiveCheckBox() {
		return bankActiveCheckBox;
	}

	public WebElement getSavebankdetails() {
		return saveAccountdetails;
	}

	public WebElement getApproveAccountDetails() {
		return approveAccountDetails;
	}

	public WebElement getConfirmBankVerified() {
		return confirmBankVerified;
	}

	public WebElement getSupplierAccountUpdatePopup1() {
		return supplierAccountUpdatePopup1;
	}

	public WebElement getSupplierAccountUpdatePopup2() {
		return supplierAccountUpdatePopup2;
	}

	public WebElement getBankpageSaveSupplierDetails() {
		return bankpageSaveSupplierDetails;
	}

	public WebElement getBankDetailsPopUp() {
		return bankDetailsPopUp;
	}

	public WebElement getSyncCompartmnents() {
		return syncCompartmnents;
	}

	public WebElement getSyncCompartmnentsPopUp() {
		return syncCompartmnentsPopUp;
	}

	public WebElement getCloseBankDetailsPage() {
		return closeBankDetailsPage;
	}
}
