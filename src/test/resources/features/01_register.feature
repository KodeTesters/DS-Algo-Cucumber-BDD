
@Register
Feature: To verify and validate  User  Register page

  Scenario: To verify Register page with Empty fields
    Given The user opens Register Page
    When User click Register with all empty field
    Then User verify the message at username on Register Page as "Please fill out this field."

  Scenario: To verify Register page with username only
    Given The user opens Register Page
    When User click Register with username as "kodetesters" only
    Then User verify the message at password on Register Page as "Please fill out this field."

  Scenario: To verify Register Page with username and password
    Given The user opens Register Page
    When User click Register with username as "kodetesters" and password as "numpyninja24" only
    Then User verify the message at confirmpassword on Register Page as "Please fill out this field."

  Scenario Outline: To verify Register Form with invalid credentials
    Given The user opens Register Page
    When User enter "<username>" ,"<password>" and "<confirmpass>"
    Then User click Register and verify the "<message>"

    Examples:
      | username    | password     | confirmpass  | message                                                 |
      | kodetesters | numpyninja24 | numpyninja   | password_mismatch:The two password fields didn’t match. |
      | testers     | automation   | automation84 | password_mismatch:The two password fields didn’t match. |
      | testers     | 123456789    | 123456789    | password_mismatch:The two password fields didn’t match. |
      | testers     | ninja5       | ninja5       | password_mismatch:The two password fields didn’t match. |

  Scenario Outline: to register with all the data
    Given The user opens Register Page
    When user enter the sheetname "<sheetname>" and row number <rownum>
    Then user click on Register button and verify message as "password_mismatch:The two password fields didn’t match."

    Examples:
      | sheetname | rownum |
      | Register  | 0      |
      | Register  | 1      |
      | Register  | 2      |
      | Register  | 3      |
      | Register  | 4      |
