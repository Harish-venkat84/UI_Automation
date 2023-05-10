@SupplierReturnWithNotSuppliedDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Not Supplied disposition
Given User need to get into new supplier return page for make supplier return
When User need to provide supplier name in Supplier field and click the suggestion
And User need to give the supplier Tnx Ids in the tnx Id field for find the Txn
And User need to click the search buttons for findout supplier 
And User need to select the appropriate tnxs with supplier names
And User need to un-Select exclude ok disposition
And User need to click the make return button for make Supplier returns
And User need to click Submit button for suppliers return
And User need to close new Supplier return page