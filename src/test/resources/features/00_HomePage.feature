
@HomePage
Feature: Launch Start page and Test Home Page

  Scenario: launch the home page of dsalgo portal
    Given user opens the dsalgo portal link
    When user clicks on "Get Started" button
    Then user redirected to home page

  Scenario Outline: User is on Home Page and clicks on any dropdown "<value>" without sign in
    Given user in home page 
    When The user clicks on data structure dropdown before signin
    Then The user select any dropdown menu "<value>"
    Then It should Alert the user with the message "You are not logged in"

    Examples: 
      | value       |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario Outline: User is on Home Page and clicks on any getStarted link "<value>" without sign in
    When The user click any of the Get started link before signin "<value>" in home page
    Then It should Alert the user with the message "You are not logged in"

    Examples: 
      | value                        |
      | Data Structures-Introduction |
      | Arrays                       |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  Scenario: User is on Home page and Clicks on Signin
    Given user is on Home Page
    When user clicks on SignIn link
    Then user redirected to login page

  Scenario: User is on Home page and Clicks on Register
    Given user is on Home Page
    When user clicks on Register link
    Then user redirected to register page
