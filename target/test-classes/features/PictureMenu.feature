Feature: This feature allows to use picture menu

  Background:
    Given user opens website

  Scenario: Verify birds link from picture menu is working
    When user clicks on birds link
    And user clicks on parrot id
    Then verify adult amazon parrot is displayed

  Scenario: Verify fish link from picture menu is working
    When user clicks on fish link
    Then verify fish results are displayed

  Scenario: Verify dog link from picture menu is working
    When user clicks on dog link
    Then verify dog results are displayed

  Scenario: Verify reptile link from picture menu is working
    When user clicks on reptile link
    Then verify reptile results are displayed

  Scenario: Verify cat link from picture menu is working
    When user clicks on cat link
    Then verify cat results are displayed
