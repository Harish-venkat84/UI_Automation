@CreateGDNWithGRNAndDamageInTrainsitDisposition
Feature: To Create GDN With GRN and Damage in Trainsit Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Damage in Trainsit Disposition
   	Given User need to switch appropriate FC using FC switcher to create GDN for Damage in Trainsit Disposition
    When User need to get into the supplier GDN page for Damage in Trainsit Disposition
    And User need to select the import supplierGDN for Damage in Trainsit Disposition
    And User need to select the correct file for Damage in Trainsit Disposition
    And User need to upload the selected file for GDN for Damage in Trainsit Disposition
    And User need to close the import GRN page by clicking cross mark for Damage in Trainsit Disposition
    And User need to close the GDN page for Damage in Trainsit Disposition
    
   Scenario: Create New supplier GRN using GDN For Damage in Trainsit Disposition
    Given User need to get into the supplier GRN page for Damage in Trainsit Disposition
    When User need to provide the supplier name in supplier invoice details for Damage in Trainsit Disposition
    And User need to provide the supplier invoice number and clikc the suggestion For Damage in Trainsit Disposition
    And User need to select supply type by clicking check box For Damage in Trainsit Disposition
    And User need to click the proceed button For Damage in Trainsit Disposition
    And User need to provide the disposition for all given items For Damage in Trainsit Disposition
    And User need to provide the supplier bill amount For Damage in Trainsit Disposition
    And User need to click the submit button For Damage in Trainsit Disposition
    And User need to click the upload supplier invoice scan copies For Damage in Trainsit Disposition
    And User need to select the appropriate file For Damage in Trainsit Disposition
    And User need to upload the selected file For Damage in Trainsit Disposition
    And User need to verify scan copy with GRN entry totals and line item entries For Damage in Trainsit Disposition
    And User need to approve the supplier invoice For Damage in Trainsit Disposition
    And User need to close the supplier invoice page For Damage in Trainsit Disposition
    And User need to capture the Txn Id for further process For Damage in Trainsit Disposition
    And user need to close the supplier GRN page For Damage in Trainsit Disposition

  Scenario: Vendor Margin variance Detected verification For Damage in Trainsit Disposition
    Given User need to provide the GRN transaction id in transaction field For Damage in Trainsit Disposition
    When User need to search GRN using the transection Id For Damage in Trainsit Disposition
    And User need to click the edit icon for the GRN verification For Damage in Trainsit Disposition
    And User need to Allow Intransit Lost or Damage by clicking Yes button
    And User need to confirm Lost in Transit, Damage in Transit disposition will not added in inventory by clicking Yes
    And User need to click the I verify button for vendor margin approve For Damage in Trainsit Disposition
    And User need to click the Approve GRN For Damage in Trainsit Disposition
    And User need to close the current GRN page For Damage in Trainsit Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN For Damage in Trainsit Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification For Damage in Trainsit Disposition
    When User need to search GRN for GSTIN verification For Damage in Trainsit Disposition
    And User need to click the edit icon for GSTIN number verification For Damage in Trainsit Disposition
    And User need to click the I verify button GSTIN number verification For Damage in Trainsit Disposition
    And User need to verify the GSTIN number and click verify button For Damage in Trainsit Disposition
    And User need to click the submit and print label For Damage in Trainsit Disposition
    And User need to close the current GSTIN verification page For Damage in Trainsit Disposition

  Scenario: Putaway Process for New supplier GRN For Damage in Trainsit Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process For Damage in Trainsit Disposition
    When User need to search GRN for putaway process For Damage in Trainsit Disposition
    And User need to click the edit icon for for putaway process For Damage in Trainsit Disposition
    And User need to click putaway done by clicking Yes For Damage in Trainsit Disposition
    And User need to click the submit button for putaway process For Damage in Trainsit Disposition
    And User need to close the putaway process page For Damage in Trainsit Disposition