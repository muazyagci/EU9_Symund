@SYMU-1773
Feature: Talk Module Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee131" and password "Employee123"
    And user clicks to login button and lands on dashboard
    Then user navigates to "spreed" module

  @SYMU-1772 @wip
  Scenario Outline: User can create a new group conversation by adding other users
    When user clicks to Menu button
    And clicks to + button
    And clicks to input box and type "<Conversation name>"
    And clicks to Add participants button
    And choose one participant and clicks create conversation button
    Then user can see created conversation "<Message>"

    Examples:
      | Conversation name | Message|
      | Conversation      | You created the conversation|


