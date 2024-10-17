
@Signin
Feature: SignIn Action

  Scenario: Redirect to Register page
    Given User is on SignIn page
    When User Clicks on Register link
    Then User should be redirected to Register page

  Scenario: To verify SignIn with Empty fields
    Given User is on SignIn page
    When User clicks on login button with all empty field
    Then User verify the message at username as "Please fill out this field."

  Scenario: To verify SignIn with username only
    Given User is on SignIn page
    When User clicks on login button with username as "kode" only
    Then User verify the message at password as "Please fill out this field."

  # Scenario: To verify SignIn with password only
  #   Given User is on SignIn page
  #   When User clicks on login button with password as "numpy" only
  #   Then User verify the message at user as "Please fill out this field."

  # Scenario Outline: To verify SignIn with invalid "<username>" and "<password>"
  #   Given User is on SignIn page
  #   When User enters username as "<username>"
  #   And User enters password as "<password>"
  #   And User clicks login button
  #   Then User verify the message as "Invalid Username and Password"

  #   Examples: 
  #     | username | password |
  #     | kodetesters | numpyninja |

  # Scenario Outline: User  Login with  valid "<username>" and "<password>"
  #   Given User is on SignIn page
  #   When User enters sheetname "<Sheetname>" and rownumber <RowNumber>
  #   And User clicks on login button
  #   Then It should navigate to the home page with a message " You are logged in  "

  #   Examples: 
  #     | Sheetname | RowNumber |
  #     | SignIn    |         0 |

 
