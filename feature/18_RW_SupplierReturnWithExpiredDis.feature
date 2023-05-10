@SupplierReturnWithExpiredDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Expired disposition
Given User need to get into new supplier return Page for make supplier return
When User need to provide supplier name in supplier field and click the suggestion
And User need to give the supplier Tnx Ids in the Tnx Id field for find the Txn
And User need to click the search buttons for figure out supplier 
And User need to select the appropriate Tnxs with supplier names
And User need to un-select exclude ok disposition
And User need to click the make return button for make supplier returns
And User need to click submit button for suppliers return
And User need to close new supplier return page