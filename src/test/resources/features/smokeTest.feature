@smoke
  Feature: Symund smoke test

    Background: user is on dashboard page with valid credentials
      Given user is on login page
      And user enters email "Employee81" and password "Employee123"
      Then user clicks to login button and lands on dashboard

      #Muaz_Tasks
    Scenario Outline: Scenario from tasks module
      And user navigates to "tasks" module
      And user clicks to add list button
      And user enters list name "<listName>"
      When user clicks to save button
      Then verify that recently created list exists "<listName>"
      Examples:
        | listName |
        | School   |