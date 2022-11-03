@wip2
Feature: US-002 Log out Functionality [AutomationS3-MMY]

  @SYMU-1713
  Background: user has logged in
    Given user is on loginpage
    When user enters valid email "Employee81" and password "Employee123"
    Then user clicks to login button

    @SYMU-1712
  Scenario: user can log out and ends up in login page
    When  click to the profilePicture button on the right corner of the dashboard
    And click to  logout button
    Then verify that user is on login page
