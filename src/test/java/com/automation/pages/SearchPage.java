package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage  extends BasePage{
    @FindBy(xpath = "//td[text() = 'Bulldog']")
    WebElement dogName;

    @FindBy(xpath = "//ul[@class = 'messages'][1]")
    WebElement enterAKeywordMsg;

    public void verifyPage() {
        Assert.assertTrue("Search results are not displayed", dogName.isDisplayed());
    }

    public void verifyNoKeywordMsg() {
        Assert.assertTrue("Please enter a keyword message is not displayed", enterAKeywordMsg.isDisplayed());
    }
}
