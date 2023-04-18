@SYMU-1816
Feature: Notes Module Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee51" and password "Employee123"
    And user clicks to login button and lands on dashboard
    Then user navigates to "notes" module

@SYMU-1799
    Scenario: User can create a new note
      When User clicks New note on the left side of the web page
      And User writes "Hello World!" inside the new note
      Then User verifies that the title of the new note matches with "Hello World!"

@SYMU-1801
    Scenario: User can add any note to the favorites
      When User finds the note that just created and click three dots on the note
      And User clicks Add to favorites from the drop-down list
      And User clicks Files at the top of the page.
      And clicks Favorites at the left side of the page.
      Then user can see the "Hello World!" to favorites under Favorites tab inside Files Module

@SYMU-1813
    Scenario: User can see the number of letters and words
      When User clicks three dots at the top right of the page
      And user clicks Details from the drop-down list
      Then user can see the number of letters and words that under the "Hello World!" title

@SYMU-1814
    Scenario: User creates a new category by passing a new category name
      When user clicks three dots at the top right of the page
      And User clicks Details from the drop-down list
      And user writes new category name "Personal" in the category field
      And user clicks the arrow or press Enter key
      And user clicks Categories on the left side of the page
      And user verifies that the new category "Personal" appears in the drop-down list

@SYMU-1815
    Scenario: User can delete any note
      When user clicks the three dots next to the note
      Then user clicks Delete note from the drop-down list
      Then user verifies that "Hello World!" note is deleted



