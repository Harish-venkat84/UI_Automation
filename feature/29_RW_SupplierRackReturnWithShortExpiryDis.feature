@SupplierRackReturnWithShortExpiryDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Short Expiry Disposition
Given user need to get into supplier return page for make Supplier rack returns
When user need to cancel new GRN Immediate Return - Select GRN page for get into rack return draft
And user need to provide the Item Id and click the suggestion
And user need to provide the Item batch Id and click the suggestion
And user need to select appropriate tnx by clicking add Icon
And user need to provide the return qty 
And user need to select the appropriate line Item by clicking check Box
And user need to click Proceed button
And user need to provide the disposition for selected line Item
And user need to click The submit button
And user need to Close the supplier return Page