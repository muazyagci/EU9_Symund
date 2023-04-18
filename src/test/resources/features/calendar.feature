@SYMU-1794
Feature: Calendar Module Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    Given user enters email "Employee51" and password "Employee123"
    Given user clicks to login button and lands on dashboard
    Given user navigates to "calendar" module

  @SYMU-1789
  Scenario: User can display daily calendar view
    When user clicks on menutoggle next to today button
    And user clicks on day button
    Then user displays daily calendar view

  @SYMU-1790 @Smoke
  Scenario: User can display weekly calendar view
    When user clicks on menutoggle next to today button
    And user clicks on week button
    Then user displays weekly calendar view

  @SYMU-1791
  Scenario: User can display monthly calendar view
    When user clicks on menutoggle next to today button
    And user clicks on month button
    Then user displays monthly calendar view

    @SYMU-1792
    Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
    Given user clicks on menutoggle next to today button
    Given user clicks on month button
    Given user displays monthly calendar view
    When user clicks on new event button
    And user inserts title
    And user selects the beginning date
    And user clicks on Save button
    And user opens next month's calendar
    Then user sees the new event through the Monthly Calendar view

    @SYMU-1793
    Scenario: User can delete any event through the Monthly Calendar view by clicking on the event and then using “more” option
      Given user clicks on menutoggle next to today button
      Given user clicks on month button
      Given user displays monthly calendar view
      When user clicks on the created event
      And user clicks on more button
      And user clicks on toggle
      Then user clicks on delete button