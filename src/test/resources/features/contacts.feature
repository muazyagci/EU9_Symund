@SYMU-1805 @wip_Zalina
Feature: Contacts Module Functionality
  User Story:
  As a user, I should be able to create a new contact
  and edit/delete any contact under Contacts module


  Background:
    Given user is on login page
    And user enters email "Employee31" and password "Employee123"
    And user clicks to login button and lands on dashboard
    And user navigates to "contacts" module

  @SYMU-1782
  Scenario:User can create a new contact
    And user can create a new contact Name "Jack" Surname "London"

  @SYMU-1802
  Scenario: User can see all the contacts as a list inside the
  middle column and total number of the contacts near the “All Contacts” tab
    Then user can see the number of all contacts and the list of all contacts


  @SYMU-1803
  Scenario: User can change the profile picture of any contact with a previously
  uploaded picture by using “Choose from files” option
    Then user is able to change the profile and upload a picture

  @SYMU-1804
  Scenario: User can delete any selected contact
    Then user is able to delete a contact