
@LinkedListPage
Feature: Linked List page validation dsalgo

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage

  
  Scenario: User navigated to "linked list" page
    Given The user is on Home page after logged in
    When The user selecting linkedlist item from the drop down menu
    Then The user redirected to "Linked List"  Page

  @TS_02_L
  Scenario: User navigated to "Introduction" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    Then The user move to "Introduction" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the "Introduction" after logged in
    When The user clicks "Try Here" button in the "introduction" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Introduction page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      |print("LinkedList Introduction")|
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Introduction page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      |print LinkedList Introduction|
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "creating linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks creating linked list link
    Then The user move to "Creating Linked LIst" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Creating a Linked List" after logged in
    When The user clicks "Try Here" button in the "creating linked list" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      |print("Creating a Linked List")|
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Creating a Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      |print Creating a Linked List|
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "Types of linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Types of Linked List link
    Then The user move to "Types of Linked List" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Types of Linked List page
    Given The user is on the "Types of Linked list" after logged in
    When The user clicks "Try Here" button in the "types of linked list" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Types of Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      |print("Types of Linked List")|
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Types of Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      |print Types of Linked List|
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "Implementation linked list in python" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Implement Linked List in Python link
    Then The user move to "Implement Linked List in Python" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the "Implement Linked List in Python" after logged in
    When The user clicks "Try Here" button in the "implemented linked list in pythont" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Implement Linked List in Python page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      |print("Implement Linked List in Python")|
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Implement Linked List in Python page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      |print Implement Linked List in Python|
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "Traversal" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Traversal link
    Then The user move to "Traversal" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the "Traversal" after logged in
    When The user clicks "Try Here" button in the "traversal" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Traversal page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      | print("Traversal") |
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Traversal page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      |print Traversal|
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "Insertion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Insertion link
    Then The user move to "Insertion" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given The user is on the "Insertion" after logged in
    When The user clicks "Try Here" button in the "Insertion" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Insertion page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      |print("Insertion")|
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Insertion page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      | print Insertion |
    And User clicks on run button
    Then The user get the error message

  
  Scenario: User navigated to "Deletion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Deletion link
    Then The user move to "Deletion" of Linked List Page

  
  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the "Deletion" after logged in
    When The user clicks "Try Here" button in the "Deletion" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  
  Scenario: User run the code in tryEditor with valid input for Deletion page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code
      | print("Deletion") |
    And User clicks on run button
    Then The user should get the Run output

  
  Scenario: The user getting error message with invalid python code for Deletion page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code
      | print Deletion |
    And User clicks on run button
    Then The user get the error message
  
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    And The user clicks on the Practice Questions
    Then The user move to "Practice Questions" of Linked List Page
