@CreateGDNWithGRNAndDamagedDisposition
Feature: To Create GDN With GRN and Demaged Disposition
  ----------------------------------

  Scenario: Create New GDN with Ok Disposition
    Given User need to switch appropriate FC using FC switcher to create GDN
    When User need to get into the supplier GDN page
    And User need to select the import supplierGDN
    And User need to select the correct file
    And User need to upload the selected file for GDN
    And User need to close the import GRN page by clicking cross mark
    And User need to close the GDN page

  Scenario: Create New supplier GRN using GDN and Demaged Disposition
    Given User need to get into the supplier GRN page for Demaged Disposition
    When User need to provide the supplier name in supplier invoice details for Demaged Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Demaged Disposition
    And User need to select supply type by clicking check box for Demaged Disposition
    And User need to click the proceed button for Demaged Disposition
    And User need to provide the disposition for all given items for Demaged Disposition
    And User need to provide the supplier bill amount for Demaged Disposition
    And User need to click the submit button for Demaged Disposition
    And User need to click the upload supplier invoice scan copies for Demaged Disposition
    And User need to select the appropriate file for Demaged Disposition
    And User need to upload the selected file for Demaged Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Demaged Disposition
    And User need to approve the supplier invoice for Demaged Disposition
    And User need to close the supplier invoice page for Demaged Disposition
    And User need to capture the Txn Id for further process for Demaged Disposition
    And user need to close the supplier GRN page for Demaged Disposition

  Scenario: Vendor Margin variance Detected verification for Demaged Disposition
    Given User need to provide the GRN transaction id in transaction field for Demaged Disposition
    When User need to search GRN using the transection Id for Demaged Disposition
    And User need to click the edit icon for the GRN verification for Demaged Disposition
    And User need to click the I verify button for vendor margin approve for Demaged Disposition
    And User need to click the Approve GRN for Demaged Disposition
    And User need to close the current GRN page for Demaged Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Demaged Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Demaged Disposition
    When User need to search GRN for GSTIN verification for Demaged Disposition
    And User need to click the edit icon for GSTIN number verification for Demaged Disposition
    And User need to click the I verify button GSTIN number verification for Demaged Disposition
    And User need to verify the GSTIN number and click verify button for Demaged Disposition
    And User need to click the submit and print label for Demaged Disposition
    And User need to close the current GSTIN verification page for Demaged Disposition

  Scenario: Putaway Process for New supplier GRN for Demaged Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Demaged Disposition
    When User need to search GRN for putaway process for Demaged Disposition
    And User need to click the edit icon for for putaway process for Demaged Disposition
    And User need to click putaway done by clicking Yes for Demaged Disposition
    And User need to click the submit button for putaway process for Demaged Disposition
    And User need to close the putaway process page for Demaged Disposition
