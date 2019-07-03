Feature: searching product
Description: Alex logs into Testmeapp and searches for the product in the search engine and
by typing just 4 characters he got all the appropriate result

Scenario: search product
Given Alex is on login page
When alex enters username as "aishsaran" 
When alex enters password as "aishusaran"
And clicks on submit button
When Alex searches for the product
Then verifies the product

 