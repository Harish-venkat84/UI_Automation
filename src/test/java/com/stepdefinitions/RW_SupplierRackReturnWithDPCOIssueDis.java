package com.stepdefinitions;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import xl_file.File_Reader;

public class RW_SupplierRackReturnWithDPCOIssueDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	
	@Given("user Need To Get into supplier return page for make Supplier Rack returns")
	public void user_need_to_get_into_supplier_return_page_for_make_supplier_rack_returns() {
		
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_SupplierReturn().getClickSupplierReturn());
	}

	@When("user Need To Cancel new GRN Immediate Return - Select GRN page for get into rack Return draft")
	public void user_need_to_cancel_new_grn_immediate_return_select_grn_page_for_get_into_rack_return_draft() {

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickcancel());
		click(pageobject.getRw_SupplierReturn().getClickcancel());
	}

	@When("user Need To Provide the Item Id and click the Suggestion")
	public void user_need_to_provide_the_item_id_and_click_the_suggestion() throws Exception {

		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickItemSearch());
		sendkeys(pageobject.getRw_SupplierReturn().getClickItemSearch(),
				File_Reader.getFile_Reader().cell_TypeFor_int(1, 6));

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickSuggestion());
		click(pageobject.getRw_SupplierReturn().getClickSuggestion());
	}

	@When("user Need To Provide the Item batch Id and click the Suggestion")
	public void user_need_to_provide_the_item_batch_id_and_click_the_suggestion() throws Exception{

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickBatch());
		click(pageobject.getRw_SupplierReturn().getClickBatch());
		sendkeys(pageobject.getRw_SupplierReturn().getClickBatch(),
				File_Reader.getFile_Reader().cell_TypeFor_String(1, 8));

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickBatchSuggestion());
		click(pageobject.getRw_SupplierReturn().getClickBatchSuggestion());
		Thread.sleep(4000);
	}

	@When("user Need To Select appropriate tnx by clicking Add Icon")
	public void user_need_to_select_appropriate_tnx_by_clicking_add_icon() throws Exception{

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickInsideBox());
		click(pageobject.getRw_SupplierReturn().getClickInsideBox());
		pagedown();
		Thread.sleep(1000);
		click(pageobject.getRw_SupplierReturn().clickAddIcon());
	}

	@When("user Need To Provide the return Qty")
	public void user_need_to_provide_the_return_qty() throws Exception{

		click(pageobject.getRw_SupplierReturn().getGiveReturnQty());
		selectAll();
		Thread.sleep(1000);
		pressnum();	
	}

	@When("user Need To Select the appropriate line Item by clicking Check Box")
	public void user_need_to_select_the_appropriate_line_item_by_clicking_check_box() throws Exception{

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickCheckBox());
		click(pageobject.getRw_SupplierReturn().getClickCheckBox());
	}

	@When("user Need To click Proceed button")
	public void user_need_to_click_proceed_button() {

		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickProceedbutton());
		click(pageobject.getRw_SupplierReturn().getClickProceedbutton());
	}

	@When("user Need To Provide the disposition for selected Line Item")
	public void user_need_to_provide_the_disposition_for_selected_line_item() throws Exception{

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getSelectDisposition());
		click(pageobject.getRw_SupplierReturn().getSelectDisposition());
		waitElementToCickable(pageobject.getRw_SupplierReturn().getDPCOIssueDisposition());
		click(pageobject.getRw_SupplierReturn().getDPCOIssueDisposition());
	}

	@When("user Need To Click The Submit button")
	public void user_need_to_click_the_submit_button() throws Exception{

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickSubmitButton());
		click(pageobject.getRw_SupplierReturn().getClickSubmitButton());
	}

	@When("user Need To Close The supplier Return Page")
	public void user_need_to_close_the_supplier_return_page() throws Exception{

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickClosebutton());
		click(pageobject.getRw_SupplierReturn().getClickClosebutton());
	}

}
