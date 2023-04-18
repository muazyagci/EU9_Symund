@SYMU-1753
Feature:US-010 Tasks Module Functionality [Automation-S4]

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee81" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "tasks" module

    #smoke
@SYMU-1795
Scenario Outline: Creating List of Tasks
    When user clicks to add list button
    And user enters list name "<listName>"
    And user clicks to save button
    And verify that recently created list exists "<listName>"
    Examples:
      | listName |
      | School   |


  Scenario Outline: Creating task
    When user clicks to list of tasks named "<listName>"
    And user gives name to task as "<taskName>"
    Then verify that "<taskName>" exists
    Examples:
      | listName | taskName |
      | School   | task1    |


  @wipMuaz
  Scenario Outline: Completing Tasks
    When user clicks to list of tasks named "<listName>"
    And user clicks to checkbox btn left next to the "<taskName>" if it doesn't exists create one
    Then user goes to Completed list and verifies that the task "<taskName>" marked as completed is there
    Examples:
      | listName | taskName |
      | School   | task1    |

