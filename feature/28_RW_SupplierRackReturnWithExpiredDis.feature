@SupplierRackReturnWithExpiredDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Expired Disposition
Given User need to get into supplier return page for make Supplier rack returns
When User need to cancel new GRN Immediate Return - Select GRN page for get into rack return draft
And User need to provide the Item Id and click the suggestion
And User need to provide the Item batch Id and click the suggestion
And User need to select appropriate tnx by clicking add Icon
And User need to provide the return qty 
And User need to select the appropriate line Item by clicking check Box
And User need to click Proceed button
And User need to provide the disposition for selected line Item
And User need to click The submit button
And User need to Close the supplier return Page