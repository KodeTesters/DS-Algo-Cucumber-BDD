
@Treepage
Feature: To Validate Tree Page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: To validate the Tree link
    When User click on the Tree Get Started button
    Then User is on Tree page and verify tittle as "Tree"

  Scenario: The user navigate to "Overview of Trees" page
    Given The user is on the "Tree" page
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the "Overview of Trees"  Page

  Scenario: The user navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the "Overview of Trees" page
    When The user clicks "Try Here" button on "Tree" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute valid python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user navigate to "Terminologies" Page
    Given The user is on the "Tree" page
    When The user clicks on the Terminologies button
    Then The user should be directed to the "Terminologies"  Page

  Scenario: The user navigate to Terminologies page having an tryEditor
    Given The user is on the "Terminologies" page
    When The user clicks "Try Here" button on "Terminologies" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user navigate to "Types of Trees" Page
    Given The user is on the "Tree" page
    When The user clicks on the Types of Trees button
    Then The user should be directed to the "Types of Trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given The user is on the "Types of Trees" page
    When The user clicks "Try Here" button on "types of tree" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree" page
    When The user clicks on the Tree Traversals button
    Then The user should be directed to the "Tree Traversals"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Tree Traversals Page
    Given The user is on the "Tree Traversals" page
    When The user clicks "Try Here" button on "tree traversals" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the "Tree" page
    When The user clicks on the Traversal illustration button
    Then The user should be directed to the "Traversals-Illustration"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Traversals-Illustration Page
    Given The user is on the "Traversals-Illustration" page
    When The user clicks "Try Here" button on "traversal illustration" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the "Tree" page
    When The user clicks on the binary trees button
    Then The user should be directed to the "Binary Trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Binary Trees Page
    Given The user is on the "Binary Trees" page
    When The user clicks "Try Here" button on "binary tree" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the "Tree" page
    When The user clicks on the types of binary trees button
    Then The user should be directed to the "Types of Binary Trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Types of Binary Trees Page
    Given The user is on the "Types of Binary Trees" page
    When The user clicks "Try Here" button on "types of binary trees" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to Implementation in Python Page
    Given The user is on the "Tree" page
    When The user clicks on the Implementation in Python button
    Then The user should be directed to the "Implementation in Python"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Implementation in Python Page
    Given The user is on the "Implementation in Python" page
    When The user clicks "Try Here" button on "implementation in python" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to binary tree traversals Page
    Given The user is on the "Tree" page
    When The user clicks on the binary tree traversals button
    Then The user should be directed to the "Binary Tree Traversals"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Binary Tree Traversals page
    Given The user is on the "Binary Tree Traversals" page
    When The user clicks "Try Here" button on "binary tree traversals" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given The user is on the "Tree" page
    When The user clicks on the Implementation of Binary Trees button
    Then The user should be directed to the "Implementation of Binary Trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Implementation of Binary Trees Page
    Given The user is on the "Implementation of Binary Trees" page
    When The user clicks "Try Here" button on "Implementation of binary trees" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given The user is on the "Tree" page
    When The user clicks on the Applications of Binary Trees button
    Then The user should be directed to the "Applications of Binary trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Applications of Binary trees Page
    Given The user is on the "Applications of Binary trees" page
    When The user clicks "Try Here" button on "Applications of binary trees" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Binary Search Trees" Page
    Given The user is on the "Tree" page
    When The user clicks on the Binary Search Trees button
    Then The user should be directed to the "Binary Search Trees"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Binary Search Trees Page
    Given The user is on the "Binary Search Trees" page
    When The user clicks "Try Here" button on "Binary Search Trees" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user is able to navigate to "Implementation of BST" Page
    Given The user is on the "Tree" page
    When The user clicks on the Implementation of BST button
    Then The user should be directed to the "Implementation Of BST"  Page

  Scenario: The user is able to navigate to a page having an tryEditor from Implementation Of BST Page
    Given The user is on the "Implementation Of BST" page
    When The user clicks "Try Here" button on "Implementation of BST" page
    Then The user should be redirected to tryEditor page with Run button

  Scenario: The user able to execute python code
    Given The User is on try editor page with run button
    When User enter the Python code
      | print"Hello Numpy Ninjas" |
    And User Clicks on Run button
    Then User Verify the Result

  Scenario: The user able to execute invalid python code
    Given The User is on try editor page with run button
    When User enter the invalid Python code
      | print Hello Numpy Ninjas |
    And User Clicks on Run button
    Then User Verify the error message

  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Tree" page
    When The user clicks on the Overview of Trees link
    When The user clicks on the Practice Questions in Overview of Trees
    Then The user should be directed to Practice Questions of tree page Page
