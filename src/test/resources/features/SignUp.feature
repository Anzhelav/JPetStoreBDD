Feature: This feature allows user to sign up

  Background:
    Given user opens website

  @Smoke @Regression
  Scenario: Verify user can sign up with valid credentials
    When user clicks sign in link
    And user clicks register now link
    And user inputs fields with valid credentials
      | peter129           |
      | qwerty             |
      | qwerty             |
      | Peter              |
      | Stone              |
      | peter124@gmail.com |
      | 7777777777         |
      | 55 S Willow St     |
      | 56 S Willow St     |
      | New York           |
      | New York           |
      | 50550              |
      | USA                |
      | English            |
      | cats               |
    And user clicks on save account information
    Then verify welcome message is displayed