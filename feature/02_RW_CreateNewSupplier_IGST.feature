@Create_new_supplier_IGST
Feature: To Create the new Supplier
  ------------
  Scenario: Validating GSTIN number is already exist
    Given User need to get into common supplier
    Then User provide the GSTIN number and click the search button

   Scenario: Entering supplier basic information
    Given User need to click the new supplier button
    When User must provide the Supplier Name
    And User must provide the supplier short name
    And User must provide the GSTIN number
    And User must provide the Pan number
    And User must provide the Pan Name
    And User need to select the Party Type 
    And user need to select the Supply Type
    And user need to provide Contact Name
    And user need to provide Address
    And user need to provide City name
    And user need to select the state
    And user need to provide the Pin number
    And User need to provide the Mobile No1
    And User need to provide the Email
    And user need to enable the GDN Flag
    And user need to click the save supplier details
    And user need to capture the new Supplier Id for further process
    And user need to close the new supplier page
    
   Scenario: Enter supplier bank details
    Given User need to search the supplier in supplier field
    And User need to click the search button
    And User need to click the click to edit option
    And User need to get into bank details field by clicking bank details
    And User need to provide the beneficiary name
    And User need to provide A/C number
    And User need to Re-Confirm the A/C number
    And User need to provide the Bank Name
    And User need to provide the IFSC Code
    And User need to provide the A/C Type
    And User need to provide the bank address
    And User need to click the active checkbox for active the bank account
    And User need to click the save account details button
    And User need to click the approve account details button
    And User need to confirm the bank details clicking as Yes
    And User need to click the save supplier details in bank page
    And User need to confirm sync the supplier to all compartmnents as clicking Yes
    And User need to click the close button for close the bank details page
    
    Scenario: Sync supplier with DC
     Given User need to search the supplier in supplier field for DC sync
     When User need to click the search button for DC sync
     And User need to click the click to view option
     And User need to get into party sync field by clicking party sync
     And User need to search the appropriate FC
     And User need to select the DC by clicking check box
     And User need to sync the supplier with selected DC
     And user need to close the party sync page
    
    
    
    
    
    
    
    
    
    
    
    
    
    
