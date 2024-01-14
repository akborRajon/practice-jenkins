Feature: searching product

Scenario Outline: searching products in google

Given i am on the google page 


When  i enter the "<product_name>" in the search bar
And i click on the search button 
Then i can see the search result successfully

Examples:
|product_name|
|Toy         |


