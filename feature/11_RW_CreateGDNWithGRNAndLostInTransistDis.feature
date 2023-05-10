	@CreateGDNWithGRNAndLostInTransistDisposition
Feature: To Create GDN With GRN and Lost in Transist Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Lost in Transist Disposition
   	Given User need to switch appropriate FC using FC switcher to create GDN for Lost in Transist Disposition
    When User need to get into the supplier GDN page for Lost in Transist Disposition
    And User need to select the import supplierGDN for Lost in Transist Disposition
    And User need to select the correct file for Lost in Transist Disposition
    And User need to upload the selected file for GDN for Lost in Transist Disposition
    And User need to close the import GRN page by clicking cross mark for Lost in Transist Disposition
    And User need to close the GDN page for Lost in Transist Disposition
    
  Scenario: Create New supplier GRN using GDN For Lost in Transist Disposition
    Given User need to get into the supplier GRN page for Lost in Transist Disposition
    When User need to provide the supplier name in supplier invoice details for Lost in Transist Disposition
    And User need to provide the supplier invoice number and clikc the suggestion For Lost in Transist Disposition
    And User need to select supply type by clicking check box For Lost in Transist Disposition
    And User need to click the proceed button For Lost in Transist Disposition
    And User need to provide the disposition for all given items For Lost in Transist Disposition
    And User need to provide the supplier bill amount For Lost in Transist Disposition
    And User need to click the submit button For Lost in Transist Disposition
    And User need to click the upload supplier invoice scan copies For Lost in Transist Disposition
    And User need to select the appropriate file For Lost in Transist Disposition
    And User need to upload the selected file For Lost in Transist Disposition
    And User need to verify scan copy with GRN entry totals and line item entries For Lost in Transist Disposition
    And User need to approve the supplier invoice For Lost in Transist Disposition
    And User need to close the supplier invoice page For Lost in Transist Disposition
    And User need to capture the Txn Id for further process For Lost in Transist Disposition
    And user need to close the supplier GRN page For Lost in Transist Disposition

  Scenario: Vendor Margin variance Detected verification For Lost in Transist Disposition
    Given User need to provide the GRN transaction id in transaction field For Lost in Transist Disposition
    When User need to search GRN using the transection Id For Lost in Transist Disposition
    And User need to click the edit icon for the GRN verification For Lost in Transist Disposition
    And User need to Allow Intransit Lost or Damage by clicking Yes button for Lost in Transist Disposition
    And User need to confirm Lost in Transit, Damage in Transit disposition will not added in inventory by clicking Yes for Lost in Transist Disposition
    And User need to click the I verify button for vendor margin approve For Lost in Transist Disposition
    And User need to click the Approve GRN For Lost in Transist Disposition
    And User need to close the current GRN page For Lost in Transist Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN For Lost in Transist Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification For Lost in Transist Disposition
    When User need to search GRN for GSTIN verification For Lost in Transist Disposition
    And User need to click the edit icon for GSTIN number verification For Lost in Transist Disposition
    And User need to click the I verify button GSTIN number verification For Lost in Transist Disposition
    And User need to verify the GSTIN number and click verify button For Lost in Transist Disposition
    And User need to click the submit and print label For Lost in Transist Disposition
    And User need to close the current GSTIN verification page For Lost in Transist Disposition

  Scenario: Putaway Process for New supplier GRN For Lost in Transist Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process For Lost in Transist Disposition
    When User need to search GRN for putaway process For Lost in Transist Disposition
    And User need to click the edit icon for for putaway process For Lost in Transist Disposition
    And User need to click putaway done by clicking Yes For Lost in Transist Disposition
    And User need to click the submit button for putaway process For Lost in Transist Disposition
    And User need to close the putaway process page For Lost in Transist Disposition