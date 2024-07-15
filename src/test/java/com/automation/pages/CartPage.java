package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//td[contains(text(), 'FL-DSH-01')]")
    WebElement secondProductId;

    @FindBy(xpath = "//a[contains(text(), 'Remove')]")
    WebElement removeBtn;

    @FindBy(xpath = "//b[contains(text(), 'Your cart is empty.')]")
    WebElement emptyCartMsg;

    @FindBy(xpath = "//a[contains(text(), 'Proceed to Checkout')]")
    WebElement proceedToCheckOutBtn;

    @FindBy(xpath ="//b[text()='Item ID']")
    WebElement itemId;

    @FindBy(xpath="//b[text()='Product ID']")
    WebElement productId;

    @FindBy(xpath="//b[text()='Description']")
    WebElement description;

    @FindBy(xpath="//b[text()='In Stock?']")
    WebElement inStock;

    @FindBy(xpath="//b[text()='Quantity']")
    WebElement quantity;

    @FindBy(xpath="//b[text()='List Price']")
    WebElement listPrice;

    @FindBy(xpath="//b[text()='Total Cost']")
    WebElement totalCost;

    @FindBy(xpath="//img[@src='../images/sm_fish.gif']" )
    WebElement fishFromLineMenu;

    public void verifyProductIsAddedToCart() {
        Assert.assertTrue("Product is not added into a cart", secondProductId.isDisplayed());
    }

    public void clickOnRemoveBtn() {
        removeBtn.click();
    }

    public void verifyEmptyCartMsg() {
        Assert.assertTrue("Empty cart message is not displayed", emptyCartMsg.isDisplayed());
    }

    public void pressProceedToCheckoutBtn() {
        proceedToCheckOutBtn.click();
    }

    public void verifyCartInfo() {
        Assert.assertTrue("not dispalayed",itemId.isDisplayed());
        Assert.assertTrue("not dispalayed",productId.isDisplayed());
        Assert.assertTrue("not dispalayed",description.isDisplayed());
        Assert.assertTrue("not dispalayed",inStock.isDisplayed());
        Assert.assertTrue("not dispalayed",quantity.isDisplayed());
        Assert.assertTrue("not dispalayed",listPrice.isDisplayed());
        Assert.assertTrue("not dispalayed",totalCost.isDisplayed());


    }

    public void userClicksOnFishOptionFromLineMenu() {
        fishFromLineMenu.click();
    }
}
