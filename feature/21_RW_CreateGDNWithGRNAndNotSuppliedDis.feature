@CreateGDNWithGRNAndNotSuppliedDis
Feature: To Create GDN With GRN and Not Supplied Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Not Supplied Disposition
   	Given user need to switch into appropriate FCs using FC switcher for generate GDN
    When user need to get in to the new suppliers GDN
    And user need to select the imports file new GDN
    And user need to select the correct file for create new supplier GDN
    And user need to upload the selected file for generate supplier GDN
    And user need to close import supplier GRN page by click cross marks
    And user need to close the new supplier GDN page
    
    Scenario: Create New supplier GRN using GDN and Not Supplied Disposition
    Given User need to get into the supplier GRN page for Not Supplied Disposition
    When User need to provide the supplier name in supplier invoice details for Not Supplied Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Not Supplied Disposition
    And User need to select supply type by clicking check box for Not Supplied Disposition
    And User need to click the proceed button for Not Supplied Disposition
    And User need to provide the disposition for all given items for Not Supplied Disposition
    And User need to provide the supplier bill amount for Not Supplied Disposition
    And User need to click the submit button for Not Supplied Disposition
    And User need to click the upload supplier invoice scan copies for Not Supplied Disposition
    And User need to select the appropriate file for Not Supplied Disposition
    And User need to upload the selected file for Not Supplied Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Not Supplied Disposition
    And User need to approve the supplier invoice for Not Supplied Disposition
    And User need to close the supplier invoice page for Not Supplied Disposition
    And User need to capture the Txn Id for further process for Not Supplied Disposition
    And user need to close the supplier GRN page for Not Supplied Disposition

  Scenario: Vendor Margin variance Detected verification for Not Supplied Disposition
    Given User need to provide the GRN transaction id in transaction field for Not Supplied Disposition
    When User need to search GRN using the transection Id for Not Supplied Disposition
    And User need to click the edit icon for the GRN verification for Not Supplied Disposition
    And User need to click the I verify button for vendor margin approve for Not Supplied Disposition
    And User need to click the Approve GRN for Not Supplied Disposition
    And User need to close the current GRN page for Not Supplied Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Not Supplied Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Not Supplied Disposition
    When User need to search GRN for GSTIN verification for Not Supplied Disposition
    And User need to click the edit icon for GSTIN number verification for Not Supplied Disposition
    And User need to click the I verify button GSTIN number verification for Not Supplied Disposition
    And User need to verify the GSTIN number and click verify button for Not Supplied Disposition
    And User need to click the submit and print label for Not Supplied Disposition
    And User need to close the current GSTIN verification page for Not Supplied Disposition

  Scenario: Putaway Process for New supplier GRN for Not Supplied Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Not Supplied Disposition
    When User need to search GRN for putaway process for Not Supplied Disposition
    And User need to click the edit icon for for putaway process for Not Supplied Disposition
    And User need to click putaway done by clicking Yes for Not Supplied Disposition
    And User need to click the submit button for putaway process for Not Supplied Disposition
    And User need to close the putaway process page for Not Supplied Disposition