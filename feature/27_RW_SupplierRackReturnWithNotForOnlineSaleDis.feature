@SupplierRackReturnWithNotForOnlineSaleDis
Feature: To Create New Supplier Return
-------------------------------
 
Scenario: Create New Supplier Rack Return With Damaged Disposition
Given User need to get into supplier return page for make Supplier returns
When User need to cancel New GRN Immediate Return - Select GRN page for get into rack return draft
And User need to provide the Item id and click the suggestion
And User need to provide the Item batch id and click the suggestion
And User need to select appropriate tnx by clicking add icon
And User need to provide the return Qty 
And User need to select the appropriate line Item by clicking check box
And User need to click proceed button
And User need to provide the disposition for selected line item
And User need to click the Submit button
And User need to Close the supplier return page
  