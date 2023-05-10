@CreateGDNWithGRNAndItemMasterMissingDis
Feature: To Create GDN With GRN and Item Master Missing Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Item Master Missing Disposition
   	Given User Need To switch into appropriate FCs using FC Switcher for generate GDN
    When User Need To get in to the New suppliers GDN
    And User Need To Select the imports file new GDN
    And User Need To Select the correct file for create new supplier GDN
    And User Need To upload the Selected file for generate supplier GDN
    And User Need To close import Supplier GRN page by click cross marks
    And User Need To close the new Supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and Item Master Missing Disposition
    Given User need to get into the supplier GRN page for Item Master Missing Disposition
    When User need to provide the supplier name in supplier invoice details for Item Master Missing Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Item Master Missing Disposition
    And User need to select supply type by clicking check box for Item Master Missing Disposition
    And User need to click the proceed button for Item Master Missing Disposition
    And User need to provide the disposition for all given items for Item Master Missing Disposition
    And User need to provide the supplier bill amount for Item Master Missing Disposition
    And User need to click the submit button for Item Master Missing Disposition
    And User need to click the upload supplier invoice scan copies for Item Master Missing Disposition
    And User need to select the appropriate file for Item Master Missing Disposition
    And User need to upload the selected file for Item Master Missing Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Item Master Missing Disposition
    And User need to approve the supplier invoice for Item Master Missing Disposition
    And User need to close the supplier invoice page for Item Master Missing Disposition
    And User need to capture the Txn Id for further process for Item Master Missing Disposition
    And user need to close the supplier GRN page for Item Master Missing Disposition

  Scenario: Vendor Margin variance Detected verification for Item Master Missing Disposition
    Given User need to provide the GRN transaction id in transaction field for Item Master Missing Disposition
    When User need to search GRN using the transection Id for Item Master Missing Disposition
    And User need to click the edit icon for the GRN verification for Item Master Missing Disposition
    And User need to click the I verify button for vendor margin approve for Item Master Missing Disposition
    And User need to click the Approve GRN for Item Master Missing Disposition
    And User need to close the current GRN page for Item Master Missing Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Item Master Missing Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Item Master Missing Disposition
    When User need to search GRN for GSTIN verification for Item Master Missing Disposition
    And User need to click the edit icon for GSTIN number verification for Item Master Missing Disposition
    And User need to click the I verify button GSTIN number verification for Item Master Missing Disposition
    And User need to verify the GSTIN number and click verify button for Item Master Missing Disposition
    And User need to click the submit and print label for Item Master Missing Disposition
    And User need to close the current GSTIN verification page for Item Master Missing Disposition

  Scenario: Putaway Process for New supplier GRN for Item Master Missing Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Item Master Missing Disposition
    When User need to search GRN for putaway process for Item Master Missing Disposition
    And User need to click the edit icon for for putaway process for Item Master Missing Disposition
    And User need to click putaway done by clicking Yes for Item Master Missing Disposition
    And User need to click the submit button for putaway process for Item Master Missing Disposition
    And User need to close the putaway process page for Item Master Missing Disposition   