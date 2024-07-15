package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@name = 'username']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@name = 'signon']")
    WebElement loginBtn;

    @FindBy(xpath = "//ul[@class = 'messages']")
    WebElement invalidCredentialsMsg;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/p[1]")
    WebElement pleaseEnterCredentialsMsg;

    public void inputCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void verifyInvalidUsernameOrPasswordMsg() {
        Assert.assertTrue("Invalid username or password message is not displayed", invalidCredentialsMsg.isDisplayed());
    }

    public void verifyPleaseEnterUsernameAndPasswordMsgIsDisplayed() {
        Assert.assertTrue("Please enter username and password message is not displayed", pleaseEnterCredentialsMsg.isDisplayed());
    }

    public void inputValidCredentials() {
        usernameField.sendKeys(ConfigReader.getProperty("login.username"));
        passwordField.clear();
        passwordField.sendKeys(ConfigReader.getProperty("login.password"));
    }
}
