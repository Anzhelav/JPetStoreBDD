package com.automation.stepdef;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void user_opens_website() {
        homePage.openWebsite();
    }

    @When("user inputs {string}")
    public void user_inputs(String petType) {
        homePage.inputPetType(petType);
    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        homePage.clickOnSearchBtn();
    }

    @When("user clicks on cats link")
    public void user_clicks_on_cats_link() {
        homePage.clickOnCatsLink();
    }

    @When("user clicks sign in link")
    public void user_clicks_sign_in_link() {
        homePage.clickOnSignIn();
    }
    @When("user clicks on reptiles link")
    public void user_clicks_on_reptiles_link() {
        homePage.clickOnReptilesLink();
    }

    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        homePage.verifyHomePage();
    }
    @Then("verify my account link is displayed")
    public void verify_my_account_link_is_displayed() {
        homePage.verifyMyAccountLink();
    }

    @When("user clicks on sign out button")
    public void userClicksOnSignOutButton() {
        homePage.clickOnSignOutBtn();
    }

    @Then("verify sign in link is displayed")
    public void verifySignInLinkIsDisplayed() {
        homePage.verifySignInLink();
    }

    @When("user clicks on dogs link in side menu")
    public void userClicksOnDogsLinkInSideMenu() {
        homePage.clickOnDogsLinkInSideMenu();
    }

    @When("user clicks on birds link")
    public void userClicksOnBirdsLink() {
        homePage.userClicksOnBirds();
    }

    @Then("verify birds category is displayed")
    public void verifyBirdsCategoryIsDisplayed() {
        homePage.verifyBirdsCategoryIsDisplayed();
    }

    @When("user clicks on parrot picture")
    public void userClicksOnParrotPicture() {
        homePage.userClicksOnBirds();
    }

    @When("user clicks on cart button")
    public void userClicksOnCartButton() {
        homePage.userClicksOnCartButton();
    }

    @When("user clicks on fish link")
    public void userClicksOnFishLink() {
        homePage.userClicksOnFishPictureFromMenu();
        
    }

    @When("user clicks on dog link")
    public void userClicksOnDogLink() {
        homePage.userClicksOnDogPictureFromPictureMenu();
        
    }

    @When("user clicks on reptile link")
    public void userClicksOnReptileLink() {
        homePage.userClicksOnReptilePictureFromPictureMenu();
        
    }

    @When("user clicks on cat link")
    public void userClicksOnCatLink() {
        homePage.userClicksOncatPictureFromPictureMenu();
    }
}


