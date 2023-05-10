package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;

public class RW_SupplierReturnWithExpiredDis extends Common_Methods{

	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	@Given("User need to get into new supplier return Page for make supplier return")
	public void user_need_to_get_into_new_supplier_return_page_for_make_supplier_return() throws Exception {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		Thread.sleep(2000);
	}

	@When("User need to provide supplier name in supplier field and click the suggestion")
	public void user_need_to_provide_supplier_name_in_supplier_field_and_click_the_suggestion() throws Exception {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(pageobject.getRw_CreateNewSupplierGRN().get_Supplier_Name()));
		click(element);
	}

	@When("User need to give the supplier Tnx Ids in the Tnx Id field for find the Txn")
	public void user_need_to_give_the_supplier_tnx_ids_in_the_tnx_id_field_for_find_the_txn() throws Exception{

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getClickTnxId());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickTnxId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to click the search buttons for figure out supplier")
	public void user_need_to_click_the_search_buttons_for_figure_out_supplier() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
		click(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
	}

	@When("User need to select the appropriate Tnxs with supplier names")
	public void user_need_to_select_the_appropriate_tnxs_with_supplier_names() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
		click(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
	}

	@When("User need to un-select exclude ok disposition")
	public void user_need_to_un_select_exclude_ok_disposition() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
		click(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
	}

	@When("User need to click the make return button for make supplier returns")
	public void user_need_to_click_the_make_return_button_for_make_supplier_returns() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
	}

	@When("User need to click submit button for suppliers return")
	public void user_need_to_click_submit_button_for_suppliers_return() throws Exception{
		Thread.sleep(2000);

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
		click(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
	}

	@When("User need to close new supplier return page")
	public void user_need_to_close_new_supplier_return_page() throws Exception{

		Thread.sleep(4000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
		click(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
	}
	
	
	
}
