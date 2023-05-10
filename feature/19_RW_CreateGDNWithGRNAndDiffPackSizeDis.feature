@CreateGDNWithGRNAndDiffPackSizeDis
Feature: To Create GDN With GRN and Diff Pack Size Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Diff Pack Size Disposition
   	Given User need to switch into appropriate FCs using FC switcher for create GDN
    When User need to get in to the new suppliers GDN page
    And User need to select the imports file new supplier GDN
    And User need to select the correct file for generate new supplier GDN
    And User need to upload the selected file for new supplier  GDN
    And User need to close the import supplier GRN page by click cross marks
    And User need to close new GDN page
    
    Scenario: Create New supplier GRN using GDN and Diff Pack Size Disposition
    Given User need to get into the supplier GRN page for Diff Pack Size Disposition
    When User need to provide the supplier name in supplier invoice details for Diff Pack Size Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Diff Pack Size Disposition
    And User need to select supply type by clicking check box for Diff Pack Size Disposition
    And User need to click the proceed button for Diff Pack Size Disposition
    And User need to provide the disposition for all given items for Diff Pack Size Disposition
    And User need to provide the supplier bill amount for Diff Pack Size Disposition
    And User need to click the submit button for Diff Pack Size Disposition
    And User need to click the upload supplier invoice scan copies for Diff Pack Size Disposition
    And User need to select the appropriate file for Diff Pack Size Disposition
    And User need to upload the selected file for Diff Pack Size Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Diff Pack Size Disposition
    And User need to approve the supplier invoice for Diff Pack Size Disposition
    And User need to close the supplier invoice page for Diff Pack Size Disposition
    And User need to capture the Txn Id for further process for Diff Pack Size Disposition
    And user need to close the supplier GRN page for Diff Pack Size Disposition

  Scenario: Vendor Margin variance Detected verification for Diff Pack Size Disposition
    Given User need to provide the GRN transaction id in transaction field for Diff Pack Size Disposition
    When User need to search GRN using the transection Id for Diff Pack Size Disposition
    And User need to click the edit icon for the GRN verification for Diff Pack Size Disposition
    And User need to click the I verify button for vendor margin approve for Diff Pack Size Disposition
    And User need to click the Approve GRN for Diff Pack Size Disposition
    And User need to close the current GRN page for Diff Pack Size Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Diff Pack Size Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Diff Pack Size Disposition
    When User need to search GRN for GSTIN verification for Diff Pack Size Disposition
    And User need to click the edit icon for GSTIN number verification for Diff Pack Size Disposition
    And User need to click the I verify button GSTIN number verification for Diff Pack Size Disposition
    And User need to verify the GSTIN number and click verify button for Diff Pack Size Disposition
    And User need to click the submit and print label for Diff Pack Size Disposition
    And User need to close the current GSTIN verification page for Diff Pack Size Disposition

  Scenario: Putaway Process for New supplier GRN for Diff Pack Size Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Diff Pack Size Disposition
    When User need to search GRN for putaway process for Diff Pack Size Disposition
    And User need to click the edit icon for for putaway process for Diff Pack Size Disposition
    And User need to click putaway done by clicking Yes for Diff Pack Size Disposition
    And User need to click the submit button for putaway process for Diff Pack Size Disposition
    And User need to close the putaway process page for Diff Pack Size Disposition