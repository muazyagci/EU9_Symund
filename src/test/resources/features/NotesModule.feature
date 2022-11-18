
Feature: Notes Module Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee51" and password "Employee123"
    And user clicks to login button and lands on dashboard
    Then user navigates to "notes" module

  @Test1
    Scenario: User can create a new note
      When User clicks New note on the left side of the web page
      And User writes "Hello World!" inside the new note
      Then User verifies that the title of the new note matches with first words of his her new note


    Scenario: User can add any note to the favorites
      When User finds the note that just created and click three dots on the note
      And User clicks Add to favorites from the drop-down list
      And User clicks Files at the top of the page.
      And clicks Favorites at the left side of the page.
      Then user can see the file newly added to favorites under Favorites tab inside Files Module



