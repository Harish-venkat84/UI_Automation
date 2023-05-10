@CreateGDNWithGRNAndBatchMRPMismatch-AcceptedDisposition
Feature: To Create GDN With GRN and Batch MRP Mismatch-Accepted Disposition
  ----------------------------------

  Scenario: Create New supplier GDN
    Given User need to switch appropriate FCs using FC switchers
    When User need to get in to the new supplier GDN page
    And User need to select the imports suppliers GDN
    And User need to select correct GDN file
    And User need to upload the selected file for new suppliers GDN
    And User need to close the imports GRN page by clicking cross marks
    And User need to close the new suppliers GDN page
    
    Scenario: Create New supplier GRN using GDN and Batch MRP Mismatch-Accepted Disposition
    Given User need to get into the supplier GRN page for Batch MRP Mismatch-Accepted Disposition
    When User need to provide the supplier name in supplier invoice details for Batch MRP Mismatch-Accepted Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Batch MRP Mismatch-Accepted Disposition
    And User need to select supply type by clicking check box for Batch MRP Mismatch-Accepted Disposition
    And User need to click the proceed button for Batch MRP Mismatch-Accepted Disposition
    And User need to provide the disposition for all given items for Batch MRP Mismatch-Accepted Disposition
    And User need to provide the supplier bill amount for Batch MRP Mismatch-Accepted Disposition
    And User need to click the submit button for Batch MRP Mismatch-Accepted Disposition
    And User need to click the upload supplier invoice scan copies for Batch MRP Mismatch-Accepted Disposition
    And User need to select the appropriate file for Batch MRP Mismatch-Accepted Disposition
    And User need to upload the selected file for Batch MRP Mismatch-Accepted Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Batch MRP Mismatch-Accepted Disposition
    And User need to approve the supplier invoice for Batch MRP Mismatch-Accepted Disposition
    And User need to close the supplier invoice page for Batch MRP Mismatch-Accepted Disposition
    And User need to capture the Txn Id for further process for Batch MRP Mismatch-Accepted Disposition
    And user need to close the supplier GRN page for Batch MRP Mismatch-Accepted Disposition

  Scenario: Vendor Margin variance Detected verification for Batch MRP Mismatch-Accepted Disposition
    Given User need to provide the GRN transaction id in transaction field for Batch MRP Mismatch-Accepted Disposition
    When User need to search GRN using the transection Id for Batch MRP Mismatch-Accepted Disposition
    And User need to click the edit icon for the GRN verification for Batch MRP Mismatch-Accepted Disposition
    And User need to click the I verify button for vendor margin approve for Batch MRP Mismatch-Accepted Disposition
    And User need to click the Approve GRN for Batch MRP Mismatch-Accepted Disposition
    And User need to close the current GRN page for Batch MRP Mismatch-Accepted Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Batch MRP Mismatch-Accepted Disposition
    Given User need to provide the GRN transaction id in the transaction field for Batch MRP Mismatch-Accepted Disposition
    When User need to search GRN for GSTIN verification for Batch MRP Mismatch-Accepted Disposition
    And User need to click the edit icon for GSTIN number verification for Batch MRP Mismatch-Accepted Disposition
    And User need to click the I verify button GSTIN number verification for Batch MRP Mismatch-Accepted Disposition
    And User need to verify the GSTIN number and click verify button for Batch MRP Mismatch-Accepted Disposition
    And User need to click the submit and print label for Batch MRP Mismatch-Accepted Disposition
    And User need to close the current GSTIN verification page for Batch MRP Mismatch-Accepted Disposition

  Scenario: Putaway Process for New supplier GRN for Batch MRP Mismatch-Accepted Disposition
    Given User need to provide the GRN transaction id in transaction field for putaway process for Batch MRP Mismatch-Accepted Disposition
    When User need to search GRN for putaway process for Batch MRP Mismatch-Accepted Disposition
    And User need to click the edit icon for for putaway process for Batch MRP Mismatch-Accepted Disposition
    And User need to click putaway done by clicking Yes for Batch MRP Mismatch-Accepted Disposition
    And User need to click the submit button for putaway process for Batch MRP Mismatch-Accepted Disposition
    And User need to close the putaway process page for Batch MRP Mismatch-Accepted Disposition
    