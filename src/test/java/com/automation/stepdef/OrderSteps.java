package com.automation.stepdef;

import com.automation.pages.OrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
    OrderPage orderPage = new OrderPage();

    @When("user inputs order fields with valid information")
    public void user_inputs_order_fields_with_valid_information() {
        orderPage.inputOrderFieldsWithValidInfo();
    }
    @When("user presses continue button")
    public void user_presses_continue_button() {
        orderPage.pressContinueBtn();
    }
    @When("user presses confirm button")
    public void user_presses_confirm_button() {
        orderPage.pressConfirmBtn();
    }
    @Then("verify thank you order submitted message is displayed")
    public void verify_thank_you_order_submitted_message_is_displayed() {
        orderPage.verifyThankYouOrderSubmittedMsg();
    }
}


