@CreateGDNWithGRNAndExpiredDisposition
Feature: To Create GDN With GRN and Expired Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Expired Disposition
   	Given User need to switch into appropriate FC using FC switcher for create GDN
    When User need to get in to suppliers GDN page
    And User need to select the imports new supplier GDN
    And User need to select the correct file for generate new GDN
    And User need to upload the selected file for supplier new GDN
    And User need to close the import supplier GRN page by clicking cross marks
    And User need to close new supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and Expired Disposition
    Given User need to get into the supplier GRN page for Expired Disposition
    When User need to provide the supplier name in supplier invoice details for Expired Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Expired Disposition
    And User need to select supply type by clicking check box for Expired Disposition
    And User need to click the proceed button for Expired Disposition
    And User need to provide the disposition for all given items for Expired Disposition
    And User need to provide the supplier bill amount for Expired Disposition
    And User need to click the submit button for Expired Disposition
    And User need to click the upload supplier invoice scan copies for Expired Disposition
    And User need to select the appropriate file for Expired Disposition
    And User need to upload the selected file for Expired Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Expired Disposition
    And User need to approve the supplier invoice for Expired Disposition
    And User need to close the supplier invoice page for Expired Disposition
    And User need to capture the Txn Id for further process for Expired Disposition
    And user need to close the supplier GRN page for Expired Disposition

  Scenario: Vendor Margin variance Detected verification for Expired Disposition
    Given User need to provide the GRN transaction id in transaction field for Expired Disposition
    When User need to search GRN using the transection Id for Expired Disposition
    And User need to click the edit icon for the GRN verification for Expired Disposition
    And User need to click the I verify button for vendor margin approve for Expired Disposition
    And User need to click the Approve GRN for Expired Disposition
    And User need to close the current GRN page for Expired Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Expired Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Expired Disposition
    When User need to search GRN for GSTIN verification for Expired Disposition
    And User need to click the edit icon for GSTIN number verification for Expired Disposition
    And User need to click the I verify button GSTIN number verification for Expired Disposition
    And User need to verify the GSTIN number and click verify button for Expired Disposition
    And User need to click the submit and print label for Expired Disposition
    And User need to close the current GSTIN verification page for Expired Disposition

  Scenario: Putaway Process for New supplier GRN for Expired Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Expired Disposition
    When User need to search GRN for putaway process for Expired Disposition
    And User need to click the edit icon for for putaway process for Expired Disposition
    And User need to click putaway done by clicking Yes for Expired Disposition
    And User need to click the submit button for putaway process for Expired Disposition
    And User need to close the putaway process page for Expired Disposition