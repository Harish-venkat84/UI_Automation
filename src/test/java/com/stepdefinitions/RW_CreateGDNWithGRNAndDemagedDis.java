package com.stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.commons.configuration2.ex.ConfigurationException;
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

public class RW_CreateGDNWithGRNAndDemagedDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to switch appropriate FC using FC switcher to create GDN")
	public void user_need_to_switch_appropriate_fc_using_fc_switcher_to_create_gdn()
			throws AWTException, IOException, InterruptedException, ConfigurationException {

		Thread.sleep(2000);
		getWindHandle();
		Excel_Writer.getExcel_Writer().setExcelDC_Supplier();
		Actions mouse = new Actions(driver);

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC());
		mouse.moveToElement(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC()).build().perform();
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
	}

	@When("User need to get into the supplier GDN page")
	public void user_need_to_get_into_the_supplier_gdn_page() throws InterruptedException {

		driverSwitch();
		Thread.sleep(5000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGDN());

	}

	@When("User need to select the import supplierGDN")
	public void user_need_to_select_the_import_supplier_gdn() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
	}

	@When("User need to select the correct file")
	public void user_need_to_select_the_correct_file() throws AWTException, IOException, InterruptedException {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getGDN_FileUploadPath());
	}

	@When("User need to upload the selected file for GDN")
	public void user_need_to_upload_the_selected_file_for_gdn() throws InterruptedException {

		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getUploadfile());
	}

	@When("User need to close the import GRN page by clicking cross mark")
	public void user_need_to_close_the_import_grn_page_by_clicking_cross_mark() throws InterruptedException {
		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());

	}

	@When("User need to close the GDN page")
	public void user_need_to_close_the_gdn_page() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());

	}

	// Create New Supplier GRN

	@Given("User need to get into the supplier GRN page for Demaged Disposition")
	public void user_need_to_get_into_the_supplier_grn_page_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
	}

	@When("User need to provide the supplier name in supplier invoice details for Demaged Disposition")
	public void user_need_to_provide_the_supplier_name_in_supplier_invoice_details_for_demaged_disposition()
			throws IOException, ConfigurationException, InterruptedException {

		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(1000);
		WebElement element = driver
				.findElement(By.xpath(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier invoice number and clikc the suggestion for Demaged Disposition")
	public void user_need_to_provide_the_supplier_invoice_number_and_clikc_the_suggestion_for_demaged_disposition()
			throws IOException, InterruptedException {

		Thread.sleep(1000);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber(),
				Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
	}

	@When("User need to select supply type by clicking check box for Demaged Disposition")
	public void user_need_to_select_supply_type_by_clicking_check_box_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
	}

	@When("User need to click the proceed button for Demaged Disposition")
	public void user_need_to_click_the_proceed_button_for_demaged_disposition() throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
	}

	@When("User need to provide the disposition for all given items for Demaged Disposition")
	public void user_need_to_provide_the_disposition_for_all_given_items_for_demaged_disposition() {

		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneDisposition());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneDisposition());

		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition2());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoDisposition());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoDisposition());

		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition3());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeDisposition());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeDisposition());

	}

	@When("User need to provide the supplier bill amount for Demaged Disposition")
	public void user_need_to_provide_the_supplier_bill_amount_for_demaged_disposition()
			throws InterruptedException, ConfigurationException, IOException {

		Thread.sleep(2000);
		String supplierAmt = getText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureCalculatedAmount());
		Properties_Writer.getProperties_Writer().setsupplierBillAmt(supplierAmt);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSupplierBillAmount(),
				Configuration_Reader.getCR().getFRM().getsupplierBillAmt());

	}

	@When("User need to click the submit button for Demaged Disposition")
	public void user_need_to_click_the_submit_button_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
	}

	@When("User need to click the upload supplier invoice scan copies for Demaged Disposition")
	public void user_need_to_click_the_upload_supplier_invoice_scan_copies_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());

	}

	@When("User need to select the appropriate file for Demaged Disposition")
	public void user_need_to_select_the_appropriate_file_for_demaged_disposition()
			throws AWTException, InterruptedException, IOException {

		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getSupplierSoftCopyPath());
		Thread.sleep(2000);
	}

	@When("User need to upload the selected file for Demaged Disposition")
	public void user_need_to_upload_the_selected_file_for_demaged_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		Thread.sleep(2000);
	}

	@When("User need to verify scan copy with GRN entry totals and line item entries for Demaged Disposition")
	public void user_need_to_verify_scan_copy_with_grn_entry_totals_and_line_item_entries_for_demaged_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());

	}

	@When("User need to approve the supplier invoice for Demaged Disposition")
	public void user_need_to_approve_the_supplier_invoice_for_demaged_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
	}

	@When("User need to close the supplier invoice page for Demaged Disposition")
	public void user_need_to_close_the_supplier_invoice_page_for_demaged_disposition() throws InterruptedException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
	}

	@When("User need to capture the Txn Id for further process for Demaged Disposition")
	public void user_need_to_capture_the_txn_id_for_further_process_for_demaged_disposition()
			throws ConfigurationException, IOException {

		String supplierTxnId = getElementText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureTxnID());
		Properties_Writer.getProperties_Writer().setsupplierTxnId(supplierTxnId);
		
	}

	@When("user need to close the supplier GRN page for Demaged Disposition")
	public void user_need_to_close_the_supplier_grn_page_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
	}

	// Verify GRN To Proceed To Take Put away Label Print

	@Given("User need to provide the GRN transaction id in transaction field for Demaged Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_demaged_disposition()
			throws IOException {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
		
	}

	@When("User need to search GRN using the transection Id for Demaged Disposition")
	public void user_need_to_search_grn_using_the_transection_id_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
	}

	@When("User need to click the edit icon for the GRN verification for Demaged Disposition")
	public void user_need_to_click_the_edit_icon_for_the_grn_verification_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
	}

	@When("User need to click the I verify button for vendor margin approve for Demaged Disposition")
	public void user_need_to_click_the_i_verify_button_for_vendor_margin_approve_for_demaged_disposition()
			throws Exception {
		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
	}

	@When("User need to click the Approve GRN for Demaged Disposition")
	public void user_need_to_click_the_approve_grn_for_demaged_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		Thread.sleep(3000);
	}

	@When("User need to close the current GRN page for Demaged Disposition")
	public void user_need_to_close_the_current_grn_page_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
	}

	// GSTIN Number Verification

	@Given("User need to provide the GRN transaction id in transaction field for GSTIN number verification for Demaged Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_gstin_number_verification_for_demaged_disposition()
			throws IOException, InterruptedException {

		Thread.sleep(3000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for GSTIN verification for Demaged Disposition")
	public void user_need_to_search_grn_for_gstin_verification_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
	}

	@When("User need to click the edit icon for GSTIN number verification for Demaged Disposition")
	public void user_need_to_click_the_edit_icon_for_gstin_number_verification_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
	}

	@When("User need to click the I verify button GSTIN number verification for Demaged Disposition")
	public void user_need_to_click_the_i_verify_button_gstin_number_verification_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
	}

	@When("User need to verify the GSTIN number and click verify button for Demaged Disposition")
	public void user_need_to_verify_the_gstin_number_and_click_verify_button_for_demaged_disposition() throws Exception{

		Thread.sleep(3000);
		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
	}

	@When("User need to click the submit and print label for Demaged Disposition")
	public void user_need_to_click_the_submit_and_print_label_for_demaged_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		Thread.sleep(3000);
		alert();
		Thread.sleep(2000);
	}

	@When("User need to close the current GSTIN verification page for Demaged Disposition")
	public void user_need_to_close_the_current_gstin_verification_page_for_demaged_disposition() throws Exception{

		Thread.sleep(1000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
	}

	// Putaway Process

	@Given("User need to provide the GRN transaction id in transaction field for for putaway process for Demaged Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_for_putaway_process_for_demaged_disposition()
			throws IOException, InterruptedException {

		Thread.sleep(2000);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdPutAway(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for putaway process for Demaged Disposition")
	public void user_need_to_search_grn_for_putaway_process_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchPutAway());
	}

	@When("User need to click the edit icon for for putaway process for Demaged Disposition")
	public void user_need_to_click_the_edit_icon_for_for_putaway_process_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconPutAway());
	}

	@When("User need to click putaway done by clicking Yes for Demaged Disposition")
	public void user_need_to_click_putaway_done_by_clicking_yes_for_demaged_disposition() throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
	}

	@When("User need to click the submit button for putaway process for Demaged Disposition")
	public void user_need_to_click_the_submit_button_for_putaway_process_for_demaged_disposition()
			throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		Thread.sleep(2000);
	}

	@When("User need to close the putaway process page for Demaged Disposition")
	public void user_need_to_close_the_putaway_process_page_for_demaged_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
	}

}
