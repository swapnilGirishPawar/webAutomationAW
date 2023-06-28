Feature: Check home page functionality

    Background: user is logged in
        Given user is on login page
        When user enters username and password
        And clicks on the login button
        Then user is navigate to the home page


    Scenario: Check logout button.
        When user clicks on user details info button
        Then logout button is displayed

    Scenario: verify quick launch toolbar is present
        When user clicks on dashboard button
        Then quick launch toolbar is displayed

