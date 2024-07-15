Feature: This feature allows to use Search functionality

  Background:
    Given user opens website

  @Smoke @Regression
  Scenario Outline: Verify user can submit search query and get relevant results
    And user inputs "<petType>"
    And user clicks on search button
    Then verify valid search results are displayed
    Examples:
      | petType      |
      | dog          |
      | friendly dog |
      | dog friendly |

  @Regression
  Scenario Outline: Verify user is able to use Return to main menu button
    And user inputs "<petType>"
    And user clicks on search button
    And user clicks on Return to main menu button
    Then verify home page is displayed
    Examples:
      | petType |
      | dog     |

  @Regression
  Scenario: Verify user cannot submit empty search query and get results
    And user clicks on search button
    Then verify user gets please enter a keyword message

  @Regression
  Scenario Outline: Verify user can submit search query in lowercase and uppercase and get relevant results
    And user inputs "<petType>"
    And user clicks on search button
    Then verify valid search results are displayed
    Examples:
      | petType      |
      | friendly dog |
      | FRIENDLY DOG |
      | FrIenDly DoG |
