package com.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;

public class Rw_SupplierReturnWithBatchMRPMismatchDis extends Common_Methods{
	
	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to get into the suppliers return Page for make supplier return")
	public void user_need_to_get_into_the_suppliers_return_page_for_make_supplier_return() throws Exception {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		Thread.sleep(2000);
	}

	@When("User need to provide the supplier name in the supplier field & click the suggestion")
	public void user_need_to_provide_the_supplier_name_in_the_supplier_field_click_the_suggestion() throws Throwable {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(pageobject.getRw_CreateNewSupplierGRN().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier Tnx Id in the Tnx Id field for find the supplier Txn")
	public void user_need_to_provide_the_supplier_tnx_id_in_the_tnx_id_field_for_find_the_supplier_txn() throws IOException {

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getClickTnxId());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickTnxId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to click the search button for find suppliers")
	public void user_need_to_click_the_search_button_for_find_suppliers() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
		click(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
	}

	@When("User need to select the appropriate Tnx with correct suppliers name")
	public void user_need_to_select_the_appropriate_tnx_with_correct_suppliers_name() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
		click(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
	}

	@When("User need to un-select the exclude ok disposition")
	public void user_need_to_un_select_the_exclude_ok_disposition() {
		
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
		click(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
	}

	@When("User need to click make return button for make return")
	public void user_need_to_click_make_return_button_for_make_return() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
	}
	
	
	@When("user need to select the dispostion for all given line items")
	public void user_need_to_select_the_dispostion_for_all_given_line_items() throws Exception {
		
		Thread.sleep(2000);
		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition1());
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemOneBatchMRPMismatch());
		click(pageobject.getRw_CreateSupplierReturn().getLineItemOneBatchMRPMismatch());

		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition2());
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemTwoBatchMRPMismatch());
		click(pageobject.getRw_CreateSupplierReturn().getLineItemTwoBatchMRPMismatch());

		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition3());
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemThreeBatchMRPMismatch());
		click(pageobject.getRw_CreateSupplierReturn().getLineItemThreeBatchMRPMismatch());
	}

	@When("User need to click submit button for supplier return")
	public void user_need_to_click_submit_button_for_supplier_return() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
		click(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
	}

	@When("User need to close the supplier return page's")
	public void user_need_to_close_the_supplier_return_page_s() throws Exception{

		Thread.sleep(4000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
		click(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
	}
}
