@SupplierReturnWithDamagedDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Return With Damaged disposition
Given User need to get into the supplier return Page
When User need to provide the supplier name in the supplier field and click suggestion
And User need to provide the supplier Tnx Id in the Tnx Id field
And User need to click the search button for found supplier 
And User need to select the appropriate Tnx with correct supplier name
And User need to unselect the exclude ok dispositions
And User need to click the make return button
And User need to select the disposition for all given line item
And User need to submit the supplier return
And User need to close the supplier return page
