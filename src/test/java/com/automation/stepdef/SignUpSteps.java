package com.automation.stepdef;

import com.automation.pages.SignUpPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
    SignUpPage signUpPage = new SignUpPage();

    @When("user clicks register now link")
    public void user_clicks_register_now_link() {
        signUpPage.clickRegisterNow();
    }
    @When("user inputs fields with valid credentials")
    public void user_inputs_fields_with_valid_credentials(DataTable dataTable) {
        signUpPage.inputValidCredentials(dataTable);

    }

    @When("user clicks on save account information")
    public void user_clicks_on_save_account_information() {
        signUpPage.clickOnSaveAccountInfo();
    }
    @Then("verify welcome message is displayed")
    public void verify_welcome_message_is_displayed() {
        signUpPage.verifyWelcomeMsg();
    }

}
