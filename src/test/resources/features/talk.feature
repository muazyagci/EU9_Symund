@SYMU-1773
Feature: Talk Module Functionality

  Background: user is on dashboard page with valid credentials
    Given user is on login page
    And user enters email "Employee131" and password "Employee123"
    And user clicks to login button and lands on dashboard
    Then user navigates to "spreed" module

  @SYMU-1772
  Scenario Outline: User can create a new group conversation by adding other users
    When clicks to + button
    And clicks to input box and type "<Conversation name>"
    And clicks to Add participants button
    And choose one participant and clicks create conversation button
    Then user can see created conversation "<Message>"

    Examples:
      | Conversation name | Message                      |
      | Conversation      | You created the conversation |

  @SYMU-1774
  Scenario Outline: User can can see the participants of the conversation on the right-hand menu under Participants
    When user clicks to conversation button
    Then user can see the participants of the conversation "<Participants>"
    Examples:
      | Participants |
      | A            |

  @SYMU-1796
  Scenario Outline: User can remove any participant from the conversation as being moderator of the conversation
    When user clicks to conversation button
    And user clicks to three dots button near the name of participant
    And clicks Remove participant button
    Then user can see "<Inform message>"
    Examples:
      | Inform message |
      | You removed    |

  @SYMU-1797
  Scenario Outline: User can send messages by typing inside the inputbox at the bottom of the middle screen on Talk Module page
    When user clicks to conversation button
    Then user types "<Typing message>" inside input box and press Send button and user can see sent message

    Examples:
      | Typing message |
      | Wooden Spoon   |

  @SYMU-1800
  Scenario: User can delete any group conversation previously created
    When  user clicks to three dots button near the created conversation
    Then user clicks to delete conversation button and clicks Yes button






