@withlogin 
Feature: To validate addtocart functionality

  Background: 
    Given The user should be in home page
    And The user must select a product
    And The user must click the Addtocart option
    
  
  Scenario: To verify the user should be in login page after clicked addtocart option
    
    Then The user must be in login page
 
  Scenario: To verify the user should be in account page after login
    When The user must login
    Then The user must be in account page
       
  
  Scenario: To verify the user should be in home page after select an home option from accountpage
    And The user must login
    When The user must click "home" button
    Then The user must be in home page
    
  @test3
  Scenario: To verify the user can increase the quantity of product
    
    And The user must login
    And The user must click "home" button
    And The user must select a product
    And The user must increase the quantity of product
    Then The quantity must be increased
  @test2
  Scenario: To verify the quantity is increased in addtocart page
    
    And The user must login
    And The user must click "home" button
    And The user must select a product
    And The user must increase the quantity of product
    Then The quantity must be increased
    
    @sri
   Scenario: To verify the user should be in cartpage
    And The user must login
    And The user must be in account page 
    When The user must click "back to cart" button
     
    