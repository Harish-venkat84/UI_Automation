@CreateGDNWithGRNAndShortSupplyDis
Feature: To Create GDN With GRN and Short Supply Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Short Supply Disposition
   	Given User Need To Switch into appropriate FCs using FC Switcher for generate GDN
    When User Need To get in to the New Suppliers GDN
    And User Need To Select the Imports file new GDN
    And User Need To Select the correct file for create new Supplier GDN
    And User Need To upload the Selected file for generate Supplier GDN
    And User Need To close Import Supplier GRN page by click cross marks
    And User Need To Close the new Supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and Short Supply Disposition
    Given User need to get into the supplier GRN page for Short Supply Disposition
    When User need to provide the supplier name in supplier invoice details for Short Supply Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Short Supply Disposition
    And User need to select supply type by clicking check box for Short Supply Disposition
    And User need to click the proceed button for Short Supply Disposition
    And User need to provide the disposition for all given items for Short Supply Disposition
    And User need to provide the supplier bill amount for Short Supply Disposition
    And User need to click the submit button for Short Supply Disposition
    And User need to click the upload supplier invoice scan copies for Short Supply Disposition
    And User need to select the appropriate file for Short Supply Disposition
    And User need to upload the selected file for Short Supply Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Short Supply Disposition
    And User need to approve the supplier invoice for Short Supply Disposition
    And User need to close the supplier invoice page for Short Supply Disposition
    And User need to capture the Txn Id for further process for Short Supply Disposition
    And user need to close the supplier GRN page for Short Supply Disposition

  Scenario: Vendor Margin variance Detected verification for Short Supply Disposition
    Given User need to provide the GRN transaction id in transaction field for Short Supply Disposition
    When User need to search GRN using the transection Id for Short Supply Disposition
    And User need to click the edit icon for the GRN verification for Short Supply Disposition
    And User need to click the I verify button for vendor margin approve for Short Supply Disposition
    And User need to click the Approve GRN for Short Supply Disposition
    And User need to close the current GRN page for Short Supply Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Short Supply Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Short Supply Disposition
    When User need to search GRN for GSTIN verification for Short Supply Disposition
    And User need to click the edit icon for GSTIN number verification for Short Supply Disposition
    And User need to click the I verify button GSTIN number verification for Short Supply Disposition
    And User need to verify the GSTIN number and click verify button for Short Supply Disposition
    And User need to click the submit and print label for Short Supply Disposition
    And User need to close the current GSTIN verification page for Short Supply Disposition

  Scenario: Putaway Process for New supplier GRN for Short Supply Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Short Supply Disposition
    When User need to search GRN for putaway process for Short Supply Disposition
    And User need to click the edit icon for for putaway process for Short Supply Disposition
    And User need to click putaway done by clicking Yes for Short Supply Disposition
    And User need to click the submit button for putaway process for Short Supply Disposition
    And User need to close the putaway process page for Short Supply Disposition   