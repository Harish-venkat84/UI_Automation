package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;

public class Rw_SupplierReturnWithNotForOnlineSaleDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	
	@Given("User need to get in to the supplier return Page for make supplier return")
	public void user_need_to_get_in_to_the_supplier_return_page_for_make_supplier_return() throws InterruptedException {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		Thread.sleep(2000);
	}

	@When("User need to provide supplier name in the supplier field and click the suggestion")
	public void user_need_to_provide_supplier_name_in_the_supplier_field_and_click_the_suggestion() throws Exception{

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(pageobject.getRw_CreateNewSupplierGRN().get_Supplier_Name()));
		click(element);
	}

	@When("User need to give the supplier Tnx Id in the Tnx Id field for find the Txn")
	public void user_need_to_give_the_supplier_tnx_id_in_the_tnx_id_field_for_find_the_txn() throws Exception {

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getClickTnxId());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickTnxId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to click the search buttons for find supplier")
	public void user_need_to_click_the_search_buttons_for_find_supplier() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
		click(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
	}

	@When("User need to select the appropriate Tnx with supplier names")
	public void user_need_to_select_the_appropriate_tnx_with_supplier_names() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
		click(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
	}

	@When("User need to unselect exclude ok disposition")
	public void user_need_to_unselect_exclude_ok_disposition() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
		click(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
	}

	@When("User need to click the make return button for make supplier return")
	public void user_need_to_click_the_make_return_button_for_make_supplier_return() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
	}

	@When("User need to click the submit button for suppliers return")
	public void user_need_to_click_the_submit_button_for_suppliers_return() throws Throwable{
		Thread.sleep(2000);

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
		click(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
	}

	@When("User need to close the new supplier return page")
	public void user_need_to_close_the_new_supplier_return_page() throws Exception{

		Thread.sleep(4000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
		click(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
	}
	
}
