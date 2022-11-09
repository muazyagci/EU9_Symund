Feature: Adding Favorites/Rename/Comment on File Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee21" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "files" module

  Scenario: Adding files to favorites from its own three dots menu
    When user clicks on the three dots menu on the file named Readme.md
    And user clicks on the "Add to favorites" button
    Then user can add the file to favorites


  Scenario: Renaming files from its own three dots menu
    When user clicks on the three dots menu on the file named Readme.md
    And user clicks on the "Rename" button
    Then user can can rename the file from its own three dots menu


  Scenario: Putting some comments on files from the file details menu opened right side
    When user clicks on the three dots menu on the file named Readme.md
    And user clicks on the "Details" button
    And user clicks on the "Comment"
    Then user can put some comments on the file from the file details menu opened right side


  Scenario:
    When user clicks on the three dots menu on the file named Readme.md
    And user clicks on the "Details" button
    And user clicks on the "Comment"
    And user clicks on the three dots menu opened on the right side of the user's name
    And user clicks on the "Delete Comment" button
    Then user can delete the comments made on the file





