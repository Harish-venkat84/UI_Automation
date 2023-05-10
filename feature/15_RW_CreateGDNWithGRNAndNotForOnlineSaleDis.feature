@CreateGDNWithGRNAndNotForOnlineSaleDis
Feature: To Create GDN With GRN and Not For Online Sale Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Not For Online Sale Disposition
   	Given User need to switch appropriate FC using FC switcher for create GDN
    When User need to get in to supplier GDN page
    And User need to select the imports supplierGDN
    And User need to select the correct file for generate GDN
    And User need to upload the selected file for supplier GDN
    And User need to close the import supplier GRN page by clicking cross mark
    And User need to close the supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and Not For Online Sale Disposition
    Given User need to get into the supplier GRN page for Not For Online Sale Disposition
    When User need to provide the supplier name in supplier invoice details for Not For Online Sale Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Not For Online Sale Disposition
    And User need to select supply type by clicking check box for Not For Online Sale Disposition
    And User need to click the proceed button for Not For Online Sale Disposition
    And User need to provide the disposition for all given items for Not For Online Sale Disposition
    And User need to provide the supplier bill amount for Not For Online Sale Disposition
    And User need to click the submit button for Not For Online Sale Disposition
    And User need to click the upload supplier invoice scan copies for Not For Online Sale Disposition
    And User need to select the appropriate file for Not For Online Sale Disposition
    And User need to upload the selected file for Not For Online Sale Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Not For Online Sale Disposition
    And User need to approve the supplier invoice for Not For Online Sale Disposition
    And User need to close the supplier invoice page for Not For Online Sale Disposition
    And User need to capture the Txn Id for further process for Not For Online Sale Disposition
    And user need to close the supplier GRN page for Not For Online Sale Disposition

  Scenario: Vendor Margin variance Detected verification for Not For Online Sale Disposition
    Given User need to provide the GRN transaction id in transaction field for Not For Online Sale Disposition
    When User need to search GRN using the transection Id for Not For Online Sale Disposition
    And User need to click the edit icon for the GRN verification for Not For Online Sale Disposition
    And User need to click the I verify button for vendor margin approve for Not For Online Sale Disposition
    And User need to click the Approve GRN for Not For Online Sale Disposition
    And User need to close the current GRN page for Not For Online Sale Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Not For Online Sale Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Not For Online Sale Disposition
    When User need to search GRN for GSTIN verification for Not For Online Sale Disposition
    And User need to click the edit icon for GSTIN number verification for Not For Online Sale Disposition
    And User need to click the I verify button GSTIN number verification for Not For Online Sale Disposition
    And User need to verify the GSTIN number and click verify button for Not For Online Sale Disposition
    And User need to click the submit and print label for Not For Online Sale Disposition
    And User need to close the current GSTIN verification page for Not For Online Sale Disposition

  Scenario: Putaway Process for New supplier GRN for Not For Online Sale Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Not For Online Sale Disposition
    When User need to search GRN for putaway process for Not For Online Sale Disposition
    And User need to click the edit icon for for putaway process for Not For Online Sale Disposition
    And User need to click putaway done by clicking Yes for Not For Online Sale Disposition
    And User need to click the submit button for putaway process for Not For Online Sale Disposition
    And User need to close the putaway process page for Not For Online Sale Disposition
    