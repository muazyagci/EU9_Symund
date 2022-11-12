Feature: Deleted Files Tab Functionality

    Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee91" and password "Employee123"
    Then user clicks to login button and lands on dashboard
    Then user navigates to "files" module

    @SYMU-1775
     Scenario: User can see the most recent deleted file in the first line of the deleted
     file list when deleted files are ordered by newest to oldest
      When User been Allfiles page
      And User deletes "Program"
      And User switch to DeletedFiles page
      And User sorts files
      Then User should see last deleted "Program" first

      @SYMU-1777
       Scenario: User can order the all deleted files by newest to oldest or visa versa
        When User been Allfiles page
        And User deletes "Program"
        And User switch to DeletedFiles page
        And User sorts files
        Then User should be able to order the all deleted "Program" by newest to oldest or visa versa


        @SYMU-1778
         Scenario: User can order alphabetically all the deleted files based on their names
          When User been Allfiles page
          And User deletes "Program"
          And User switch to DeletedFiles page
          And User sorts files based on Names
          Then User should be able to order alphabetically all the deleted files based on their names

          @SYMU-1779
         Scenario: User can delete any deleted file permenantly by using the three dots icon in the file’s line
            When User been Allfiles page
            And User deletes "Program"
            And User switch to DeletedFiles page
            And User select "Program"
            And User click to three dots button
            Then User should be able to delete any deleted file permenantly

           @SYMU-1780
         Scenario:User can restore any deleted file and see it again under the All Files tab
              When User been Allfiles page
              And User deletes "Program"
              And User switch to DeletedFiles page
              And User select "Program"
              And User click to three dots button
              Then User should be restore to deleted "Program"