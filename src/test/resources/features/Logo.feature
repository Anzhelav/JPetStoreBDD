Feature: this feature allows user to use Logo functionality

  Background:
    Given user opens website

    Scenario: Verify user can return to the homepage using logo
      When user clicks on parrot picture
      And user clicks on logo image
      Then verify home page is displayed