Feature: Contacts Module Functionality
  User Story:
  As a user, I should be able to create a new contact
  and edit/delete any contact under Contacts module


  Background:
    Given user is on login page

  @smoke
  Scenario:User can create a new contact
    And user enters email "Employee31" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "contacts" module
    And user can create a new contact Name "Jack" Surname "London"