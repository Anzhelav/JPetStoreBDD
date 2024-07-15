package com.automation.pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(), 'FL-DSH-01')]")
    WebElement firstProductId;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
    WebElement addToCartSecond;

    @FindBy(xpath = "//a[contains(text(), 'RP-SN-01')]")
    WebElement firstReptileId;

    @FindBy(xpath = "(//a[contains(text(), 'Add to Cart')])[1]")
    WebElement addToCartFirst;

    @FindBy(xpath = "//a[text() = 'Return to Main Menu']")
    WebElement returnToMainMenuBtn;

    @FindBy(xpath = "//a[text() = 'EST-14']")
    WebElement firstItemId;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[1]/td/img")
    WebElement itemPicture;

    @FindBy(xpath = "(//input[@type = 'text'])[2]")
    WebElement quantityField;

    @FindBy(xpath = "//input[@name= 'updateCartQuantities']")
    WebElement updateCartBtn;

    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[7]")
    WebElement updatedCost;

    @FindBy(xpath = "//a[contains(text(), 'K9-RT-01')]")
    WebElement productIdGoldenRetriever;

    @FindBy(xpath = "//a[@class = 'Button']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[text()='RP-SN-01']")
    WebElement rattleSnakeProductId;

    @FindBy(xpath = "//a[text()='EST-11']")
    WebElement venomlessRattlesnakeItemId;

    @FindBy(xpath = "//img[@src='../images/snake1.gif']")
    WebElement rattleSnakesPicture;

    @FindBy(xpath = "//td[contains(text(), 'Doubles as a watch dog')]")
    WebElement venomlessRattlesnakeText;

    @FindBy(xpath = "//td[contains(text(),'in stock')]")
    WebElement venomlessRattlesnakesItemsInStock;

    @FindBy(xpath = "//a[text()='AV-CB-01']")
    WebElement parrotLink;

    @FindBy(xpath = "//a[text()='EST-18']")
    WebElement adultAmazonParrot;

    @FindBy(id = "LogoContent")
    WebElement logoBanner;

    @FindBy(xpath = "//h2[text()='Fish']")
    WebElement productIdFish;

    @FindBy(xpath = "//h2[text()='Fish']")
    WebElement fishHeading;

    @FindBy(xpath = "//h2[text()='Dogs']")
    WebElement dogHeading;

    @FindBy(xpath = "//h2[text()='Reptiles']")
    WebElement reptilesHeading;

    @FindBy(xpath = "//h2[text()='Cats']")
    WebElement catsHeading;


    public void clickOnFirstProductId() {
        firstProductId.click();
    }

    public void clickOnAddToCartNearSecondItem() {
        addToCartSecond.click();
    }

    public void clickOnFirstReptileId() {
        firstReptileId.click();
    }

    public void clickOnAddToCartNearFirstProduct() {
        addToCartFirst.click();
    }

    public void clickOnReturnToMainMenuBtn() {
        returnToMainMenuBtn.click();
    }

    public void clickOnFirstItemId() {
        firstItemId.click();
    }

    public void verifyItemPicture() {
        Assert.assertTrue("Item picture is not displaed", itemPicture.isDisplayed());
    }

    public void updateQuantityOfItemsInTheCart() {
        quantityField.clear();
        quantityField.sendKeys("2");
    }

    public void clickUpdateCartBtn() {
        updateCartBtn.click();
    }

    public void verifyTotalCostIsUpdated() {
        Assert.assertTrue("Price is not updated", updatedCost.isDisplayed());
    }

    public void clickOnProductIdNearGoldenRetriever() {
        productIdGoldenRetriever.click();
    }

    public void pressAddToCartBtn() {
        addToCartBtn.click();
    }

    public void userClicksOnRattleSnakeProductId() {
        rattleSnakeProductId.click();
    }

    public void userClicksOnVenomlessRattlesnakeItemId() {
        venomlessRattlesnakeItemId.click();

    }

    public void verifyATextAndVisualDescriptionOfTheItemAndNumberInStock() {
        Assert.assertTrue("not displayed", rattleSnakesPicture.isDisplayed());
        Assert.assertTrue("not displayed", venomlessRattlesnakeText.isDisplayed());
        Assert.assertTrue("not displayed", venomlessRattlesnakesItemsInStock.isDisplayed());
    }


    public void userClicksOnParrotLink() {
        parrotLink.click();

    }

    public void verifyAdultAmazonParrotIsDispalyed() {
        Assert.assertTrue("not displayed", adultAmazonParrot.isDisplayed());
    }

    public void verifyProductsOfBirdsCategoryAreDisplayed() {
        Assert.assertTrue("birds products are not displayed", parrotLink.isDisplayed());
    }

    public void verifyItemsOfParrotProductsAreDisplayed() {
        Assert.assertTrue("items of parrot products are not displayed", adultAmazonParrot.isDisplayed());
    }

    public void userClicksOnLogoBanner() {
    }

    public void verifyUserIsOnTheFishProductsPage() {
        Assert.assertTrue("Product id on a fish page is displayed", productIdFish.isDisplayed());
    }

    public void verifyFishResults() {
        Assert.assertTrue("Fish results are not displayed", fishHeading.isDisplayed());

    }

    public void verifyDogResults() {
        Assert.assertTrue("Dog results are not displayed", dogHeading.isDisplayed());
    }

    public void verifyReptileResults() {
        Assert.assertTrue("Reptiles results are not displayed", reptilesHeading.isDisplayed());
    }

    public void verifyCatResults() {
        Assert.assertTrue("Cats results are not displayed", catsHeading.isDisplayed());
    }
}
