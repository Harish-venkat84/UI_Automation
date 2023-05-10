@CreateGDNwithGRNAndPOWithMultiplelineitem
Feature: To Create GDN with GRN and PO With Multiple line item
  ----------------------------------

  Scenario: Create New Purchase Order Using payload
    When User need to create a new purchase order using API payload
    
  Scenario: Create New supplier GDN
    Given User need to switch appropriate FC using FC switcher to create GDN for PO
    When User need to get into the supplier GDN page for PO
    And User need to select the import supplierGDN for PO
    And User need to select the correct file for PO
    And User need to upload the selected file for GDN for PO
    And User need to close the import GRN page by clicking cross mark for PO
    And User need to close the GDN page for PO
    
   Scenario: Create New supplier GRN using GDN For PO
    Given User need to get into the supplier GRN page for For PO
    When User need to provide the supplier name in supplier invoice details For PO
    And User need to provide the supplier invoice number and clikc the suggestion For PO
    And User need to provide the PO Number in the PO field
    And User need to select supply type by clicking check box For PO
    And User need to click the proceed button For PO
    And User need to provide the disposition for all given items For PO
    And User need to provide the supplier bill amount For PO
    And User need to click the submit button For PO
    And User need to click the upload supplier invoice scan copies For PO
    And User need to select the appropriate file For PO
    And User need to upload the selected file For PO
    And User need to verify scan copy with GRN entry totals and line item entries For PO
    And User need to approve the supplier invoice For PO
    And User need to close the supplier invoice page For PO
    And User need to capture the Txn Id for further process For PO
    And user need to close the supplier GRN page For PO

  Scenario: Vendor Margin variance Detected verification For PO
    Given User need to provide the GRN transaction id in transaction field For PO
    When User need to search GRN using the transection Id For PO
    And User need to click the edit icon for the GRN verification For PO
    And User need to click the I verify button for vendor margin approve For PO
    And User need to click the Approve GRN For PO
    And User need to close the current GRN page For PO

  Scenario: GSTIN Number Verification for the Supplier GRN For PO
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification For PO
    When User need to search GRN for GSTIN verification For PO
    And User need to click the edit icon for GSTIN number verification For PO
    And User need to click the I verify button GSTIN number verification For PO
    And User need to verify the GSTIN number and click verify button For PO
    And User need to click the submit and print label For PO
    And User need to close the current GSTIN verification page For PO

  Scenario: Putaway Process for New supplier GRN For PO
    Given User need to provide the GRN transaction id in transaction field for for putaway process For PO
    When User need to search GRN for putaway process For PO
    And User need to click the edit icon for for putaway process For PO
    And User need to click putaway done by clicking Yes For PO
    And User need to click the submit button for putaway process For PO
    And User need to close the putaway process page For PO