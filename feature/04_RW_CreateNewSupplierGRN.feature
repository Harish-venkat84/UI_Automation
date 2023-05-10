@CreateNewSupplierGRN
Feature: To Create New Supplier GRN
----------------------------------

Scenario: Create New supplier GRN using GDN
Given User need to get into the supplier GRN page
When User need to provide the supplier name in supplier invoice details
And User need to provide the supplier invoice number and clikc the suggestion
And User need to select supply type by clicking check box
And User need to click the proceed button
And User need to provide the disposition for all given items
And User need to provide the supplier bill amount
And User need to click the submit button
And User need to click the upload supplier invoice scan copies
And User need to select the appropriate file
And User need to upload the selected file
And User need to verify scan copy with GRN entry totals and line item entries
And User need to approve the supplier invoice
And User need to close the supplier invoice page
And User need to capture the Txn Id for further process
And user need to close the supplier GRN page


Scenario: Vendor Margin variance Detected verification 
Given User need to provide the GRN transaction id in transaction field  
When User need to search GRN using the transection Id
And User need to click the edit icon for the GRN verification 
And User need to click the I verify button for vendor margin approve
And User need to click the Approve GRN
And User need to close the current GRN page


Scenario: GSTIN Number Verification for the Supplier GRN
Given User need to provide the GRN transaction id in transaction field for GSTIN number verification  
When User need to search GRN for GSTIN verification
And User need to click the edit icon for GSTIN number verification
And User need to click the I verify button GSTIN number verification
And User need to verify the GSTIN number and click verify button
And User need to click the submit and print label
And User need to close the current GSTIN verification page


Scenario: Putaway Process for New supplier GRN
Given User need to provide the GRN transaction id in transaction field for for putaway process  
When User need to search GRN for putaway process
And User need to click the edit icon for for putaway process
And User need to click putaway done by clicking Yes
And User need to click the submit button for putaway process
And User need to close the putaway process page
