Feature: To validate Addtocart functionality

Background: 
    Given The user should be in home page and then login
    And The user must select a product
    When The user must click the Addtocart option
    
  
  Scenario: To verify addtocart option is clickable or not
   
    Then The addtocart option must be clicked
    
   Scenario: To verify popup menu appears after addtocart option is clicked
   
    Then A popup menu must appear  

  Scenario: To verify view cart option is displayed or not
  
    Then The view cart option must be displayed
    
   Scenario: To verify view cart option is clickable or not
  
    Then The user must select the view cart option  
    
   Scenario: To verify continue shopping option is displayed or not
   
    Then The continue shopping option must be displayed
    
     Scenario: To verify continue from shop option is displayed or not
  
    Then The continue from shop option must be displayed
  
  Scenario: To verify the product quantity can be increased in cart page
    
    And The user must select the view cart option
    And The user must increase the quantity of product
    Then The quantity must be increased
