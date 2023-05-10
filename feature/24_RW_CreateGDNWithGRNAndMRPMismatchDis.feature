@CreateGDNWithGRNAndMRPMismatchDis
Feature: To Create GDN With GRN and MRP Mismatch Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with MRP Mismatch Disposition
   	Given User need To switch into appropriate FCs using FC Switcher for generate GDN
    When User need To get in to the New suppliers GDN
    And User need To Select the imports file new GDN
    And User need To Select the correct file for create new supplier GDN
    And User need To upload the Selected file for generate supplier GDN
    And User need To close import Supplier GRN page by click cross marks
    And User need To close the new Supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and MRP Mismatch Disposition
    Given User need to get into the supplier GRN page for MRP Mismatch Disposition
    When User need to provide the supplier name in supplier invoice details for MRP Mismatch Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for MRP Mismatch Disposition
    And User need to select supply type by clicking check box for MRP Mismatch Disposition
    And User need to click the proceed button for MRP Mismatch Disposition
    And User need to provide the disposition for all given items for MRP Mismatch Disposition
    And User need to provide the supplier bill amount for MRP Mismatch Disposition
    And User need to click the submit button for MRP Mismatch Disposition
    And User need to click the upload supplier invoice scan copies for MRP Mismatch Disposition
    And User need to select the appropriate file for MRP Mismatch Disposition
    And User need to upload the selected file for MRP Mismatch Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for MRP Mismatch Disposition
    And User need to approve the supplier invoice for MRP Mismatch Disposition
    And User need to close the supplier invoice page for MRP Mismatch Disposition
    And User need to capture the Txn Id for further process for MRP Mismatch Disposition
    And user need to close the supplier GRN page for MRP Mismatch Disposition

  Scenario: Vendor Margin variance Detected verification for MRP Mismatch Disposition
    Given User need to provide the GRN transaction id in transaction field for MRP Mismatch Disposition
    When User need to search GRN using the transection Id for MRP Mismatch Disposition
    And User need to click the edit icon for the GRN verification for MRP Mismatch Disposition
    And User need to click the I verify button for vendor margin approve for MRP Mismatch Disposition
    And User need to click the Approve GRN for MRP Mismatch Disposition
    And User need to close the current GRN page for MRP Mismatch Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for MRP Mismatch Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for MRP Mismatch Disposition
    When User need to search GRN for GSTIN verification for MRP Mismatch Disposition
    And User need to click the edit icon for GSTIN number verification for MRP Mismatch Disposition
    And User need to click the I verify button GSTIN number verification for MRP Mismatch Disposition
    And User need to verify the GSTIN number and click verify button for MRP Mismatch Disposition
    And User need to click the submit and print label for MRP Mismatch Disposition
    And User need to close the current GSTIN verification page for MRP Mismatch Disposition

  Scenario: Putaway Process for New supplier GRN for MRP Mismatch Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for MRP Mismatch Disposition
    When User need to search GRN for putaway process for MRP Mismatch Disposition
    And User need to click the edit icon for for putaway process for MRP Mismatch Disposition
    And User need to click putaway done by clicking Yes for MRP Mismatch Disposition
    And User need to click the submit button for putaway process for MRP Mismatch Disposition
    And User need to close the putaway process page for MRP Mismatch Disposition   