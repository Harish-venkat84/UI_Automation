package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RW_CreateNewSupplierGDN {

	public WebDriver driver;

	@FindBy(xpath = "//img[@class='tenantIcon menu']")
	private WebElement switchFC;

	@FindBy(xpath = "//span[text()='768 - HX0E - BWDI']//parent::div")
	private WebElement selectFC;

	@FindBy(xpath = "//li[@class='sidebar-list ng-star-inserted']//descendant::span[@class='menu-icon fa fa-truck fa-lg']")
	private WebElement clickSupplierGDN;

	@FindBy(xpath = "//ul[@class='submenu ng-star-inserted']//descendant::a[text()='Import GDN']")
	private WebElement clickImportGDN;

	@FindBy(xpath = "//span[text()='Choose']//parent::span//child::input//parent::span")
	private WebElement chooseFile;

	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement uploadfile;

	@FindBy(xpath = "/html/body/div[1]/rw-root/app-root/div/p-dialog[5]/div/div[1]/a/span")
	private WebElement closeImportGRN;

//	@FindBy(xpath = "//label[text()='Supp.Inv.']//following::rw-partytxnid[@name='suppInv']")
//	private WebElement captureSupplierInvNum;

	@FindBy(xpath = "//span[text()='Cancel GDN']//preceding::span[text()='Close']")
	private WebElement closeGDNPage;

	public RW_CreateNewSupplierGDN(WebDriver driver2) {

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

	public WebElement getUploadfile() {
		return uploadfile;
	}

	public WebElement getCloseImportGRN() {
		return closeImportGRN;
	}

//	public WebElement getCaptureTxnId() {
//		return captureSupplierInvNum;
//	}

	public WebElement getCloseGDNPage() {
		return closeGDNPage;
	}

}
