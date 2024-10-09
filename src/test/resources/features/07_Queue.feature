@QueuePage
Feature: Queue DS page validation dsalgo

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "NinjaTesters1" and "Secret123#"
    And The user click on login button
    Then The user redirected to homepage
    
    Scenario: The user is navigate to Queue DS page
     Given The user is on Home page after logged in
     When user clicks on queue getstarted
     Then User redirected to "Queue" page
     
     Scenario: The user is able to navigate to the Implementation of Queue in Python page
     Given User is in the Queue Page after logged in
     When User clicks on the Implementation of Queue in Python link
     Then User redirected to "Implementation of Queue in Python" page
     
     Scenario: The user is able to navigate to try here page
     Given User is in the Implementation of queue in python page
     When User click on try here link
     Then User redirected to "Assessment" page
     
     Scenario: User is able to run the python code
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Implementation of Queue in Python" |
     And User clicks on run button
     Then User is presented with Result
     
     Scenario: User tries to run the python code with invalid Syntax
     Given User is on the try editor page
     When User enters the invalid Python Code 
          | print Implementation of Queue in Python |
     And User clicks on run button
     Then User is presented with the error message
     
     Scenario: The user is able to navigate to the Implementation using collection.deque
      Given User is in the Queue Page after logged in
      When User clicks on Implementation using collection.deque link
      Then User redirected to "Implementation using collections.deque" page
      
      Scenario: The user is able to navigate to try here page in Implementation using collection
     Given User is in the Implementation using collection deque in python page
     When User click on try here link
     Then User redirected to "Assessment" page
     
      
     Scenario: User is able to run the python code in Collection.queue
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Implementation of collections.deque in Python" |
     And User clicks on run button
     Then User is presented with Result
     
     Scenario: User is able to navigate to the Implemantation using array page
     Given User is in the Queue Page after logged in
     When User clicks on Implementation using array link
     Then User redirected to "Implementation using array" page
     
     Scenario: The user is able to navigate to try here page in Implementation using Array page
     Given User is in the Implementation using Array page
     When User click on try here link
     Then User redirected to "Assessment" page
     
     
     Scenario: User tries to run the python code in Implementation using array page
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Implementation Using Array" |
     And User clicks on run button
     Then User is presented with Result
     
     Scenario: User is able to navigate to Queue Operations page
     Given User is in the Queue Page after logged in
     When User clicks on Queue Operations link
     Then User redirected to "Queue Operations" page
     
     Scenario: The user is able to navigate to try here page in Queue Operations page
     Given User is in the Queue Operations page
     When User click on try here link
     Then User redirected to "Assessment" page 
     
      Scenario: User tries to run the python code in Queue Operations page
     Given User is on the try editor page
     When User enters the Python Code 
          | print"Queue Operations" |
     And User clicks on run button
     Then User is presented with Result
     
     Scenario: User is able to navigate to Practice Questions page
     Given User is in the Queue Operations page
     When User clicks on Practice Questions link in Queue page
     Then User redirected to "Practice Questions" page
     