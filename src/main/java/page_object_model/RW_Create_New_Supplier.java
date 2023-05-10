package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_Create_New_Supplier {

	public WebDriver diver;

	@FindBy(xpath = "//span[text()='New Supplier']")
	private WebElement clickSupplier;

	@FindBy(xpath = "//div[@class= 'ui-md-8 ui-lg-4']//descendant::input[@id= 'supplierName']")
	private WebElement supplierName;

	@FindBy(xpath = "//div[@class= 'ui-md-4 ui-lg-2']//descendant::input[@id= 'supplierShortName']")
	private WebElement supplierShortName;

	@FindBy(xpath = "//div[@class= 'noMargin']//descendant::input[@id= 'gstin']")
	private WebElement GSTIN;
	
	@FindBy(xpath = "//*[@id='gstinTradeName']")
	private WebElement gstTradeName;

	@FindBy(xpath = "//div[@class= 'noMargin']//descendant::input[@id= 'panNo']")
	private WebElement panNumber;

	@FindBy(xpath = "//div[@class= 'noMargin']//descendant::input[@name= 'panName']")
	private WebElement panName;

	@FindBy(xpath = "//label[text() ='Opening Balance Status']//preceding::label[text() = '--SELECT--']")
	private WebElement partyType;

	@FindBy(xpath = "//span[text() = 'OG']")
	private WebElement selectPartyType;

	@FindBy(xpath = "//label[text() ='Opening Balance Status']//following::label[text() = '--SELECT--']")
	private WebElement supplyType;

	@FindBy(xpath = "//span[text() = 'OTC']")
	private WebElement selectSupplyType;

	@FindBy(xpath = "//input[@name= 'contactName']")
	private WebElement contactName;

	@FindBy(xpath = "//input[@id= 'address1']")
	private WebElement address1;

	@FindBy(xpath = "//input[@id= 'city']")
	private WebElement cityName;

	@FindBy(xpath = "//label[text() = 'State']//following::span[text() = '-Select-']")
	private WebElement state;

	@FindBy(xpath = "//div[text() ='Tamil Nadu']")
	private WebElement selectState;
	
	@FindBy (xpath ="//div[text()='Maharashtra']")
	private WebElement selectMaharashtraState;

	@FindBy(xpath = "//input[@id= 'pin']")
	private WebElement pinCode;

	@FindBy(xpath = "//input[@id= 'mobile1']")
	private WebElement mobileNo1;

	@FindBy(xpath = "//input[@id= 'email']")
	private WebElement email;

	@FindBy(xpath = "//label[text() = 'GDN Flag']//parent::div//child::span")
	private WebElement GDNFlag;
	
	@FindBy (xpath = "//label[text() = 'GDN Flag']//parent::div//child::span//parent::div")
	private WebElement GDNFlagSelect;

//	@FindBy(xpath = "//label[text() = 'VMS Flag']//parent::div//child::span")
//	private WebElement VMSFlag;
//	
//	@FindBy(xpath = "//label[text() = 'VMS Flag']//parent::div//child::span//parent::div")
//	private WebElement VMSFlagSelect;

	@FindBy(xpath = "//span[text()= 'Save Supplier Details']")
	private WebElement saveSupplierDetails;
	
	@FindBy(xpath = "//span[text() = 'Info']//parent::div//child::p[text() = 'Supplier Created successfully']//parent::div//parent::div//child::div[1]")
	private WebElement supplierPopup;
	
	@FindBy(xpath = "//input[@id= 'supplierId']")
	private WebElement captureNewSupplierID;
	
	@FindBy(xpath = "//div[@style= 'text-align:right; margin-top:5px;']//child::button//child::span")
	private WebElement closeSupplierpage;
	
	public RW_Create_New_Supplier(WebDriver driver2) {

		this.diver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getClickSupplier() {
		return clickSupplier;
	}

	public WebElement getSupplierName() {
		return supplierName;
	}

	public WebElement getSupplierShortName() {
		return supplierShortName;
	}

	public WebElement getGSTIN() {
		return GSTIN;
	}
	
	public WebElement getGstTradeName() {
		return gstTradeName;
	}

	public WebElement getPanNumber() {
		return panNumber;
	}

	public WebElement getPanName() {
		return panName;
	}

	public WebElement getPartyType() {
		return partyType;
	}

	public WebElement getSelectPartyType() {
		return selectPartyType;
	}

	public WebElement getSupplyType() {
		return supplyType;
	}

	public WebElement getSelectSupplyType() {
		return selectSupplyType;
	}

	public WebElement getContactName() {
		return contactName;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getState() {
		return state;
	}
	
	public WebElement getSelectState() {
		return selectState;
	}
	
	public WebElement getSelectMaharashtraState() {
		return selectMaharashtraState;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getMobileNo1() {
		return mobileNo1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGDNFlag() {
		return GDNFlag;
	}
	
	public WebElement getGDNFlagSelect() {
		return GDNFlagSelect;
	}

//	public WebElement getVMSFlag() {
//		return VMSFlag;
//	}
//	
//	public WebElement getVMSFlagSelect() {
//		return VMSFlagSelect;
//	}

	public WebElement getSaveSupplierDetails() {
		return saveSupplierDetails;
	}
	
	public WebElement getSupplierPopup() {
		return supplierPopup;
	}
	
	public WebElement getCaptureNewSupplierID() {
		return captureNewSupplierID;
	}
	
	public WebElement getCloseSupplierpage() {
		return closeSupplierpage;
	}
}
