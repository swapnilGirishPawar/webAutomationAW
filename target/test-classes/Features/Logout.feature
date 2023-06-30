Feature: Test Logout Functionality

  Scenario: Check logout is successful.
    Given User is on login page
    When user is navigated to the home page with valid credentials
    And user clicks on admin image button
    And user clicks on Logout button
    Then user is navigated to the login page
