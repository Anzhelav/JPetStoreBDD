Feature: This feature allows user to browse the hierarchically organized catalog

  Background:
    Given user opens website

    Scenario: Verify that catalog is organized hierarchically as follows: categories, products, items
      Then verify birds category is displayed
      And user clicks on birds link
      Then verify products of birds category are displayed
      And user clicks on parrot id
      Then verify parrot items are displayed
