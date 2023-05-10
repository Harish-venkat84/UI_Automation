package page_object_manager;

import org.openqa.selenium.WebDriver;
import page_object_model.Login_Page;
import page_object_model.RW_Create_New_Supplier;
import page_object_model.RW_Enter_Bank_Details;
import page_object_model.RW_GRNVerification;
import page_object_model.RW_Select_Supplier;
import page_object_model.RW_Sync_SupplierToDC;
import page_object_model.Rw_CreateNewSupplierGRN;
import page_object_model.Rw_SupplierReturn;
import page_object_model.Rw_SupplierReturnWithDemagedDis;
import page_object_model.RW_Business_Unit;
import page_object_model.RW_CreateGDNWithGRNAndDemagedDis;
import page_object_model.RW_CreateNewSupplierGDN;

public class PageObjectManager {

	public WebDriver driver;
	public Login_Page loginPage;
	public RW_Business_Unit businessUnit;
	public RW_Select_Supplier selectSupplier;
	public RW_Create_New_Supplier createNewSupplier;
	public RW_Enter_Bank_Details enterBankDetails;
	public RW_Sync_SupplierToDC Sync_SupplierToDC;
	public RW_CreateNewSupplierGDN CreateGDNWithGRN;
	public RW_GRNVerification GRNVerification;
	public Rw_SupplierReturnWithDemagedDis CreateSupplierReturn;
	public Rw_CreateNewSupplierGRN CreateNewSupplierGRN;
	public RW_CreateGDNWithGRNAndDemagedDis CreateGDNWithGRNAndDemagedDis;
	public Rw_SupplierReturn SupplierReturn;
	public PageObjectManager(WebDriver driver2) {

		if (driver == null) {
			driver = driver2;
		}
	}

	public Login_Page getLoginPage() {

		if (loginPage == null) {
			loginPage = new Login_Page(driver);
		}
		return loginPage;
	}

	public RW_Business_Unit getbusiness_Unit() {

		if (businessUnit == null) {
			businessUnit = new RW_Business_Unit(driver);
		}
		return businessUnit;
	}

	public RW_Select_Supplier getRW_Select_Supplier() {

		if (selectSupplier == null) {
			selectSupplier = new RW_Select_Supplier(driver);
		}
		return selectSupplier;
	}

	public RW_Create_New_Supplier getCreateNewSupplier() {

		if (createNewSupplier == null) {
			createNewSupplier = new RW_Create_New_Supplier(driver);

		}
		return createNewSupplier;
	}

	public RW_Enter_Bank_Details getRW_Enter_Bank_Details() {

		if (enterBankDetails == null) {
			enterBankDetails = new RW_Enter_Bank_Details(driver);
		}
		return enterBankDetails;
	}

	public RW_Sync_SupplierToDC getRW_Sync_SupplierToDC() {

		if (Sync_SupplierToDC == null) {
			Sync_SupplierToDC = new RW_Sync_SupplierToDC(driver);
		}
		return Sync_SupplierToDC;
	}

	public RW_CreateNewSupplierGDN getRW_CreateGDNWithGRN() {

		if (CreateGDNWithGRN == null) {
			CreateGDNWithGRN = new RW_CreateNewSupplierGDN(driver);
		}
		return CreateGDNWithGRN;
	}

	public RW_GRNVerification getRW_GRNVerification() {

		if (GRNVerification == null) {
			GRNVerification = new RW_GRNVerification(driver);
		}
		return GRNVerification;
	}

	public Rw_SupplierReturnWithDemagedDis getRw_CreateSupplierReturn() {

		if (CreateSupplierReturn == null) {
			CreateSupplierReturn = new Rw_SupplierReturnWithDemagedDis(driver);
		}
		return CreateSupplierReturn;
	}

	public Rw_CreateNewSupplierGRN getRw_CreateNewSupplierGRN() {

		if (CreateNewSupplierGRN == null) {
			CreateNewSupplierGRN = new Rw_CreateNewSupplierGRN(driver);
		}
		return CreateNewSupplierGRN;
	}

	public RW_CreateGDNWithGRNAndDemagedDis getRW_CreateGDNWithGRNAndDemagedDis() {

		if (CreateGDNWithGRNAndDemagedDis == null) {
			CreateGDNWithGRNAndDemagedDis = new RW_CreateGDNWithGRNAndDemagedDis(driver);
		}
		return CreateGDNWithGRNAndDemagedDis;
	}
	
	public Rw_SupplierReturn getRw_SupplierReturn() {

		if (SupplierReturn == null) {
			SupplierReturn = new Rw_SupplierReturn(driver);
		}
		return SupplierReturn;
	}
	
	

}
