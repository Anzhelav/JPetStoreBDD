Feature: This feature allows user to view item information

  Background:
    Given user opens website

  @Regression
  Scenario: Verify user is able to see the item picture
    When user clicks on cats link
    And user clicks on first product id
    And user clicks on first item id
    Then verify item picture is displayed

    Scenario: Verify product item displays a text and visual description of the item and the number of that item in stock
      When user clicks on reptiles link
      And user clicks on first reptile id
      And user clicks on venomless rattlesnake item id
      Then verify a text and visual description of the item and the number of that item in stock
