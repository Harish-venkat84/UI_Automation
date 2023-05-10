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

public class RW_CreateGDNWithGRNAndBannedProductDis extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to switch appropriate FC using FC switcher to create GDN for Banned Product Disposition")
	public void user_need_to_switch_appropriate_fc_using_fc_switcher_to_create_gdn_for_banned_product_disposition()
			throws InterruptedException, IOException, ConfigurationException {

		Thread.sleep(2000);
		getWindHandle();
		Excel_Writer.getExcel_Writer().setExcelDC_Supplier();
		Actions mouse = new Actions(driver);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRN().getSwitchFC());
		mouse.moveToElement(pageobject.getRW_CreateGDNWithGRN().getSwitchFC()).build().perform();
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRN().getSelectFC());
		click(pageobject.getRW_CreateGDNWithGRN().getSelectFC());
	}

	@When("User need to get into the supplier GDN page for Banned Product Disposition")
	public void user_need_to_get_into_the_supplier_gdn_page_for_banned_product_disposition()
			throws InterruptedException {

		driverSwitch();
		Thread.sleep(4000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGDN());
		;
	}

	@When("User need to select the import supplierGDN for Banned Product Disposition")
	public void user_need_to_select_the_import_supplier_gdn_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickImportGDN());
	}

	@When("User need to select the correct file for Banned Product Disposition")
	public void user_need_to_select_the_correct_file_for_banned_product_disposition()
			throws AWTException, InterruptedException, IOException {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getGDN_FileUploadPath());
	}

	@When("User need to upload the selected file for GDN for Banned Product Disposition")
	public void user_need_to_upload_the_selected_file_for_gdn_for_banned_product_disposition()
			throws InterruptedException {

		Thread.sleep(1000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getUploadfile());
	}

	@When("User need to close the import GRN page by clicking cross mark for Banned Product Disposition")
	public void user_need_to_close_the_import_grn_page_by_clicking_cross_mark_for_banned_product_disposition()
			throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseImportGRN());
	}

	@When("User need to close the GDN page for Banned Product Disposition")
	public void user_need_to_close_the_gdn_page_for_banned_product_disposition() {

//		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGDNPage());
	}

	// Create New Supplier GRN

	@Given("User need to get into the supplier GRN page for Banned Product Disposition")
	public void user_need_to_get_into_the_supplier_grn_page_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplierGRN());
	}

	@When("User need to provide the supplier name in supplier invoice details for Banned Product Disposition")
	public void user_need_to_provide_the_supplier_name_in_supplier_invoice_details_for_banned_product_disposition()
			throws IOException, InterruptedException {
		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSuppliername(),
				Configuration_Reader.getCR().getFRM().getSupplierName());

		Thread.sleep(1000);
		WebElement element = driver
				.findElement(By.xpath(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().get_Supplier_Name()));
		click(element);
	}

	@When("User need to provide the supplier invoice number and clikc the suggestion For Banned Product Disposition")
	public void user_need_to_provide_the_supplier_invoice_number_and_clikc_the_suggestion_for_banned_product_disposition()
			throws InterruptedException, IOException {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideInvoiceNumber(),
				Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSuggestion());
	}

	@When("User need to select supply type by clicking check box For Banned Product Disposition")
	public void user_need_to_select_supply_type_by_clicking_check_box_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSupplyType());
	}

	@When("User need to click the proceed button For Banned Product Disposition")
	public void user_need_to_click_the_proceed_button_for_banned_product_disposition() throws InterruptedException {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickProceed());
	}

	@When("User need to provide the disposition for all given items For Banned Product Disposition")
	public void user_need_to_provide_the_disposition_for_all_given_items_for_banned_product_disposition() {

		waitvisibilityOfAllElements(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition1());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneBannedDis());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemOneBannedDis());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition2());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoDisposition());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemTwoBannedDis());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSelectDisposition3());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeDisposition());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getLineItemThreeBannedDis());
	}

	@When("User need to provide the supplier bill amount For Banned Product Disposition")
	public void user_need_to_provide_the_supplier_bill_amount_for_banned_product_disposition()
			throws InterruptedException, ConfigurationException, IOException {

		Thread.sleep(2000);
		String supplierAmt = getText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureCalculatedAmount());
		Properties_Writer.getProperties_Writer().setsupplierBillAmt(supplierAmt);
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getProvideSupplierBillAmount(),
				Configuration_Reader.getCR().getFRM().getsupplierBillAmt());
	}

	@When("User need to click the submit button For Banned Product Disposition")
	public void user_need_to_click_the_submit_button_for_banned_product_disposition() throws InterruptedException {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getSubmitSupplierGRN());
	}

	@When("User need to click the upload supplier invoice scan copies For Banned Product Disposition")
	public void user_need_to_click_the_upload_supplier_invoice_scan_copies_for_banned_product_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUploadIcon());
	}

	@When("User need to select the appropriate file For Banned Product Disposition")
	public void user_need_to_select_the_appropriate_file_for_banned_product_disposition()
			throws InterruptedException, AWTException, IOException {

		Thread.sleep(2000);
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickChooseFile());
		Thread.sleep(2000);
		copingFileLocation(Configuration_Reader.getCR().getFRM().getSupplierSoftCopyPath());
		Thread.sleep(2000);
	}

	@When("User need to upload the selected file For Banned Product Disposition")
	public void user_need_to_upload_the_selected_file_for_banned_product_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickUpload());
		Thread.sleep(2000);
	}

	@When("User need to verify scan copy with GRN entry totals and line item entries For Banned Product Disposition")
	public void user_need_to_verify_scan_copy_with_grn_entry_totals_and_line_item_entries_for_banned_product_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getVerifyScanCopy());
	}

	@When("User need to approve the supplier invoice For Banned Product Disposition")
	public void user_need_to_approve_the_supplier_invoice_for_banned_product_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getApproveScanCopy());
	}

	@When("User need to close the supplier invoice page For Banned Product Disposition")
	public void user_need_to_close_the_supplier_invoice_page_for_banned_product_disposition()
			throws InterruptedException {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierInvoicepage());
	}

	@When("User need to capture the Txn Id for further process For Banned Product Disposition")
	public void user_need_to_capture_the_txn_id_for_further_process_for_banned_product_disposition()
			throws ConfigurationException, IOException {

		String supplierTxnId = getElementText(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCaptureTxnID());
		Properties_Writer.getProperties_Writer().setsupplierTxnId(supplierTxnId);
	}

	@When("user need to close the supplier GRN page For Banned Product Disposition")
	public void user_need_to_close_the_supplier_grn_page_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseSupplierGRNPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field For Banned Product Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_banned_product_disposition()
			throws IOException {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionId(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN using the transection Id For Banned Product Disposition")
	public void user_need_to_search_grn_using_the_transection_id_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearch());
	}

	@When("User need to click the edit icon for the GRN verification For Banned Product Disposition")
	public void user_need_to_click_the_edit_icon_for_the_grn_verification_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIcon());
	}

	@When("User need to click the I verify button for vendor margin approve For Banned Product Disposition")
	public void user_need_to_click_the_i_verify_button_for_vendor_margin_approve_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerify());
	}

	@When("User need to click the Approve GRN For Banned Product Disposition")
	public void user_need_to_click_the_approve_grn_for_banned_product_disposition() throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickApprove());
		Thread.sleep(2000);
	}

	@When("User need to close the current GRN page For Banned Product Disposition")
	public void user_need_to_close_the_current_grn_page_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseCurrentGRNPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field for GSTIN number verification For Banned Product Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_gstin_number_verification_for_banned_product_disposition()
			throws InterruptedException, IOException {

		Thread.sleep(2000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdGSTIN(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for GSTIN verification For Banned Product Disposition")
	public void user_need_to_search_grn_for_gstin_verification_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
	}

	@When("User need to click the edit icon for GSTIN number verification For Banned Product Disposition")
	public void user_need_to_click_the_edit_icon_for_gstin_number_verification_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
	}

	@When("User need to click the I verify button GSTIN number verification For Banned Product Disposition")
	public void user_need_to_click_the_i_verify_button_gstin_number_verification_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickIVerifyGSTIN());
	}

	@When("User need to verify the GSTIN number and click verify button For Banned Product Disposition")
	public void user_need_to_verify_the_gstin_number_and_click_verify_button_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifiedInvoice());
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickVerifyGSTIN());
	}

	@When("User need to click the submit and print label For Banned Product Disposition")
	public void user_need_to_click_the_submit_and_print_label_for_banned_product_disposition()
			throws InterruptedException {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitAndPrintLabel());
		Thread.sleep(3000);
		alert();
