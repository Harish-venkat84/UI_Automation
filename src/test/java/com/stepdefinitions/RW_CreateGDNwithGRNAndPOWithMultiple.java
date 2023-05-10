package com.stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;
import properties.Properties_Writer;
import purchase_order.PurchasOrder;
import xl_file.Excel_Writer;

public class RW_CreateGDNwithGRNAndPOWithMultiple extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);
	
	
	// create new Purchase order

	@When("User need to create a new purchase order using API payload")
	public void user_need_to_create_a_new_purchase_order_using_api_payload()
			throws StreamReadException, DatabindException, IOException, ConfigurationException {

		PurchasOrder.payload();
	}
	

	@Given("User need to switch appropriate FC using FC switcher to create GDN for PO")
	public void user_need_to_switch_appropriate_fc_using_fc_switcher_to_create_gdn_for_po()
			throws IOException, ConfigurationException, InterruptedException {

		Thread.sleep(1000);
		getWindHandle();
		Excel_Writer.getExcel_Writer().setExcelDC_Supplier();
		Actions mouse = new Actions(driver);

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC());
		mouse.moveToElement(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSwitchFC()).build().perform();
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectFC());
	}

	@When("User need to get into the supplier GDN page for PO")
	public void user_need_to_get_into_the_supplier_gdn_page_for_po() throws InterruptedException {

		driverSwitch();
		Thread.sleep(4000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGDN());
	}

	@When("User need to select the import supplierGDN for PO")
	public void user_need_to_select_the_import_supplier_gdn_for_po() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
	}

	@When("User need to select the correct file for PO")
	public void user_need_to_select_the_correct_file_for_po() throws AWTException, InterruptedException, IOException {

		
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getGDN_FileUploadPath());
	}

	@When("User need to upload the selected file for GDN for PO")
	public void user_need_to_upload_the_selected_file_for_gdn_for_po() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getUploadfile());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getUploadfile());
	}

	@When("User need to close the import GRN page by clicking cross mark for PO")
	public void user_need_to_close_the_import_grn_page_by_clicking_cross_mark_for_po() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());
	}

	@When("User need to close the GDN page for PO")
	public void user_need_to_close_the_gdn_page_for_po() throws ConfigurationException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());

	}

