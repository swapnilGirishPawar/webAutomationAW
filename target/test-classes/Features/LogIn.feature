Feature: Test Login Functionality

  Scenario Outline: Check login is successful with valid credentials.
    Given Browser is open
    And User is on login page
    When  user enters <username> and <password>
    And user clicks on Login button
    Then user is navigated to the home page
    Examples:
      | username | password |
        | Admin | admin123 |