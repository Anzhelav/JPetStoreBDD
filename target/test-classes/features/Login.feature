Feature: This feature allows user to login

  Background:
    Given user opens website
    When user clicks sign in link

  @Smoke @Regression
  Scenario: Verify user is able to log in with valid credentials
    And user inputs valid credentials
    And user clicks login btn
    Then verify my account link is displayed

  @Regression
  Scenario Outline: Verify user is not able to log in with invalid credentials
    And user inputs "<login>" and "<password>"
    And user clicks login btn
    Then verify invalid username or password message is displayed
    Examples:
      | login    | password  |
      | peter129 | qwerty555 |
      | peter555 | qwerty    |
      | peter555 | qwerty555 |

  @Regression
  Scenario Outline: Verify user is not able to login with empty username or password field
    And user inputs "<login>" and "<password>"
    And user clicks login btn
    Then verify please enter your username and password message is displayed
    Examples:
      | login    | password |
      |          | qwerty   |
      | peter129 |          |
      |          |          |


