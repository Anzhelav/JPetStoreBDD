package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{
    @FindBy(xpath = "//input[@value = 'Continue']")
    WebElement continueBtn;

    @FindBy(xpath = "//a[contains(text(), 'Confirm')]")
    WebElement confirmBtn;

    @FindBy(xpath = "//li[contains(text(), 'Thank you, your order has been submitted.')]")
    WebElement thankYouOrderSubmittedMsg;

    public void inputOrderFieldsWithValidInfo() {
    }

    public void pressContinueBtn() {
        continueBtn.click();
    }

    public void pressConfirmBtn() {
        confirmBtn.click();
    }

    public void verifyThankYouOrderSubmittedMsg() {
        Assert.assertTrue("Thank you, your order has been submitted message is not displayed", thankYouOrderSubmittedMsg.isDisplayed());
    }
}
