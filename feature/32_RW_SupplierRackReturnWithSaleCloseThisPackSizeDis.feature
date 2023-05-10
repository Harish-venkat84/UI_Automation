@SupplierRackReturnWithSaleCloseThisPackSizeDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Sale Close This Pack Size Disposition
Given user Need To get into supplier return page for make Supplier Rack returns
When user Need To cancel new GRN Immediate Return - Select GRN page for get into rack Return draft
And user Need To provide the Item Id and click the Suggestion
And user Need To provide the Item batch Id and click the Suggestion
And user Need To select appropriate tnx by clicking Add Icon
And user Need To provide the return Qty 
And user Need To select the appropriate line Item by clicking Check Box
And user Need To Click Proceed button
And user Need To provide the disposition for selected Line Item
And user Need To click The Submit button
And user Need To Close the supplier Return Page