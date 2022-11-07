Feature:

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee81" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "tasks" module




