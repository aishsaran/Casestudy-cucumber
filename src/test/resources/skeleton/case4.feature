Feature: check cart
Scenario: The one where the user moves to cart without adding any item in it
Given  alex has registered in to TestMeApp
When Alex search a particular product like headphone
And  try to proceed to payment without adding any item in the cart
Then TestMEapp doesn't display the cart icon