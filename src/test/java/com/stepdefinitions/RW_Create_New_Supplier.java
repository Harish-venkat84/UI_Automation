package com.stepdefinitions;

import java.io.IOException;

import org.apache.commons.configuration2.ex.ConfigurationException;
import base_class.Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object_manager.PageObjectManager;
import properties.Configuration_Reader;
import properties.Properties_Writer;

@SuppressWarnings("static-access")
public class RW_Create_New_Supplier extends Common_Methods {

	public static PageObjectManager pageobject = new PageObjectManager(driver);

	@Given("User need to get into common supplier")
	public void user_need_to_get_into_common_supplier() {

		waitElementToCickable(pageobject.getRW_Select_Supplier().getCommonSupplier());
		click(pageobject.getRW_Select_Supplier().getCommonSupplier());
	}

	@Then("User provide the GSTIN number and click the search button")
	public void user_provide_the_gstin_number_and_click_the_search_button() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().gst();
		sendkeys(pageobject.getRW_Select_Supplier().getProvideGSTIN(), Configuration_Reader.getCR().getFRM().getGST());
		click(pageobject.getRW_Select_Supplier().getSearchSupplier());
	}
	
	
	// Create New Supplier
	

	@Given("User need to click the new supplier button")
	public void user_need_to_click_the_new_supplier_button() {

		waitvisibilityOfAllElements(pageobject.getCreateNewSupplier().getClickSupplier());
		click(pageobject.getCreateNewSupplier().getClickSupplier());
	}

	@When("User must provide the Supplier Name")
	public void user_must_provide_the_supplier_name() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().newName();
		waitElementTovisibility(pageobject.getCreateNewSupplier().getSupplierName());
		sendkeys(pageobject.getCreateNewSupplier().getSupplierName(),
				Configuration_Reader.getCR().getFRM().getSupplierName());
	}

	@When("User must provide the supplier short name")
	public void user_must_provide_the_supplier_short_name() throws IOException {

		sendkeys(pageobject.getCreateNewSupplier().getSupplierShortName(),
				Configuration_Reader.getCR().getFRM().getSupplierShortname());
	}

	@When("User must provide the GSTIN number")
	public void user_must_provide_the_gstin_number() throws IOException, InterruptedException {

		sendkeys(pageobject.getCreateNewSupplier().getGSTIN(), Configuration_Reader.getCR().getFRM().getGST());
	}

	@When("User must provide the Pan number")
	public void user_must_provide_the_pan_number() throws IOException, InterruptedException {
		
		
		waitElementTovisibility(pageobject.getCreateNewSupplier().getPanNumber());
		sendkeys(pageobject.getCreateNewSupplier().getPanNumber(), Configuration_Reader.getCR().getFRM().getPAN());
		Thread.sleep(3000);
//		waitvisibilityOfAllElements(pageobject.getCreateNewSupplier().getGstTradeName());
//		pageobject.getCreateNewSupplier().getGstTradeName().wait(3000);
		
	}

	@When("User must provide the Pan Name")
	public void user_must_provide_the_pan_name() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().setPan_ContactName();
		waitElementTovisibility(pageobject.getCreateNewSupplier().getPanName());
		sendkeys(pageobject.getCreateNewSupplier().getPanName(), Configuration_Reader.getCR().getFRM().getpanName());
	}

	@When("User need to select the Party Type")
	public void user_need_to_select_the_party_type() throws InterruptedException {

		waitvisibilityOfAllElements(pageobject.getCreateNewSupplier().getPartyType());
		click(pageobject.getCreateNewSupplier().getPartyType());
		waitElementToCickable(pageobject.getCreateNewSupplier().getSelectPartyType());
		click(pageobject.getCreateNewSupplier().getSelectPartyType());

	}

	@When("user need to select the Supply Type")
	public void user_need_to_select_the_supply_type() {

		waitElementToCickable(pageobject.getCreateNewSupplier().getSupplyType());
		click(pageobject.getCreateNewSupplier().getSupplyType());
		waitElementToCickable(pageobject.getCreateNewSupplier().getSelectSupplyType());
		click(pageobject.getCreateNewSupplier().getSelectSupplyType());
	}

	@When("user need to provide Contact Name")
	public void user_need_to_provide_contact_name() throws IOException {

		waitElementTovisibility(pageobject.getCreateNewSupplier().getContactName());
		sendkeys(pageobject.getCreateNewSupplier().getContactName(),
				Configuration_Reader.getCR().getFRM().getContectName());
	}

	@When("user need to provide Address")
	public void user_need_to_provide_address() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().setAddress();
		sendkeys(pageobject.getCreateNewSupplier().getAddress1(), Configuration_Reader.getCR().getFRM().getAddress());
	}

	@When("user need to provide City name")
	public void user_need_to_provide_city_name() throws IOException {

		sendkeys(pageobject.getCreateNewSupplier().getCityName(), Configuration_Reader.getCR().getFRM().getCity());
	}

	@When("user need to select the state")
	public void user_need_to_select_the_state() {

		click(pageobject.getCreateNewSupplier().getState());
		waitElementToCickable(pageobject.getCreateNewSupplier().getSelectState());
		click(pageobject.getCreateNewSupplier().getSelectState());
	}

	@When("user need to provide the Pin number")
	public void user_need_to_provide_the_pin_number() throws IOException {

		sendkeys(pageobject.getCreateNewSupplier().getPinCode(), Configuration_Reader.getCR().getFRM().getPin());
	}

	@When("User need to provide the Mobile No1")
	public void user_need_to_provide_the_mobile_no1() throws IOException {

		sendkeys(pageobject.getCreateNewSupplier().getMobileNo1(),
				Configuration_Reader.getCR().getFRM().getMobileNo1());
	}

	@When("User need to provide the Email")
	public void user_need_to_provide_the_email() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().setNewEmail();
		sendkeys(pageobject.getCreateNewSupplier().getEmail(), Configuration_Reader.getCR().getFRM().getEmail());
	}

	@When("user need to enable the GDN Flag")
	public void user_need_to_enable_the_gdn_flag() {

		click(pageobject.getCreateNewSupplier().getGDNFlag());
		waitElementToCickable(pageobject.getCreateNewSupplier().getGDNFlagSelect());
		click(pageobject.getCreateNewSupplier().getGDNFlagSelect());
	}

