@SupplierReturnWithNotForOnlineSaleDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Not For Online Sale disposition
Given User need to get in to the supplier return Page for make supplier return
When User need to provide supplier name in the supplier field and click the suggestion
And User need to give the supplier Tnx Id in the Tnx Id field for find the Txn
And User need to click the search buttons for find supplier 
And User need to select the appropriate Tnx with supplier names
And User need to unselect exclude ok disposition
And User need to click the make return button for make supplier return
And User need to click the submit button for suppliers return
And User need to close the new supplier return page