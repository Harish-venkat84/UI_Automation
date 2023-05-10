@SupplierRackReturnWithDPCOIssueDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With DPCO Issue Disposition
Given user Need To Get into supplier return page for make Supplier Rack returns
When user Need To Cancel new GRN Immediate Return - Select GRN page for get into rack Return draft
And user Need To Provide the Item Id and click the Suggestion
And user Need To Provide the Item batch Id and click the Suggestion
And user Need To Select appropriate tnx by clicking Add Icon
And user Need To Provide the return Qty 
And user Need To Select the appropriate line Item by clicking Check Box
And user Need To click Proceed button
And user Need To Provide the disposition for selected Line Item
And user Need To Click The Submit button
And user Need To Close The supplier Return Page