package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;
import properties.Properties_Writer;
import xl_file.Excel_Writer;

public class RW_CreateGDNWithGRNAndDamageInTrainsitDis extends Common_Methods {
	
	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	
	@Given("User need to switch appropriate FC using FC switcher to create GDN for Damage in Trainsit Disposition")
	public void user_need_to_switch_appropriate_fc_using_fc_switcher_to_create_gdn_for_damage_in_trainsit_disposition() throws Exception {
		
		Thread.sleep(2000);
		getWindHandle();
		Excel_Writer.getExcel_Writer().setExcelDC_Supplier();
		Actions mouse = new Actions(driver);
		
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC());
		mouse.moveToElement(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC()).build().perform();
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
	}

	@When("User need to get into the supplier GDN page for Damage in Trainsit Disposition")
	public void user_need_to_get_into_the_supplier_gdn_page_for_damage_in_trainsit_disposition() throws Exception  {
	
		driverSwitch();
		Thread.sleep(5000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGDN());
	}

	@When("User need to select the import supplierGDN for Damage in Trainsit Disposition")
	public void user_need_to_select_the_import_supplier_gdn_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
	}

	@When("User need to select the correct file for Damage in Trainsit Disposition")
	public void user_need_to_select_the_correct_file_for_damage_in_trainsit_disposition() throws Exception  {
		
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getGDN_FileUploadPath());
	}

	@When("User need to upload the selected file for GDN for Damage in Trainsit Disposition")
	public void user_need_to_upload_the_selected_file_for_gdn_for_damage_in_trainsit_disposition() throws Exception  {

		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getUploadfile());
	}

	@When("User need to close the import GRN page by clicking cross mark for Damage in Trainsit Disposition")
	public void user_need_to_close_the_import_grn_page_by_clicking_cross_mark_for_damage_in_trainsit_disposition() throws Exception  {
	
		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());
	}

	@When("User need to close the GDN page for Damage in Trainsit Disposition")
	public void user_need_to_close_the_gdn_page_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
	}
	
	
	//Create New Supplier GRN
	
	
	@Given("User need to get into the supplier GRN page for Damage in Trainsit Disposition")
	public void user_need_to_get_into_the_supplier_grn_page_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
	}

	@When("User need to provide the supplier name in supplier invoice details for Damage in Trainsit Disposition")
	public void user_need_to_provide_the_supplier_name_in_supplier_invoice_details_for_damage_in_trainsit_disposition() throws Exception  {
		
		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(1000);
		WebElement element = driver
				.findElement(By.xpath(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().get_Supplier_Name()));
		click(element);
	
	}

	@When("User need to provide the supplier invoice number and clikc the suggestion For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_supplier_invoice_number_and_clikc_the_suggestion_for_damage_in_trainsit_disposition() throws Exception {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber(),
				Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
	}

	@When("User need to select supply type by clicking check box For Damage in Trainsit Disposition")
	public void user_need_to_select_supply_type_by_clicking_check_box_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
	}

	@When("User need to click the proceed button For Damage in Trainsit Disposition")
	public void user_need_to_click_the_proceed_button_for_damage_in_trainsit_disposition() throws Exception  {
		
		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
	}

	@When("User need to provide the disposition for all given items For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_disposition_for_all_given_items_for_damage_in_trainsit_disposition() {

		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneDamageInTransit());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneDamageInTransit());
		
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition2());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoDamageInTransit());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoDamageInTransit());
		
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition3());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeDamageInTransit());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeDamageInTransit());
	}

	@When("User need to provide the supplier bill amount For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_supplier_bill_amount_for_damage_in_trainsit_disposition() throws Exception {

		Thread.sleep(2000);
		String supplierAmt = getText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureCalculatedAmount());
		Properties_Writer.getProperties_Writer().setsupplierBillAmt(supplierAmt);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSupplierBillAmount(),
				Configuration_Reader.getCR().getFRM().getsupplierBillAmt());
	}

	@When("User need to click the submit button For Damage in Trainsit Disposition")
	public void user_need_to_click_the_submit_button_for_damage_in_trainsit_disposition()throws Exception {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
	}

	@When("User need to click the upload supplier invoice scan copies For Damage in Trainsit Disposition")
	public void user_need_to_click_the_upload_supplier_invoice_scan_copies_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());
	}

	@When("User need to select the appropriate file For Damage in Trainsit Disposition")
	public void user_need_to_select_the_appropriate_file_for_damage_in_trainsit_disposition() throws Exception {
		
		Thread.sleep(2000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getSupplierSoftCopyPath());
		Thread.sleep(2000);
	}

	@When("User need to upload the selected file For Damage in Trainsit Disposition")
	public void user_need_to_upload_the_selected_file_for_damage_in_trainsit_disposition() throws Exception {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		Thread.sleep(2000);
	}

	@When("User need to verify scan copy with GRN entry totals and line item entries For Damage in Trainsit Disposition")
	public void user_need_to_verify_scan_copy_with_grn_entry_totals_and_line_item_entries_for_damage_in_trainsit_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());
	}

	@When("User need to approve the supplier invoice For Damage in Trainsit Disposition")
	public void user_need_to_approve_the_supplier_invoice_for_damage_in_trainsit_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
	}

	@When("User need to close the supplier invoice page For Damage in Trainsit Disposition")
	public void user_need_to_close_the_supplier_invoice_page_for_damage_in_trainsit_disposition() throws Exception {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
	}

	@When("User need to capture the Txn Id for further process For Damage in Trainsit Disposition")
	public void user_need_to_capture_the_txn_id_for_further_process_for_damage_in_trainsit_disposition() throws Exception {

		String supplierTxnId = getElementText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureTxnID());
		Properties_Writer.getProperties_Writer().setsupplierTxnId(supplierTxnId);
	}

	@When("user need to close the supplier GRN page For Damage in Trainsit Disposition")
	public void user_need_to_close_the_supplier_grn_page_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
	}
	
	//Vendor Margin variance Detected verification For Damage in Trainsit Disposition

	@Given("User need to provide the GRN transaction id in transaction field For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_damage_in_trainsit_disposition() throws Exception {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN using the transection Id For Damage in Trainsit Disposition")
	public void user_need_to_search_grn_using_the_transection_id_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
	}

	@When("User need to click the edit icon for the GRN verification For Damage in Trainsit Disposition")
	public void user_need_to_click_the_edit_icon_for_the_grn_verification_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
	}
	
	@When("User need to Allow Intransit Lost or Damage by clicking Yes button")
	public void user_need_to_allow_intransit_lost_or_damage_by_clicking_yes_button() {
		
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getAllowIntransitLostOrDamage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getAllowIntransitLostOrDamage());
		
	}

	@When("User need to confirm Lost in Transit, Damage in Transit disposition will not added in inventory by clicking Yes")
	public void user_need_to_confirm_lost_in_transit_damage_in_transit_disposition_will_not_added_in_inventory_by_clicking_yes() {
		
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getConfirmLostInTransit());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getConfirmLostInTransit());
	}

	@When("User need to click the I verify button for vendor margin approve For Damage in Trainsit Disposition")
	public void user_need_to_click_the_i_verify_button_for_vendor_margin_approve_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
	}

	@When("User need to click the Approve GRN For Damage in Trainsit Disposition")
	public void user_need_to_click_the_approve_grn_for_damage_in_trainsit_disposition() throws Exception {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		Thread.sleep(2000);
	}

	@When("User need to close the current GRN page For Damage in Trainsit Disposition")
	public void user_need_to_close_the_current_grn_page_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field for GSTIN number verification For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_gstin_number_verification_for_damage_in_trainsit_disposition() throws Exception{

		Thread.sleep(2000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for GSTIN verification For Damage in Trainsit Disposition")
	public void user_need_to_search_grn_for_gstin_verification_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
	}

	@When("User need to click the edit icon for GSTIN number verification For Damage in Trainsit Disposition")
	public void user_need_to_click_the_edit_icon_for_gstin_number_verification_for_damage_in_trainsit_disposition() throws Exception{

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		Thread.sleep(2000);
	}

	@When("User need to click the I verify button GSTIN number verification For Damage in Trainsit Disposition")
	public void user_need_to_click_the_i_verify_button_gstin_number_verification_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
	}

	@When("User need to verify the GSTIN number and click verify button For Damage in Trainsit Disposition")
	public void user_need_to_verify_the_gstin_number_and_click_verify_button_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
	}

	@When("User need to click the submit and print label For Damage in Trainsit Disposition")
	public void user_need_to_click_the_submit_and_print_label_for_damage_in_trainsit_disposition() throws Exception {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		Thread.sleep(3000);
		alert();
	}

	@When("User need to close the current GSTIN verification page For Damage in Trainsit Disposition")
	public void user_need_to_close_the_current_gstin_verification_page_for_damage_in_trainsit_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field for for putaway process For Damage in Trainsit Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_for_putaway_process_for_damage_in_trainsit_disposition() throws Exception {

		Thread.sleep(1000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdPutAway());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdPutAway(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for putaway process For Damage in Trainsit Disposition")
	public void user_need_to_search_grn_for_putaway_process_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchPutAway());
	}

	@When("User need to click the edit icon for for putaway process For Damage in Trainsit Disposition")
	public void user_need_to_click_the_edit_icon_for_for_putaway_process_for_damage_in_trainsit_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconPutAway());
	}

	@When("User need to click putaway done by clicking Yes For Damage in Trainsit Disposition")
	public void user_need_to_click_putaway_done_by_clicking_yes_for_damage_in_trainsit_disposition() throws Exception{

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
	}

	@When("User need to click the submit button for putaway process For Damage in Trainsit Disposition")
	public void user_need_to_click_the_submit_button_for_putaway_process_for_damage_in_trainsit_disposition() throws Exception{
		
		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		Thread.sleep(2000);
	}

	@When("User need to close the putaway process page For Damage in Trainsit Disposition")
	public void user_need_to_close_the_putaway_process_page_for_damage_in_trainsit_disposition() {
		
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
	}


}
