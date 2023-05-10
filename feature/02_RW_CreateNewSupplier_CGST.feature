@Create_new_supplier_CGST
Feature: To Create the new Supplier_CGST
  ------------
  Scenario: Validate GSTIN number is already Exist
    Given User need to get into the common supplier
    Then User nee to provide the GSTIN number and click the search button

   Scenario: Enter Supplier Basic Information
    Given User need to click new supplier button for create new supplier 
    When User must provide The Supplier Name
    And User must provide the Supplier short name
    And User must provide the GSTIN number in GSTIN field 
    And User must provide the pan number
    And User must provide the pan Name
    And User need to select the party Type 
    And user need to select the Supply type
    And user need to provide Contact name
    And user need to provide address
    And user need to provide city name
    And user need to select the State
    And user need to provide the pin number
    And User need to provide the mobile No1
    And User need to provide the e-mail
    And user need to enable the GDN flag
    And user need to click the save supplier Details
    And user need to capture the new Supplier Id for further Process
    And user need to close the new supplier Page
    
   Scenario: Enter Supplier Bank Details
    Given User Need to search the supplier in supplier field
    And User Need to click the search button
    And User Need to click the click to edit option
    And User Need to get into bank details field by clicking bank details
    And User Need to provide the beneficiary name
    And User Need to provide A/C number
    And User Need to Re-Confirm the A/C number
    And User Need to provide the Bank Name
    And User Need to provide the IFSC Code
    And User Need to provide the A/C Type
    And User Need to provide the bank address
    And User Need to click the active checkbox for active the bank account
    And User Need to click the save account details button
    And User Need to click the approve account details button
    And User Need to confirm the bank details clicking as Yes
    And User Need to click the save supplier details in bank page
    And User Need to confirm sync the supplier to all compartmnents as clicking Yes
    And User Need to click the close button for close the bank details page
    
    Scenario: Sync Supplier With DC
     Given User Need to search the supplier in supplier field for DC sync
     When User Need to click the search button for DC sync
     And User Need to click the click to view option
     And User Need to get into party sync field by clicking party sync
     And User Need to search the appropriate FC
     And User Need to select the DC by clicking check box
     And User Need to sync the supplier with selected DC
     And user Need to close the party sync page
    
    
    
    
    
    
    
    
    
    
    
    
    
    
