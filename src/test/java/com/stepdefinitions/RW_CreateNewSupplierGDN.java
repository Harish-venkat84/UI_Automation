package com.stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.openqa.selenium.interactions.Actions;
import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;
import xl_file.Excel_Writer;

public class RW_CreateNewSupplierGDN extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to switch appropriate FC using FC switcher")
	public void user_need_to_switch_appropriate_fc_using_fc_switcher()
			throws AWTException, IOException, InterruptedException, ConfigurationException {
		
		Thread.sleep(1500);
		
		getWindHandle();
		Excel_Writer.getExcel_Writer().setExcelDC_Supplier();
		Actions mouse = new Actions(driver);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRN().getSwitchFC());
		mouse.moveToElement(pageobject.getRW_CreateGDNWithGRN().getSwitchFC()).build().perform();
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRN().getSelectFC());
		click(pageobject.getRW_CreateGDNWithGRN().getSelectFC());
	}

	@When("User need to get into the supplier GDN")
	public void user_need_to_get_into_the_supplier_gdn() throws InterruptedException {

		driverSwitch();
		Thread.sleep(3000);
		click(pageobject.getRW_CreateGDNWithGRN().getClickSupplierGDN());

	}

	@When("User need to select the import GDN")
	public void user_need_to_select_the_import_gdn() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRN().getClickImportGDN());
		click(pageobject.getRW_CreateGDNWithGRN().getClickImportGDN());
	}

	@When("User need to choose the appropriate file")
	public void user_need_to_choose_the_appropriate_file() throws AWTException, IOException, InterruptedException {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRN().getChooseFile());
		click(pageobject.getRW_CreateGDNWithGRN().getChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getGDN_FileUploadPath());
	}

	@When("User need to upload the choosen file")
	public void user_need_to_upload_the_choosen_file() throws InterruptedException {

		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRN().getUploadfile());
	}

	@When("User need to close the import GRN page")
	public void user_need_to_close_the_import_grn_page() throws InterruptedException {
		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRN().getCloseImportGRN());

	}
	
	@When("User need to close GDN page")
	public void user_need_to_close_gdn_page() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRN().getCloseGDNPage());
		click(pageobject.getRW_CreateGDNWithGRN().getCloseGDNPage());

	}
}

