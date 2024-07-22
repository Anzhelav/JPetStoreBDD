Feature: This feature allows to use Cart functionality

  Background:
    Given user opens website

  @Smoke @Regression
  Scenario: Verify user can add a product to cart
    When user clicks on cats link
    And user clicks on first product id
    And user clicks on add to cart near second product
    Then verify product is added into a cart

  @Smoke @Regression
  Scenario: Verify user can remove product from a cart
    When user clicks on reptiles link
    And user clicks on first reptile id
    And user clicks on add to cart near first product
    And user clicks on remove button in shopping cart
    Then verify empty cart message is displayed

  @Smoke @Regression
  Scenario: Verify user is able to update the quantity of products in the cart
    When user clicks on cats link
    And user clicks on first product id
    And user clicks on add to cart near second product
    And user updates the quantity of items in the cart
    And user clicks update cart button
    Then verify total cost is updated

  Scenario: Verify cart page have item id, product id, in stock, quantity, list price, total cost are displayed
    When user clicks on cart button
    Then verify user is on the cart page and item id, product id, in stock, quantity, list price, total cost are displayed

  Scenario: Verify user is able to continue shopping from cart
    When user clicks on cats link
    And user clicks on first product id
    And user clicks on add to cart near second product
    Then verify product is added into a cart
    And when user clicks on fish from line menu under the banner
    Then verify user is on fish products page