// Create Supplier GRN

	@Given("User need to get into the supplier GRN page for For PO")
	public void user_need_to_get_into_the_supplier_grn_page_for_for_po() throws ConfigurationException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
	}

	@When("User need to provide the supplier name in supplier invoice details For PO")
	public void user_need_to_provide_the_supplier_name_in_supplier_invoice_details_for_po()
			throws IOException, InterruptedException {

		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(1000);
		WebElement element = driver
				.findElement(By.xpath(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier invoice number and clikc the suggestion For PO")
	public void user_need_to_provide_the_supplier_invoice_number_and_clikc_the_suggestion_for_po()
			throws InterruptedException, IOException {

		Thread.sleep(1000);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber(),
				Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
	}

	@When("User need to provide the PO Number in the PO field")
	public void user_need_to_provide_the_po_number_in_the_po_field() throws InterruptedException, IOException {

		Thread.sleep(2000);

		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPO(),
				Configuration_Reader.getCR().getFRM().getPurchesOrderID());

		Thread.sleep(2000);
	}

	@When("User need to select supply type by clicking check box For PO")
	public void user_need_to_select_supply_type_by_clicking_check_box_for_po() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
	}

	@When("User need to click the proceed button For PO")
	public void user_need_to_click_the_proceed_button_for_po() throws InterruptedException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
	}

	@When("User need to provide the disposition for all given items For PO")
	public void user_need_to_provide_the_disposition_for_all_given_items_for_po() {

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

	@When("User need to provide the supplier bill amount For PO")
	public void user_need_to_provide_the_supplier_bill_amount_for_po()
			throws InterruptedException, ConfigurationException, IOException {

		Thread.sleep(2000);
		String supplierAmt = getText(pageobject.getRw_CreateNewSupplierGRN().getCaptureCalculatedAmount());
		Properties_Writer.getProperties_Writer().setsupplierBillAmt(supplierAmt);
		sendkeys(pageobject.getRw_CreateNewSupplierGRN().getProvideSupplierBillAmount(),
				Configuration_Reader.getCR().getFRM().getsupplierBillAmt());
	}

	@When("User need to click the submit button For PO")
	public void user_need_to_click_the_submit_button_for_po() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getSubmitSupplierGRN());
		click(pageobject.getRw_CreateNewSupplierGRN().getSubmitSupplierGRN());
	}

	@When("User need to click the upload supplier invoice scan copies For PO")
	public void user_need_to_click_the_upload_supplier_invoice_scan_copies_for_po() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickUploadIcon());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickUploadIcon());
	}

	@When("User need to select the appropriate file For PO")
	public void user_need_to_select_the_appropriate_file_for_po()
			throws InterruptedException, AWTException, IOException {

		Thread.sleep(3000);
		click(pageobject.getRw_CreateNewSupplierGRN().getClickChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getSupplierSoftCopyPath());
		Thread.sleep(2000);
	}

	@When("User need to upload the selected file For PO")
	public void user_need_to_upload_the_selected_file_for_po() throws InterruptedException {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getClickUpload());
		click(pageobject.getRw_CreateNewSupplierGRN().getClickUpload());
		Thread.sleep(2000);
	}

	@When("User need to verify scan copy with GRN entry totals and line item entries For PO")
	public void user_need_to_verify_scan_copy_with_grn_entry_totals_and_line_item_entries_for_po() {

		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getVerifyScanCopy());
		click(pageobject.getRw_CreateNewSupplierGRN().getVerifyScanCopy());
	}

	@When("User need to approve the supplier invoice For PO")
	public void user_need_to_approve_the_supplier_invoice_for_po() {

		waitElementTovisibility(pageobject.getRw_CreateNewSupplierGRN().getApproveScanCopy());
		click(pageobject.getRw_CreateNewSupplierGRN().getApproveScanCopy());
	}

	@When("User need to close the supplier invoice page For PO")
	public void user_need_to_close_the_supplier_invoice_page_for_po() throws InterruptedException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierInvoicepage());
		click(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierInvoicepage());
	}

	@When("User need to capture the Txn Id for further process For PO")
	public void user_need_to_capture_the_txn_id_for_further_process_for_po()
			throws ConfigurationException, IOException {

		String supplierTxnId = getElementText(pageobject.getRw_CreateNewSupplierGRN().getCaptureTxnID());
		Properties_Writer.getProperties_Writer().setsupplierTxnId(supplierTxnId);
	}

	@When("user need to close the supplier GRN page For PO")
	public void user_need_to_close_the_supplier_grn_page_for_po() {

		waitElementToCickable(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierGRNPage());
		click(pageobject.getRw_CreateNewSupplierGRN().getCloseSupplierGRNPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field For PO")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_po() throws IOException {

		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionId());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN using the transection Id For PO")
	public void user_need_to_search_grn_using_the_transection_id_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearch());
		click(pageobject.getRW_GRNVerification().getClickSearch());

	}

	@When("User need to click the edit icon for the GRN verification For PO")
	public void user_need_to_click_the_edit_icon_for_the_grn_verification_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIcon());
		click(pageobject.getRW_GRNVerification().getClickEditIcon());
	}

	@When("User need to click the I verify button for vendor margin approve For PO")
	public void user_need_to_click_the_i_verify_button_for_vendor_margin_approve_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickIVerify());
		click(pageobject.getRW_GRNVerification().getClickIVerify());
	}

	@When("User need to click the Approve GRN For PO")
	public void user_need_to_click_the_approve_grn_for_po() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickApprove());
		click(pageobject.getRW_GRNVerification().getClickApprove());
		Thread.sleep(3000);
	}

	@When("User need to close the current GRN page For PO")
	public void user_need_to_close_the_current_grn_page_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getCloseCurrentGRNPage());
		click(pageobject.getRW_GRNVerification().getCloseCurrentGRNPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field for GSTIN number verification For PO")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_gstin_number_verification_for_po()
			throws InterruptedException, IOException {

		Thread.sleep(3000);
		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionIdGSTIN());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionIdGSTIN(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for GSTIN verification For PO")
	public void user_need_to_search_grn_for_gstin_verification_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
		click(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
	}

	@When("User need to click the edit icon for GSTIN number verification For PO")
	public void user_need_to_click_the_edit_icon_for_gstin_number_verification_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
		click(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
	}

	@When("User need to click the I verify button GSTIN number verification For PO")
	public void user_need_to_click_the_i_verify_button_gstin_number_verification_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickIVerifyGSTIN());
		click(pageobject.getRW_GRNVerification().getClickIVerifyGSTIN());
	}

	@When("User need to verify the GSTIN number and click verify button For PO")
	public void user_need_to_verify_the_gstin_number_and_click_verify_button_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickVerifiedInvoice());
		click(pageobject.getRW_GRNVerification().getClickVerifiedInvoice());
		waitElementTovisibility(pageobject.getRW_GRNVerification().getClickVerifyGSTIN());
		click(pageobject.getRW_GRNVerification().getClickVerifyGSTIN());
	}

	@When("User need to click the submit and print label For PO")
	public void user_need_to_click_the_submit_and_print_label_for_po() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSubmitAndPrintLabel());
		click(pageobject.getRW_GRNVerification().getClickSubmitAndPrintLabel());
		Thread.sleep(3000);
		alert();
		Thread.sleep(2000);
	}

	@When("User need to close the current GSTIN verification page For PO")
	public void user_need_to_close_the_current_gstin_verification_page_for_po() {

		waitElementTovisibility(pageobject.getRW_GRNVerification().getCloseGSTINVerificationPage());
		click(pageobject.getRW_GRNVerification().getCloseGSTINVerificationPage());
	}

	// putaway process

	@Given("User need to provide the GRN transaction id in transaction field for for putaway process For PO")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_for_putaway_process_for_po()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		waitElementTovisibility(pageobject.getRW_GRNVerification().getTransactionIdPutAway());
		sendkeys(pageobject.getRW_GRNVerification().getTransactionIdPutAway(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for putaway process For PO")
	public void user_need_to_search_grn_for_putaway_process_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSearchGSTIN());
		click(pageobject.getRW_GRNVerification().getClickSearchPutAway());
	}

	@When("User need to click the edit icon for for putaway process For PO")
	public void user_need_to_click_the_edit_icon_for_for_putaway_process_for_po() {

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickEditIconGSTIN());
		click(pageobject.getRW_GRNVerification().getClickEditIconPutAway());
	}

	@When("User need to click putaway done by clicking Yes For PO")
	public void user_need_to_click_putaway_done_by_clicking_yes_for_po() throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickPutAwayYes());
		click(pageobject.getRW_GRNVerification().getClickPutAwayYes());
	}

	@When("User need to click the submit button for putaway process For PO")
	public void user_need_to_click_the_submit_button_for_putaway_process_for_po() throws InterruptedException {
		Thread.sleep(3000);

		waitElementToCickable(pageobject.getRW_GRNVerification().getClickSubmitPutaway());
		click(pageobject.getRW_GRNVerification().getClickSubmitPutaway());
		Thread.sleep(2000);
	}

	@When("User need to close the putaway process page For PO")
	public void user_need_to_close_the_putaway_process_page_for_po() {
		waitElementToCickable(pageobject.getRW_GRNVerification().getClosePutAwayPage());

		click(pageobject.getRW_GRNVerification().getClosePutAwayPage());
	}

}
