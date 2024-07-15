package com.automation.stepdef;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("verify product is added into a cart")
    public void verify_product_is_added_into_a_cart() {
        cartPage.verifyProductIsAddedToCart();
    }

    @When("user clicks on remove button in shopping cart")
    public void user_clicks_on_remove_button_in_shopping_cart() {
        cartPage.clickOnRemoveBtn();
    }
    @Then("verify empty cart message is displayed")
    public void verify_empty_cart_message_is_displayed() {
        cartPage.verifyEmptyCartMsg();
    }

    @And("user presses proceed to checkout button")
    public void userPressesProceedToCheckoutButton() {
        cartPage.pressProceedToCheckoutBtn();
    }

    @Then("verify user is on the cart page and item id, product id, in stock, quantity, list price, total cost are displayed")
    public void verifyUserIsOnTheCartPageAndItemIdProductIdInStockQuantityListPriceTotalCostAreDisplayed() {
        cartPage.verifyCartInfo();
    }

    @And("when user clicks on fish from line menu under the banner")
    public void whenUserClicksOnFishFromLineMenuUnderTheBanner() {
        cartPage.userClicksOnFishOptionFromLineMenu();
    }
}

