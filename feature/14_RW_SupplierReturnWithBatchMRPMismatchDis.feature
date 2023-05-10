@SupplierReturnWithBatchMRPMismatchDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Batch MRP Mismatch disposition
Given User need to get into the suppliers return Page for make supplier return
When User need to provide the supplier name in the supplier field & click the suggestion
And User need to provide the supplier Tnx Id in the Tnx Id field for find the supplier Txn
And User need to click the search button for find suppliers 
And User need to select the appropriate Tnx with correct suppliers name
And User need to un-select the exclude ok disposition
And User need to click make return button for make return
And user need to select the dispostion for all given line items
And User need to click submit button for supplier return
And User need to close the supplier return page's