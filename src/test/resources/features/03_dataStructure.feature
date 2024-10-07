
@DataStructurePage
Feature: Data Structure page validation dsalgo

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: User is clicks on datastructure page
    Given The user is on Home page after logged in
    When user clicks on datastructure getstarted
    Then user redirected to page with title "Data Structures-Introduction"
    When user click on Time Complexity
    Then It should navigate to corresponding page with title "Time Complexity"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"DataStructure Introduction" |
    And click on run button
    Then The user redirected to homepage
    
