package com.stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;
import properties.Properties_Writer;

public class Rw_CreateNewSupplierGRN extends Common_Methods{
	
	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	@Given("User need to get into the supplier GRN page")
	public void user_need_to_get_into_the_supplier_grn_page() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickSupplierGRN());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickSupplierGRN());
	}

	@When("User need to provide the supplier name in supplier invoice details")
	public void user_need_to_provide_the_supplier_name_in_supplier_invoice_details()
			throws IOException, ConfigurationException, InterruptedException {

		waitvisibilityOfAllElements(pageobject.getRw_CreateNewSupplierGRN().getProvideSuppliername());
		sendkeys(pageobject.getRw_CreateNewSupplierGRN().getProvideSuppliername(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(1500);
		WebElement element = driver.findElement(By.xpath(pageobject.getRw_CreateNewSupplierGRN().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier invoice number and clikc the suggestion")
	public void user_need_to_provide_the_supplier_invoice_number_and_clikc_the_suggestion()
			throws IOException, InterruptedException {

		Thread.sleep(1500);
		sendkeys(pageobject.getRw_CreateNewSupplierGRN().getProvideInvoiceNumber(),
				Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getClickSuggestion());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickSuggestion());
	}

	@When("User need to select supply type by clicking check box")
	public void user_need_to_select_supply_type_by_clicking_check_box() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickSupplyType());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickSupplyType());
	}

	@When("User need to click the proceed button")
	public void user_need_to_click_the_proceed_button() throws Exception{
		
		Thread.sleep(1500);
		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickProceed());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickProceed());
	}

	@When("User need to provide the disposition for all given items")
	public void user_need_to_provide_the_disposition_for_all_given_items() {
		
		waitvisibilityOfAllElements(pageobject.getRw_CreateNewSupplierGRN().getSelectDisposition1());
		click(pageobject.getRw_CreateNewSupplierGRN().getSelectDisposition1());
		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getLineItemOneDisposition());
		click(pageobject.getRw_CreateNewSupplierGRN().getLineItemOneDisposition());
		click(pageobject.getRw_CreateNewSupplierGRN().getSelectDisposition2());
		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getLineItemTwoDisposition());
		click(pageobject.getRw_CreateNewSupplierGRN().getLineItemTwoDisposition());
		click(pageobject.getRw_CreateNewSupplierGRN().getSelectDisposition3());
		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getLineItemThreeDisposition());
		click(pageobject.getRw_CreateNewSupplierGRN().getLineItemThreeDisposition());

	}

	@When("User need to provide the supplier bill amount")
	public void user_need_to_provide_the_supplier_bill_amount()
			throws InterruptedException, ConfigurationException, IOException {

		Thread.sleep(2000);
		String supplierAmt = getText(pageobject.getRw_CreateNewSupplierGRN().getCaptureCalculatedAmount());
		Properties_Writer.getProperties_Writer().setsupplierBillAmt(supplierAmt);
		sendkeys(pageobject.getRw_CreateNewSupplierGRN().getProvideSupplierBillAmount(),
				Configuration_Reader.getCR().getFRM().getsupplierBillAmt());

	}

	@When("User need to click the submit button")
	public void user_need_to_click_the_submit_button() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getSubmitSupplierGRN());
		click(pageobject.getRw_CreateNewSupplierGRN().getSubmitSupplierGRN());
	}

	@When("User need to click the upload supplier invoice scan copies")
	public void user_need_to_click_the_upload_supplier_invoice_scan_copies() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickUploadIcon());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickUploadIcon());

	}

	@When("User need to select the appropriate file")
	public void user_need_to_select_the_appropriate_file() throws AWTException, InterruptedException, IOException {

		Thread.sleep(1000);
		click(pageobject.getRw_CreateNewSupplierGRN().getClickChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getSupplierSoftCopyPath());
		Thread.sleep(2000);
	}

	@When("User need to upload the selected file")
	public void user_need_to_upload_the_selected_file() throws InterruptedException {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickUpload());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickUpload());
		Thread.sleep(1000);
	}

	@When("User need to verify scan copy with GRN entry totals and line item entries")
	public void user_need_to_verify_scan_copy_with_grn_entry_totals_and_line_item_entries() {

		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getVerifyScanCopy());
		click(pageobject.getRw_CreateNewSupplierGRN().getVerifyScanCopy());

	}

	@When("User need to approve the supplier invoice")
	public void user_need_to_approve_the_supplier_invoice() {

		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getApproveScanCopy());
		click(pageobject.getRw_CreateNewSupplierGRN().getApproveScanCopy());
	}

	@When("User need to close the supplier invoice page")
	public void user_need_to_close_the_supplier_invoice_page() throws InterruptedException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierInvoicepage());
		click(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierInvoicepage());
	}

	@When("User need to capture the Txn Id for further process")
	public void user_need_to_capture_the_txn_id_for_further_process() throws ConfigurationException, IOException {

		String supplierTxnId = getElementText(pageobject.getRw_CreateNewSupplierGRN().getCaptureTxnID());
		Properties_Writer.getProperties_Writer().setsupplierTxnId(supplierTxnId);
	}

	@When("user need to close the supplier GRN page")
	public void user_need_to_close_the_supplier_grn_page() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierGRNPage());
		click(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierGRNPage());
	}

	// Verify GRN To Proceed To Take Put away Label Print

	@Given("User need to provide the GRN transaction id in transaction field")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field() throws Exception {

		Thread.sleep(2000);
		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionId());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN using the transection Id")
	public void user_need_to_search_grn_using_the_transection_id() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearch());
		click(pageobject.getRW_GRNVerification().getClickSearch());
	}

	@When("User need to click the edit icon for the GRN verification")
	public void user_need_to_click_the_edit_icon_for_the_grn_verification() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIcon());
		click(pageobject.getRW_GRNVerification().getClickEditIcon());
	}

	@When("User need to click the I verify button for vendor margin approve")
	public void user_need_to_click_the_i_verify_button_for_vendor_margin_approve() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickIVerify());
		click(pageobject.getRW_GRNVerification().getClickIVerify());
	}

	@When("User need to click the Approve GRN")
	public void user_need_to_click_the_approve_grn() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickApprove());
		click(pageobject.getRW_GRNVerification().getClickApprove());
		Thread.sleep(3000);
	}

	@When("User need to close the current GRN page")
	public void user_need_to_close_the_current_grn_page() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getCloseCurrentGRNPage());
		click(pageobject.getRW_GRNVerification().getCloseCurrentGRNPage());
	}

	// GSTIN Number Verification

	@Given("User need to provide the GRN transaction id in transaction field for GSTIN number verification")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_gstin_number_verification()
			throws IOException, InterruptedException {

		Thread.sleep(3000);
		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionIdGSTIN());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionIdGSTIN(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for GSTIN verification")
	public void user_need_to_search_grn_for_gstin_verification() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
		click(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
	}

	@When("User need to click the edit icon for GSTIN number verification")
	public void user_need_to_click_the_edit_icon_for_gstin_number_verification() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
		click(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
	}

	@When("User need to click the I verify button GSTIN number verification")
	public void user_need_to_click_the_i_verify_button_gstin_number_verification() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickIVerifyGSTIN());
		click(pageobject.getRW_GRNVerification().getClickIVerifyGSTIN());
	}

	@When("User need to verify the GSTIN number and click verify button")
	public void user_need_to_verify_the_gstin_number_and_click_verify_button() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickVerifiedInvoice());
		click(pageobject.getRW_GRNVerification().getClickVerifiedInvoice());
		waitElementTovisibility(pageobject.getRW_GRNVerification().getClickVerifyGSTIN());
		click(pageobject.getRW_GRNVerification().getClickVerifyGSTIN());
	}

	@When("User need to click the submit and print label")
	public void user_need_to_click_the_submit_and_print_label() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSubmitAndPrintLabel());
		click(pageobject.getRW_GRNVerification().getClickSubmitAndPrintLabel());
		Thread.sleep(3000);
		alert();
