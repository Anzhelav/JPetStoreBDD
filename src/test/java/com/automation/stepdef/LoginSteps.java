package com.automation.stepdef;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("user inputs {string} and {string}")
    public void user_inputs_and(String username, String password) {
        loginPage.inputCredentials(username,password);
    }
    @When("user clicks login btn")
    public void user_clicks_login_btn() {
        loginPage.clickLoginBtn();
    }

    @Then("verify invalid username or password message is displayed")
    public void verifyInvalidUsernameOrPasswordMessageIsDisplayed() {
        loginPage.verifyInvalidUsernameOrPasswordMsg();
    }

    @Then("verify please enter your username and password message is displayed")
    public void verifyPleaseEnterYourUsernameAndPasswordMessageIsDisplayed() {
        loginPage.verifyPleaseEnterUsernameAndPasswordMsgIsDisplayed();
    }

    @And("user inputs valid credentials")
    public void userInputsValidCredentials() {
        loginPage.inputValidCredentials();
    }

}
