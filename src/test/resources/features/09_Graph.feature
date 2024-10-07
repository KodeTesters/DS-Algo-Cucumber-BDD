
@GraphPage
Feature: Graph  page validation in  dsalgo
 Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
    
   Scenario: The user is navigate to Graph DS page
     Given The user is on Home page after logged in
     When user clicks on Graph getstarted
     Then User redirected to "Graph" page 
     
    Scenario: User Should navigate to Graph Explanation Page
    Given User is on the Graph page
    When User clicks on Graph Link in Graph Page 
    Then User redirected to "Graph" page
    
    Scenario: The user is able to navigate to try here page
     Given User navigates to the Graph Graph page
     When User click on try here link
     Then User redirected to "Assessment" page
     
    Scenario: User is able to run the python code
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Implementation of Graph" |
     And User clicks on run button
     Then User is presented with Result 
     
    Scenario: User Should navigate to Graph Explanation Page
    Given User is on the Graph page
    When User clicks on Graph Representation in Graph Page 
    Then User redirected to "Graph Representations" page
    
    Scenario: The user is able to navigate to try here page
     Given User navigates to the Graph Representations page
     When User click on try here link
     Then User redirected to "Assessment" page
     
     Scenario: User is able to run the python code
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Implementation of Graph" |
     And User clicks on run button
     Then User is presented with Result 
     
     Scenario: User is able to navigate to Practice Questions page
     Given User navigates to the Graph Representations page
     When User clicks on Graph Practice Questions link
     Then User redirected to Graph "Practice Questions" page
     
     Scenario: Successful LogOut
    When User clicks on signout
    Then Message displayed LoggedOut Successfully
     
