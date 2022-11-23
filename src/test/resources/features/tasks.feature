@SYMU-1753
Feature:

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee81" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "tasks" module


  Scenario Outline: first tc
    When user clicks to add list button
    And user enters list name "<listName>"
    And user clicks to save button
    And verify that recently created list exists "<listName>"
    Examples:
      | listName |
      | School   |
