package com.automation.stepdef;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @When("user clicks on first product id")
    public void user_clicks_on_first_product_id() {
        productPage.clickOnFirstProductId();

    }
    @When("user clicks on add to cart near second product")
    public void user_clicks_on_add_to_cart_near_second_product() {
        productPage.clickOnAddToCartNearSecondItem();
    }

    @When("user clicks on first reptile id")
    public void user_clicks_on_first_reptile_id() {
        productPage.clickOnFirstReptileId();
    }
    @When("user clicks on add to cart near first product")
    public void user_clicks_on_add_to_cart_near_first_product() {
        productPage.clickOnAddToCartNearFirstProduct();
    }

    @And("user clicks on Return to main menu button")
    public void user_clicks_on_return_to_main_menu_button() {
        productPage.clickOnReturnToMainMenuBtn();
    }

    @And("user clicks on first item id")
    public void userClicksOnFirstItemId() {
        productPage.clickOnFirstItemId();
    }

    @Then("verify item picture is displayed")
    public void verifyItemPictureIsDisplayed() {
        productPage.verifyItemPicture();
    }

    @And("user updates the quantity of items in the cart")
    public void userUpdatesTheQuantityOfItemsInTheCart() {
        productPage.updateQuantityOfItemsInTheCart();
    }

    @And("user clicks update cart button")
    public void userClicksUpdateCartButton() {
        productPage.clickUpdateCartBtn();
    }

    @Then("verify total cost is updated")
    public void verifyTotalCostIsUpdated() {
        productPage.verifyTotalCostIsUpdated();
    }

    @And("user clicks on product id near golden retriever")
    public void userClicksOnProductIdNearGoldenRetriever() {
        productPage.clickOnProductIdNearGoldenRetriever();
    }

    @And("user presses add to cart button")
    public void userPressesAddToCartButton() {
        productPage.pressAddToCartBtn();
    }

    @And("user clicks on rattlesnake product id")
    public void userClicksOnRattlesnakeProductId() {
        productPage.userClicksOnRattleSnakeProductId();

    }

    @And("user clicks on venomless rattlesnake item id")
    public void userClicksOnVenomlessRattlesnakeItemId() {
        productPage.userClicksOnVenomlessRattlesnakeItemId();

    }

    @Then("verify a text and visual description of the item and the number of that item in stock")
    public void verifyATextAndVisualDescriptionOfTheItemAndTheNumberOfThatItemInStock() {
        productPage.verifyATextAndVisualDescriptionOfTheItemAndNumberInStock();
    }

    @And("user clicks on parrot id")
    public void userClicksOnParrotId() {
        productPage.userClicksOnParrotLink();
    }

    @Then("verify adult amazon parrot is displayed")
    public void verifyAdultAmazonParrotIsDisplayed() {
        productPage.verifyAdultAmazonParrotIsDispalyed();
    }

    @Then("verify products of birds category are displayed")
    public void verifyProductsOfBirdsCategoryAreDisplayed() {
        productPage.verifyProductsOfBirdsCategoryAreDisplayed();
    }

    @Then("verify parrot items are displayed")
    public void verifyParrotItemsAreDisplayed() {
        productPage.verifyItemsOfParrotProductsAreDisplayed();
    }


    @And("user clicks on logo image")
    public void userClicksOnLogoImage() {
        productPage.userClicksOnLogoBanner();
    }

    @Then("verify user is on fish products page")
    public void verifyUserIsOnFishProductsPage() {
        productPage.verifyUserIsOnTheFishProductsPage();
    }

    @Then("verify fish results are displayed")
    public void verifyFishResultsAreDisplayed() {
        productPage.verifyFishResults();
    }

    @Then("verify dog results are displayed")
    public void verifyDogResultsAreDisplayed() {
        productPage.verifyDogResults();
    }

    @Then("verify reptile results are displayed")
    public void verifyReptileResultsAreDisplayed() {
        productPage.verifyReptileResults();

    }

    @Then("verify cat results are displayed")
    public void verifyCatResultsAreDisplayed() {
        productPage.verifyCatResults();
    }


}
