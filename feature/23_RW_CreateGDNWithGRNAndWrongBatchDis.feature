@CreateGDNWithGRNAndWrongBatchDis
Feature: To Create GDN With GRN and Wrong Batch Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Wrong Batch Disposition
   	Given User need to switch into appropriate FCs using FC Switcher for generate GDN
    When User need to get in to the New suppliers GDN
    And User need to Select the imports file new GDN
    And User need to Select the correct file for create new supplier GDN
    And User need to upload the Selected file for generate supplier GDN
    And User need to close import Supplier GRN page by click cross marks
    And User need to close the new Supplier GDN page
    
 Scenario: Create New supplier GRN using GDN and Wrong Batch Disposition
    Given User need to get into the supplier GRN page for Wrong Batch Disposition
    When User need to provide the supplier name in supplier invoice details for Wrong Batch Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Wrong Batch Disposition
    And User need to select supply type by clicking check box for Wrong Batch Disposition
    And User need to click the proceed button for Wrong Batch Disposition
    And User need to provide the disposition for all given items for Wrong Batch Disposition
    And User need to provide the supplier bill amount for Wrong Batch Disposition
    And User need to click the submit button for Wrong Batch Disposition
    And User need to click the upload supplier invoice scan copies for Wrong Batch Disposition
    And User need to select the appropriate file for Wrong Batch Disposition
    And User need to upload the selected file for Wrong Batch Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Wrong Batch Disposition
    And User need to approve the supplier invoice for Wrong Batch Disposition
    And User need to close the supplier invoice page for Wrong Batch Disposition
    And User need to capture the Txn Id for further process for Wrong Batch Disposition
    And user need to close the supplier GRN page for Wrong Batch Disposition

  Scenario: Vendor Margin variance Detected verification for Wrong Batch Disposition
    Given User need to provide the GRN transaction id in transaction field for Wrong Batch Disposition
    When User need to search GRN using the transection Id for Wrong Batch Disposition
    And User need to click the edit icon for the GRN verification for Wrong Batch Disposition
    And User need to click the I verify button for vendor margin approve for Wrong Batch Disposition
    And User need to click the Approve GRN for Wrong Batch Disposition
    And User need to close the current GRN page for Wrong Batch Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Wrong Batch Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Wrong Batch Disposition
    When User need to search GRN for GSTIN verification for Wrong Batch Disposition
    And User need to click the edit icon for GSTIN number verification for Wrong Batch Disposition
    And User need to click the I verify button GSTIN number verification for Wrong Batch Disposition
    And User need to verify the GSTIN number and click verify button for Wrong Batch Disposition
    And User need to click the submit and print label for Wrong Batch Disposition
    And User need to close the current GSTIN verification page for Wrong Batch Disposition

  Scenario: Putaway Process for New supplier GRN for Wrong Batch Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Wrong Batch Disposition
    When User need to search GRN for putaway process for Wrong Batch Disposition
    And User need to click the edit icon for for putaway process for Wrong Batch Disposition
    And User need to click putaway done by clicking Yes for Wrong Batch Disposition
    And User need to click the submit button for putaway process for Wrong Batch Disposition
    And User need to close the putaway process page for Wrong Batch Disposition   