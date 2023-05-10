@CreateGDNWithGRNAndBannedProductDisposition
Feature: To Create GDN With GRN and Banned Product Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Banned Product Disposition
   	Given User need to switch appropriate FC using FC switcher to create GDN for Banned Product Disposition
    When User need to get into the supplier GDN page for Banned Product Disposition
    And User need to select the import supplierGDN for Banned Product Disposition
    And User need to select the correct file for Banned Product Disposition
    And User need to upload the selected file for GDN for Banned Product Disposition
    And User need to close the import GRN page by clicking cross mark for Banned Product Disposition
    And User need to close the GDN page for Banned Product Disposition
    
    Scenario: Create New supplier GRN using GDN For Banned Product Disposition
    Given User need to get into the supplier GRN page for Banned Product Disposition
    When User need to provide the supplier name in supplier invoice details for Banned Product Disposition
    And User need to provide the supplier invoice number and clikc the suggestion For Banned Product Disposition
    And User need to select supply type by clicking check box For Banned Product Disposition
    And User need to click the proceed button For Banned Product Disposition
    And User need to provide the disposition for all given items For Banned Product Disposition
    And User need to provide the supplier bill amount For Banned Product Disposition
    And User need to click the submit button For Banned Product Disposition
    And User need to click the upload supplier invoice scan copies For Banned Product Disposition
    And User need to select the appropriate file For Banned Product Disposition
    And User need to upload the selected file For Banned Product Disposition
    And User need to verify scan copy with GRN entry totals and line item entries For Banned Product Disposition
    And User need to approve the supplier invoice For Banned Product Disposition
    And User need to close the supplier invoice page For Banned Product Disposition
    And User need to capture the Txn Id for further process For Banned Product Disposition
    And user need to close the supplier GRN page For Banned Product Disposition

  Scenario: Vendor Margin variance Detected verification For Banned Product Disposition
    Given User need to provide the GRN transaction id in transaction field For Banned Product Disposition
    When User need to search GRN using the transection Id For Banned Product Disposition
    And User need to click the edit icon for the GRN verification For Banned Product Disposition
    And User need to click the I verify button for vendor margin approve For Banned Product Disposition
    And User need to click the Approve GRN For Banned Product Disposition
    And User need to close the current GRN page For Banned Product Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN For Banned Product Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification For Banned Product Disposition
    When User need to search GRN for GSTIN verification For Banned Product Disposition
    And User need to click the edit icon for GSTIN number verification For Banned Product Disposition
    And User need to click the I verify button GSTIN number verification For Banned Product Disposition
    And User need to verify the GSTIN number and click verify button For Banned Product Disposition
    And User need to click the submit and print label For Banned Product Disposition
    And User need to close the current GSTIN verification page For Banned Product Disposition

  Scenario: Putaway Process for New supplier GRN For Banned Product Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process For Banned Product Disposition
    When User need to search GRN for putaway process For Banned Product Disposition
    And User need to click the edit icon for for putaway process For Banned Product Disposition
    And User need to click putaway done by clicking Yes For Banned Product Disposition
    And User need to click the submit button for putaway process For Banned Product Disposition
    And User need to close the putaway process page For Banned Product Disposition