//		Thread.sleep(2000);
	}

	@When("User need to close the current GSTIN verification page")
	public void user_need_to_close_the_current_gstin_verification_page()throws Exception {
		
		Thread.sleep(1000);
		waitElementTovisibility(pageobject.getRW_GRNVerification().getCloseGSTINVerificationPage());
		click(pageobject.getRW_GRNVerification().getCloseGSTINVerificationPage());
	}

	// Putaway Process

	@Given("User need to provide the GRN transaction id in transaction field for for putaway process")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_for_putaway_process()
			throws IOException {

		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionIdPutAway());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionIdPutAway(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for putaway process")
	public void user_need_to_search_grn_for_putaway_process() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
		click(pageobject.getRW_GRNVerification().getClickSearchPutAway());
	}

	@When("User need to click the edit icon for for putaway process")
	public void user_need_to_click_the_edit_icon_for_for_putaway_process() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
		click(pageobject.getRW_GRNVerification().getClickEditIconPutAway());
	}

	@When("User need to click putaway done by clicking Yes")
	public void user_need_to_click_putaway_done_by_clicking_yes() throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickPutAwayYes());
		click(pageobject.getRW_GRNVerification().getClickPutAwayYes());
	}

	@When("User need to click the submit button for putaway process")
	public void user_need_to_click_the_submit_button_for_putaway_process() throws InterruptedException {
		Thread.sleep(3000);

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSubmitPutaway());
		click(pageobject.getRW_GRNVerification().getClickSubmitPutaway());
		Thread.sleep(2000);
	}

	@When("User need to close the putaway process page")
	public void user_need_to_close_the_putaway_process_page() {
		waitElementToCickable(pageobject.getRW_GRNVerification().getClosePutAwayPage());

		click(pageobject.getRW_GRNVerification().getClosePutAwayPage());
	}

	

}
