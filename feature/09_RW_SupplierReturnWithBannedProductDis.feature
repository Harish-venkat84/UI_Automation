@SupplierReturnWithBannedProductDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Banned Product disposition
Given User need to get into the supplier return Page for make supplier return
When User need to provide the supplier name in the supplier field and click the suggestion
And User need to provide the supplier Tnx Id in the Tnx Id field for find the Txn
And User need to click the search button for find supplier 
And User need to select the appropriate Tnx with supplier name
And User need to unselect the exclude ok disposition
And User need to click the make return button for make return
And User need to click the submit button for supplier return
And User need to close supplier return page
