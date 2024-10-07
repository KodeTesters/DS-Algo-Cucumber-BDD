
@Stackpage
Feature: Stack page validation dsalgo

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
    
    Scenario: User navigates the Stack page
      Given The user is on Home page after logged in
      When The User clicks on the Stack Get Started button
      Then The User is redirected to the "Stack" page
    
    Scenario: User navigates to the Operations in Stack Page
      Given The User is in the "Stack page" after logged in 
      When The User clicks the Operations in Stack link
      Then The User is redirected to the page with title "Operations in Stack"
     
    Scenario: The User navigates to tryEditor page from Operations in Stack page
      Given The User is in the "Operations in Stack page" after logged in
      When The User clicks Try here button in Operations in stack page
      Then The User should be redirected to the page with title "tryEditor"
    
    Scenario: The User able to run Python code in tryEditor for Operations in Stack page 
    Given The User is in tryEditor page of Operations in Stack
    When The User enter a python code in try Editor
     | print"Operations in Stack" |
    And The User clicks the Run button 
    Then The User get the run output 
    
    Scenario: The User able to run with invalid Python code in tryEditor for Operations in Stack page 
    Given The User is in tryEditor page of Operations in Stack
    When The User enter a invalid python code in try Editor
     | print Operations in Stack |
    And The User clicks the Run button 
    Then The User get the Alert message 
    
    Scenario: The User navigates to Implementation in stack page
    Given The User is in the "Stack page" after logged in
    When The User clicks on the Implementation link
    Then The User should be redirected to the page with title "Implementation" 
    
    Scenario: The User navigates to tryEditor page from Implementation page
    Given The User is in the "Stack Implementation page" after logged in
    When The User clicks Try here button in stack Implementation page
    Then The User should be redirected to the page with title "tryEditor"
    
    
    Scenario: The User able to run Python code in tryEditor for Implementation page
    Given The User is in tryEditor page of Stack Implementation
    When The User enter a python code in try Editor
     | print"Implementation in Stack" |
    And The User clicks the Run button 
    Then The User get the run output 
     
    Scenario: The User navigates to Applications in stack page
    Given The User is in the "Stack page" after logged in
    When The User clicks on the Applications link
    Then The User should be redirected to the page with title "Applications" 

   Scenario: The User navigates to tryEditor page from Applications page
   Given The User is in the "Application stack page" after logged in
   When The User clicks Try here button in Applications page
   Then The User should be redirected to the page with title "tryEditor"

   Scenario: The User able to run Python code in tryEditor for Application page
   Given The User is in tryEditor page of Stack Applications
   When The User enter a python code in try Editor
    | print"Applications in Stack" |
   And The User clicks the Run button
   Then The User get the run output
    
    Scenario: The User navigates to Practice Questions in stack page
    Given The User is in the "Stack page" after logged in
    When The User clicks on the Practice Questions link
    Then The User should be redirected to the page with title "practice Questions"
    
