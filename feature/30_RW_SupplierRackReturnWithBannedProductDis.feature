@SupplierRackReturnWithBannedProductDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Banned Product Disposition
Given user Need to get into supplier return page for make Supplier rack returns
When user Need to cancel new GRN Immediate Return - Select GRN page for get into rack return draft
And user Need to provide the Item Id and click the suggestion
And user Need to provide the Item batch Id and click the suggestion
And user Need to select appropriate tnx by clicking add Icon
And user Need to provide the return qty 
And user Need to select the appropriate line Item by clicking check Box
And user Need to click Proceed button
And user Need to provide the disposition for selected line Item
And user Need to click The submit button
And user Need to Close the supplier return Page