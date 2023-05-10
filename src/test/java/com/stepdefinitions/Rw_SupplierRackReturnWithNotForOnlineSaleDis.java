package com.stepdefinitions;

import java.io.IOException;
import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import xl_file.File_Reader;

public class Rw_SupplierRackReturnWithNotForOnlineSaleDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to get into supplier return page for make Supplier returns")
	public void user_need_to_get_into_supplier_return_page_for_make_supplier_returns() throws Exception{

		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickSupplierReturn());
		click(pageobject.getRw_SupplierReturn().getClickSupplierReturn());
	}

	@When("User need to cancel New GRN Immediate Return - Select GRN page for get into rack return draft")
	public void user_need_to_cancel_new_grn_immediate_return_select_grn_page_for_get_into_rack_return_draft()
			throws Exception {

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickcancel());
		click(pageobject.getRw_SupplierReturn().getClickcancel());
	}

	@When("User need to provide the Item id and click the suggestion")
	public void user_need_to_provide_the_item_id_and_click_the_suggestion() throws IOException {

		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickItemSearch());
		sendkeys(pageobject.getRw_SupplierReturn().getClickItemSearch(),
				File_Reader.getFile_Reader().cell_TypeFor_int(1, 6));

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickSuggestion());
		click(pageobject.getRw_SupplierReturn().getClickSuggestion());

	}

	@When("User need to provide the Item batch id and click the suggestion")
	public void user_need_to_provide_the_item_batch_id_and_click_the_suggestion() throws Exception {

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickBatch());
		click(pageobject.getRw_SupplierReturn().getClickBatch());
		sendkeys(pageobject.getRw_SupplierReturn().getClickBatch(),
				File_Reader.getFile_Reader().cell_TypeFor_String(1, 8));

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickBatchSuggestion());
		click(pageobject.getRw_SupplierReturn().getClickBatchSuggestion());
		Thread.sleep(4000);
	}

	@When("User need to select appropriate tnx by clicking add icon")
	public void user_need_to_select_appropriate_tnx_by_clicking_add_icon() throws Exception {

		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClickInsideBox());
		click(pageobject.getRw_SupplierReturn().getClickInsideBox());
		pagedown();
		Thread.sleep(1000);
		click(pageobject.getRw_SupplierReturn().clickAddIcon());
	}

	@When("User need to provide the return Qty")
	public void user_need_to_provide_the_return_qty() throws Exception {
		
		
		click(pageobject.getRw_SupplierReturn().getGiveReturnQty());
		selectAll();
		Thread.sleep(1000);
		pressnum();
		
//		Thread.sleep(1000);
//		WebElement text = driver.findElement(By.xpath("//p[text() = '"+
//		Configuration_Reader.getCR().getFRM().getSupplierInvoicNo()
//		+"']//parent::span//parent::td//parent::tr//descendant::span[text() = '5']"));
//		
//		Properties_Writer.getProperties_Writer().setReturnQty(text.getText());
//		
//		WebElement value = driver.findElement(By.xpath("//rw-number-input//child::input//preceding::td//child::span//child::rw-number-input//child::input"));
		
//		waitElementTovisibility(pageobject.getRw_SupplierReturn().getClosenullqty());
//		
//		if (pageobject.getRw_SupplierReturn().getClosenullqty().getText().equals("Close")) {
//
//			pageobject.getRw_SupplierReturn().getClosenullqty().click();
//			
//			Thread.sleep(1000);
//			
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			
//			jsExecutor.executeScript("arguments[0].value='"+text.getText()+"'", value);
//			
//			click(text);
//			
//			Thread.sleep(2000);
//			
////			click(value);
////			sendkeys(value, "5");
//			
//			
//		} else {
//
//		}

	}

	@When("User need to select the appropriate line Item by clicking check box")
	public void user_need_to_select_the_appropriate_line_item_by_clicking_check_box() throws Exception {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickCheckBox());
		click(pageobject.getRw_SupplierReturn().getClickCheckBox());
	}

	@When("User need to click proceed button")
	public void user_need_to_click_proceed_button() throws Exception{

		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickProceedbutton());
		click(pageobject.getRw_SupplierReturn().getClickProceedbutton());
		Thread.sleep(1500);
	}

	@When("User need to provide the disposition for selected line item")
	public void user_need_to_provide_the_disposition_for_selected_line_item()  throws Exception{

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getSelectDisposition());
		click(pageobject.getRw_SupplierReturn().getSelectDisposition());
		waitElementToCickable(pageobject.getRw_SupplierReturn().getProvideDisposition());
		click(pageobject.getRw_SupplierReturn().getProvideDisposition());

	}

	@When("User need to click the Submit button")
	public void user_need_to_click_the_submit_button() throws Exception{
		
		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickSubmitButton());
		click(pageobject.getRw_SupplierReturn().getClickSubmitButton());

	}

	@When("User need to Close the supplier return page")
	public void user_need_to_close_the_supplier_return_page() throws Exception {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_SupplierReturn().getClickClosebutton());
		click(pageobject.getRw_SupplierReturn().getClickClosebutton());
	}

}