@wip
Feature: US-001 Login Functionality [AutomationS3-MMY]

  Background: user is on login page
    When user is on login page
@SYMU-1606
  Scenario: user can login with valid credentials
    When user clicks to email input box and enter email "Employee81"
    And user clicks to password input box and enter password "Employee123"
    Then Click Login button or hit enter key

  @SYMU-1607
  Scenario: User can not login with any invalid credentials
    When Invalid username should be entered "Invalid"
    And Invalid password should be entered "Invalid"
    And Click Login button or hit enter key
    And Wrong username or password should be displayed
    And Click Login button or hit enter key again without passing any username or password
    Then Please fill out this field message should be displayed








