
Feature: Folder View Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee41" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "files" module
@Test
  Scenario: User can change folder view order by Name
    When user clicks on Name icon
  Then user should see the folder or files in alpahetic order based on their names


  Scenario: User can change folder view order by Size
    When user clicks on Size icon
    Then user should see the folder in order based on their size


  Scenario: User can change folder view order by Modified
    When user clicks on Modified icon
    Then user should see the folder or files in order based on their uploaded dates


  Scenario: User can change the folder view by clicking the toggle-view button at the right corner of all files tab screen
    When user clicks on Toggle grid view
    Then user should see the folders in a view with large icons


  Scenario: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox
    When user clicks on Checkbox
    Then user should see all checkboxes are selected

  @wip_Betul
  Scenario: AC_5: User can select all the files at once and see the total values of all files in the first line
  when clicked on the “select all” checkbox
    When user clicks on Checkbox
    Then user should see the total counts of all folders or files are displayed correctly