//	@When("user need to enable the VMS Flag")
//	public void user_need_to_enable_the_vms_flag() {
//
//		click(pageobject.getCreateNewSupplier().getVMSFlag());
//
//		waitElementToCickable(pageobject.getCreateNewSupplier().getVMSFlagSelect());
//
//		click(pageobject.getCreateNewSupplier().getVMSFlagSelect());
//
//	}

	@When("user need to click the save supplier details")
	public void user_need_to_click_the_save_supplier_details() {

		click(pageobject.getCreateNewSupplier().getSaveSupplierDetails());
		waitvisibilityOfAllElements(pageobject.getCreateNewSupplier().getSupplierPopup());
		click(pageobject.getCreateNewSupplier().getSupplierPopup());
//		if (getText(pageobject.getCreateNewSupplier().getSupplierCreatedPopup())
//				.equalsIgnoreCase("Supplier Created successfully")) {
//		}
	}

	@When("user need to capture the new Supplier Id for further process")
	public void user_need_to_capture_the_new_supplier_id_for_further_process()
			throws ConfigurationException, IOException, InterruptedException {

		Properties_Writer.getProperties_Writer()
				.setSupplierID(getElementText(pageobject.getCreateNewSupplier().getCaptureNewSupplierID()));
	}

	@When("user need to close the new supplier page")
	public void user_need_to_close_the_new_supplier_page() {
		waitElementToCickable(pageobject.getCreateNewSupplier().getCloseSupplierpage());
		click(pageobject.getCreateNewSupplier().getCloseSupplierpage());
	}

	// Enter Bank details
	

	@Given("User need to search the supplier in supplier field")
	public void user_need_to_search_the_supplier_in_supplier_field() throws IOException {

		waitPresenceOfElement(pageobject.getRW_Enter_Bank_Details().search);
		sendkeys(pageobject.getRW_Enter_Bank_Details().getSearchSupplierID(),
				Configuration_Reader.getCR().getFRM().getSupplierId());
	}

	@Given("User need to click the search button")
	public void user_need_to_click_the_search_button() {

		waitElementTovisibility(pageobject.getRW_Enter_Bank_Details().getClickSearch());
		click(pageobject.getRW_Enter_Bank_Details().getClickSearch());
	}

	@Given("User need to click the click to edit option")
	public void user_need_to_click_the_click_to_edit_option() {

		waitElementTovisibility(pageobject.getRW_Enter_Bank_Details().getSupplierEditOption());
		click(pageobject.getRW_Enter_Bank_Details().getSupplierEditOption());
	}

	@Given("User need to get into bank details field by clicking bank details")
	public void user_need_to_get_into_bank_details_field_by_clicking_bank_details() {

		waitElementTovisibility(pageobject.getRW_Enter_Bank_Details().getClickingBankDetails());
		click(pageobject.getRW_Enter_Bank_Details().getClickingBankDetails());
	}

	@Given("User need to provide the beneficiary name")
	public void user_need_to_provide_the_beneficiary_name() throws IOException, ConfigurationException {

		Properties_Writer.getProperties_Writer().setBeneficiaryName();
		sendkeys(pageobject.getRW_Enter_Bank_Details().getBeneficiaryName(),
				Configuration_Reader.getCR().getFRM().getBeneficiaryName());
	}

	@Given("User need to provide A\\/C number")
	public void user_need_to_provide_a_c_number() throws IOException {

		sendkeys(pageobject.getRW_Enter_Bank_Details().getEnterACNumber(),
				Configuration_Reader.getCR().getFRM().getACNumber());
	}

	@Given("User need to Re-Confirm the A\\/C number")
	public void user_need_to_re_confirm_the_a_c_number() throws IOException {

		sendkeys(pageobject.getRW_Enter_Bank_Details().getReenterACNumber(),
				Configuration_Reader.getCR().getFRM().getACNumberReConfirm());
	}

	@Given("User need to provide the Bank Name")
	public void user_need_to_provide_the_bank_name() throws IOException {

		sendkeys(pageobject.getRW_Enter_Bank_Details().getEnterBankName(),
				Configuration_Reader.getCR().getFRM().getBankName());
	}

	@Given("User need to provide the IFSC Code")
	public void user_need_to_provide_the_ifsc_code() throws IOException {

		sendkeys(pageobject.getRW_Enter_Bank_Details().getEnterIFSCCode(),
				Configuration_Reader.getCR().getFRM().getIFSCCode());
	}

	@Given("User need to provide the A\\/C Type")
	public void user_need_to_provide_the_a_c_type() throws IOException {

		sendkeys(pageobject.getRW_Enter_Bank_Details().getEnterACType(),
				Configuration_Reader.getCR().getFRM().getACType());
	}

	@Given("User need to provide the bank address")
	public void user_need_to_provide_the_bank_address() throws IOException, ConfigurationException {
		
		Properties_Writer.getProperties_Writer().setBeneficiaryAddress();
		sendkeys(pageobject.getRW_Enter_Bank_Details().getEnterBeneficiaryAddress(),
				Configuration_Reader.getCR().getFRM().getBeneficiaryAddress());
	}

	@Given("User need to click the active checkbox for active the bank account")
	public void user_need_to_click_the_active_checkbox_for_active_the_bank_account() {

		click(pageobject.getRW_Enter_Bank_Details().getBankActiveCheckBox());
	}

	@Given("User need to click the save account details button")
	public void user_need_to_click_the_save_account_details_button() {

		click(pageobject.getRW_Enter_Bank_Details().getSavebankdetails());
	}

	@Given("User need to click the approve account details button")
	public void user_need_to_click_the_approve_account_details_button() {

		waitElementTovisibility(pageobject.getRW_Enter_Bank_Details().getApproveAccountDetails());
		click(pageobject.getRW_Enter_Bank_Details().getApproveAccountDetails());
	}

	@Given("User need to confirm the bank details clicking as Yes")
	public void user_need_to_confirm_the_bank_details_clicking_as_yes() {

		waitElementToCickable(pageobject.getRW_Enter_Bank_Details().getConfirmBankVerified());
		click(pageobject.getRW_Enter_Bank_Details().getConfirmBankVerified());
		waitvisibilityOfAllElements(pageobject.getRW_Enter_Bank_Details().getSupplierAccountUpdatePopup1());
		click(pageobject.getRW_Enter_Bank_Details().getSupplierAccountUpdatePopup1());
	}

	@Given("User need to click the save supplier details in bank page")
	public void user_need_to_click_the_save_supplier_details_in_bank_page() throws InterruptedException {

		waitvisibilityOfAllElements(pageobject.getRW_Enter_Bank_Details().getSupplierAccountUpdatePopup2());
		click(pageobject.getRW_Enter_Bank_Details().getSupplierAccountUpdatePopup2());
		waitElementToCickable(pageobject.getRW_Enter_Bank_Details().getBankpageSaveSupplierDetails());
		click(pageobject.getRW_Enter_Bank_Details().getBankpageSaveSupplierDetails());
//		waitvisibilityOfAllElements(pageobject.getRW_Enter_Bank_Details().getBankDetailsPopUp());
//		click(pageobject.getRW_Enter_Bank_Details().getBankDetailsPopUp());
//		
	}

	@Given("User need to confirm sync the supplier to all compartmnents as clicking Yes")
	public void user_need_to_confirm_sync_the_supplier_to_all_compartmnents_as_clicking_yes()
			throws InterruptedException {

		Thread.sleep(2000);
		waitElementToCickable(pageobject.getRW_Enter_Bank_Details().getSyncCompartmnents());
		click(pageobject.getRW_Enter_Bank_Details().getSyncCompartmnents());
//		waitvisibilityOfAllElements(pageobject.getRW_Enter_Bank_Details().getSyncCompartmnentsPopUp());
//		click(pageobject.getRW_Enter_Bank_Details().getSyncCompartmnentsPopUp());
	}

	@Given("User need to click the close button for close the bank details page")
	public void user_need_to_click_the_close_button_for_close_the_bank_details_page() {

		click(pageobject.getRW_Enter_Bank_Details().getCloseBankDetailsPage());
	}

	// Sync supplier with DC
	
	@Given("User need to search the supplier in supplier field for DC sync")
	public void user_need_to_search_the_supplier_in_supplier_field_for_dc_sync() throws IOException {

		waitElementToCickable(pageobject.getRW_Sync_SupplierToDC().getProvideSupplierID());
		sendkeys(pageobject.getRW_Sync_SupplierToDC().getProvideSupplierID(),
				Configuration_Reader.getCR().getFRM().getSupplierId());
	}

	@When("User need to click the search button for DC sync")
	public void user_need_to_click_the_search_button_for_dc_sync() {

		waitElementTovisibility(pageobject.getRW_Sync_SupplierToDC().getClickSearchSync());
		click(pageobject.getRW_Sync_SupplierToDC().getClickSearchSync());
	}

	@When("User need to click the click to view option")
	public void user_need_to_click_the_click_to_view_option() throws InterruptedException {

		Thread.sleep(5000);
		click(pageobject.getRW_Sync_SupplierToDC().getClickToView());
	}

	@When("User need to get into party sync field by clicking party sync")
	public void user_need_to_get_into_party_sync_field_by_clicking_party_sync() {

		waitElementToCickable(pageobject.getRW_Sync_SupplierToDC().getClickPartySync());
		click(pageobject.getRW_Sync_SupplierToDC().getClickPartySync());
	}

	@When("User need to search the appropriate FC")
	public void user_need_to_search_the_appropriate_fc() throws IOException {

		sendkeys(pageobject.getRW_Sync_SupplierToDC().getSearchDC(), Configuration_Reader.getCR().getFRM().getDC());
	}

	@When("User need to select the DC by clicking check box")
	public void user_need_to_select_the_dc_by_clicking_check_box() {

		click(pageobject.getRW_Sync_SupplierToDC().getSelectDC());
	}

	@When("User need to sync the supplier with selected DC")
	public void user_need_to_sync_the_supplier_with_selected_dc() {

		waitElementToCickable(pageobject.getRW_Sync_SupplierToDC().getSync());
		click(pageobject.getRW_Sync_SupplierToDC().getSync());
	}

	@When("user need to close the party sync page")
	public void user_need_to_close_the_party_sync_page() throws InterruptedException {

		Thread.sleep(8000);
		click(pageobject.getRW_Sync_SupplierToDC().getCloseSyncDCPage());
	}

}
