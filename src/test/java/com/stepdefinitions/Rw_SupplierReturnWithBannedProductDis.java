package com.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;

public class Rw_SupplierReturnWithBannedProductDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to get into the supplier return Page for make supplier return")
	public void user_need_to_get_into_the_supplier_return_page_for_make_supplier_return() throws InterruptedException {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickSupplierReturn());
		Thread.sleep(2000);
	}

	@When("User need to provide the supplier name in the supplier field and click the suggestion")
	public void user_need_to_provide_the_supplier_name_in_the_supplier_field_and_click_the_suggestion()
			throws InterruptedException, IOException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickSupplierSearch(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(pageobject.getRw_CreateNewSupplierGRN().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier Tnx Id in the Tnx Id field for find the Txn")
	public void user_need_to_provide_the_supplier_tnx_id_in_the_tnx_id_field_for_find_the_txn() throws IOException {

		waitElementTovisibility(pageobject.getRw_CreateSupplierReturn().getClickTnxId());
		sendkeys(pageobject.getRw_CreateSupplierReturn().getClickTnxId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to click the search button for find supplier")
	public void user_need_to_click_the_search_button_for_find_supplier() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
		click(pageobject.getRw_CreateSupplierReturn().getClickSearchButton());
	}

	@When("User need to select the appropriate Tnx with supplier name")
	public void user_need_to_select_the_appropriate_tnx_with_supplier_name() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
		click(pageobject.getRw_CreateSupplierReturn().getSelectSupplierWithTnxId());
	}

	@When("User need to unselect the exclude ok disposition")
	public void user_need_to_unselect_the_exclude_ok_disposition() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
		click(pageobject.getRw_CreateSupplierReturn().getUnselectExcludeOkdispositions());
	}

	@When("User need to click the make return button for make return")
	public void user_need_to_click_the_make_return_button_for_make_return() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
		click(pageobject.getRw_CreateSupplierReturn().getClickMakeReturn());
	}

//	@When("User need to select the disposition for all given line items")
//	public void user_need_to_select_the_disposition_for_all_given_line_items() throws InterruptedException {
//
//		Thread.sleep(2000);
//		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition1());
//		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemOneBannedProductDis());
//		click(pageobject.getRw_CreateSupplierReturn().getLineItemOneBannedProductDis());
//
//		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition2());
//		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemTwoBannedProductDis());
//		click(pageobject.getRw_CreateSupplierReturn().getLineItemTwoBannedProductDis());
//
//		click(pageobject.getRw_CreateSupplierReturn().getSelectDisposition3());
//		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getLineItemThreeDisposition());
//		click(pageobject.getRw_CreateSupplierReturn().getLineItemThreeBannedProductDis());
//	}

	@When("User need to click the submit button for supplier return")
	public void user_need_to_click_the_submit_button_for_supplier_return() {

		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
		click(pageobject.getRw_CreateSupplierReturn().getSubmitSupplierRuturn());
	}

	@When("User need to close supplier return page")
	public void user_need_to_close_supplier_return_page() throws InterruptedException {

		Thread.sleep(4000);
		waitElementToCickable(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
		click(pageobject.getRw_CreateSupplierReturn().getCloseSupplierReturnpage());
	}

}
