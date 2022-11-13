
Feature: As a user, I should be able to create a new group and add any contact into a group under Contacts module



  Background: user is already logged in
    Given user is on login page
    And user enters valid username "Employee71" and "Employee123" password
    Then user should be able to land on dashboard



    Scenario: User can create a new group under contacts Module
      Given user is on contacts module page
      When user clicks on new group and enters group name "kedi";
      Then user should be able to create a new group "kedi";


      Scenario: User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu
        Given user is on contacts module page
        When user clicks on add new property
    Then user should be able to click on Birthday













