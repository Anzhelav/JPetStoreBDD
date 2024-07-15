Feature: This feature allows user to make an order

  Background:
    Given user opens website
    When user clicks sign in link
    And user inputs valid credentials
    And user clicks login btn

  @Smoke @Regression
  Scenario: Verify user can make an order
    When user clicks on dogs link in side menu
    And user clicks on product id near golden retriever
    And user presses add to cart button
    And user presses proceed to checkout button
    And user inputs order fields with valid information
    And user presses continue button
    And user presses confirm button
    Then verify thank you order submitted message is displayed
