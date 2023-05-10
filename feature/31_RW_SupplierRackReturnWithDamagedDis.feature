@SupplierRackReturnWithDamagedDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Damaged Disposition
Given user Need to get into supplier return page for make Supplier Rack returns
When user Need to cancel new GRN Immediate Return - Select GRN page for get into rack Return draft
And user Need to provide the Item Id and click the Suggestion
And user Need to provide the Item batch Id and click the Suggestion
And user Need to select appropriate tnx by clicking Add Icon
And user Need to provide the return Qty 
And user Need to select the appropriate line Item by clicking Check Box
And user Need to Click Proceed button
And user Need to provide the disposition for selected Line Item
And user Need to click The Submit button
And user Need to Close the supplier Return Page