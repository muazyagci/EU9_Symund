@wiptestExe
Feature: US-001 Login Functionality [AutomationS3-MMY]

  @SYMU-1640
  Background: user is on login page
    Given user is on login page

  @SYMU-1606
  Scenario: login with valid credentials
    When user clicks to email input box and enter email "Employee81"
    And user clicks to password input box and enter password "Employee123"
    Then Click Login button or hit enter key

  @SYMU-1607
  Scenario: login negative test
    When Invalid username should be entered "Invalid"
    And Invalid password should be entered "Invalid"
    And Click Login button or hit enter key
    Then Click Login button or hit enter key again without passing any username or password

  @SYMU-1641
  Scenario: see password as dots
    When user enters email "Employee81" and password "Employee123"
    Then password must be seen as dots

  @SYMU-1642
  Scenario: see password explicitly
    When user enters email "Employee81" and password "Employee123"
    Then click to the eye button

@SYMU-1643
  Scenario: Forgot Password link and Reset password Link
    When user click to forgot password? link
    Then user clicks to Reset password button

  @SYMU-1644
  Scenario: See valid placeholders for Username and Password
    When user must see valid place holders on Username
    Then user must see valid place holders on Password









