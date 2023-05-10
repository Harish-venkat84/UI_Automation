@CreateGDNWithGRNAndNotOrderedDis
Feature: To Create GDN With GRN and Not Ordered Disposition
  ------------------------------------------------------------

  Scenario: Create New GDN with Not Ordered Disposition
   	Given User need to switch into appropriate FCs using FC switcher for generate GDN
    When User need to get in to the new suppliers GDN
    And User need to select the imports file new GDN
    And User need to select the correct file for create new supplier GDN
    And User need to upload the selected file for generate supplier GDN
    And User need to close import supplier GRN page by click cross marks
    And User need to close the new supplier GDN pages
    
    Scenario: Create New supplier GRN using GDN and Not Ordered Disposition
    Given User need to get into the supplier GRN page for Not Ordered Disposition
    When User need to provide the supplier name in supplier invoice details for Not Ordered Disposition
    And User need to provide the supplier invoice number and clikc the suggestion for Not Ordered Disposition
    And User need to select supply type by clicking check box for Not Ordered Disposition
    And User need to click the proceed button for Not Ordered Disposition
    And User need to provide the disposition for all given items for Not Ordered Disposition
    And User need to provide the supplier bill amount for Not Ordered Disposition
    And User need to click the submit button for Not Ordered Disposition
    And User need to click the upload supplier invoice scan copies for Not Ordered Disposition
    And User need to select the appropriate file for Not Ordered Disposition
    And User need to upload the selected file for Not Ordered Disposition
    And User need to verify scan copy with GRN entry totals and line item entries for Not Ordered Disposition
    And User need to approve the supplier invoice for Not Ordered Disposition
    And User need to close the supplier invoice page for Not Ordered Disposition
    And User need to capture the Txn Id for further process for Not Ordered Disposition
    And user need to close the supplier GRN page for Not Ordered Disposition

  Scenario: Vendor Margin variance Detected verification for Not Ordered Disposition
    Given User need to provide the GRN transaction id in transaction field for Not Ordered Disposition
    When User need to search GRN using the transection Id for Not Ordered Disposition
    And User need to click the edit icon for the GRN verification for Not Ordered Disposition
    And User need to click the I verify button for vendor margin approve for Not Ordered Disposition
    And User need to click the Approve GRN for Not Ordered Disposition
    And User need to close the current GRN page for Not Ordered Disposition

  Scenario: GSTIN Number Verification for the Supplier GRN for Not Ordered Disposition
    Given User need to provide the GRN transaction id in transaction field for GSTIN number verification for Not Ordered Disposition
    When User need to search GRN for GSTIN verification for Not Ordered Disposition
    And User need to click the edit icon for GSTIN number verification for Not Ordered Disposition
    And User need to click the I verify button GSTIN number verification for Not Ordered Disposition
    And User need to verify the GSTIN number and click verify button for Not Ordered Disposition
    And User need to click the submit and print label for Not Ordered Disposition
    And User need to close the current GSTIN verification page for Not Ordered Disposition

  Scenario: Putaway Process for New supplier GRN for Not Ordered Disposition
    Given User need to provide the GRN transaction id in transaction field for for putaway process for Not Ordered Disposition
    When User need to search GRN for putaway process for Not Ordered Disposition
    And User need to click the edit icon for for putaway process for Not Ordered Disposition
    And User need to click putaway done by clicking Yes for Not Ordered Disposition
    And User need to click the submit button for putaway process for Not Ordered Disposition
    And User need to close the putaway process page for Not Ordered Disposition