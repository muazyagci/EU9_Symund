@SYMU-1735
Feature: US-002 Log out Functionality [AutomationS3-MMY]


  Background: user has logged in
    Given user is on loginpage
    When user enters valid email "Employee81" and password "Employee123"
    Then user clicks to login button

  @SYMU-1712
  Scenario: user can log out and ends up in login page
    When  click to the profilePicture button on the right corner of the dashboard
    And click to logout button
    Then verify that user is on login page

    @SYMU-1733
    Scenario: user can not go to home page again by clicking step back btn after successfully logged out
      When  click to the profilePicture button on the right corner of the dashboard
      And click to logout button
      And verify that user is on login page
      And click to step back btn
      Then verify that user is on login page