//		Thread.sleep(2000);
	}

	@When("User need to close the current GSTIN verification page For Banned Product Disposition")
	public void user_need_to_close_the_current_gstin_verification_page_for_banned_product_disposition() {

		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getCloseGSTINVerificationPage());
	}

	@Given("User need to provide the GRN transaction id in transaction field for for putaway process For Banned Product Disposition")
	public void user_need_to_provide_the_grn_transaction_id_in_transaction_field_for_for_putaway_process_for_banned_product_disposition()
			throws InterruptedException, IOException {

		Thread.sleep(1000);
		waitElementTovisibility(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdPutAway());
		sendkeys(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getTransactionIdPutAway(),
				Configuration_Reader.getCR().getFRM().getSupplierTxnID());
	}

	@When("User need to search GRN for putaway process For Banned Product Disposition")
	public void user_need_to_search_grn_for_putaway_process_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSearchPutAway());
	}

	@When("User need to click the edit icon for for putaway process For Banned Product Disposition")
	public void user_need_to_click_the_edit_icon_for_for_putaway_process_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconGSTIN());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickEditIconPutAway());
	}

	@When("User need to click putaway done by clicking Yes For Banned Product Disposition")
	public void user_need_to_click_putaway_done_by_clicking_yes_for_banned_product_disposition()
			throws InterruptedException {

		Thread.sleep(1000);
		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickPutAwayYes());
	}

	@When("User need to click the submit button for putaway process For Banned Product Disposition")
	public void user_need_to_click_the_submit_button_for_putaway_process_for_banned_product_disposition()
			throws InterruptedException {
		Thread.sleep(2000);

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClickSubmitPutaway());
		Thread.sleep(2000);
	}

	@When("User need to close the putaway process page For Banned Product Disposition")
	public void user_need_to_close_the_putaway_process_page_for_banned_product_disposition() {

		waitElementToCickable(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
		click(pageobject.getRW_CreateGDNWithGRNAndDemagedDis().getClosePutAwayPage());
	}

}
