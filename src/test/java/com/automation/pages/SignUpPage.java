package com.automation.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage{
    @FindBy(xpath = "//a[text() = 'Register Now!']")
    WebElement registerNow;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    WebElement userId;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    WebElement newPassword;

    @FindBy (xpath = "(//input[@type='text'])[4]")
    WebElement repeatPassword;

    @FindBy (xpath = "(//input[@type='text'])[5]")
    WebElement firstName;

    @FindBy (xpath = "(//input[@type='text'])[6]")
    WebElement lastName;

    @FindBy (xpath = "(//input[@type='text'])[7]")
    WebElement email;

    @FindBy (xpath = "(//input[@type='text'])[8]")
    WebElement phone;

    @FindBy (xpath = "(//input[@type='text'])[9]")
    WebElement address1;

    @FindBy (xpath = "(//input[@type='text'])[10]")
    WebElement address2;

    @FindBy (xpath = "(//input[@type='text'])[11]")
    WebElement city;

    @FindBy (xpath = "(//input[@type='text'])[12]")
    WebElement state;

    @FindBy (xpath = "(//input[@type='text'])[13]")
    WebElement zip;

    @FindBy (xpath = "(//input[@type='text'])[14]")
    WebElement country;

    @FindBy (xpath = "//input[@name='account.listOption']")
    WebElement myListCheckbox;

    @FindBy (xpath = "//input[@name='account.bannerOption']")
    WebElement myBannerCheckbox;

    @FindBy (xpath = "//input[@name = 'newAccount']")
    WebElement saveAccountBtn;

    public void clickRegisterNow() {
        registerNow.click();
    }

    public void inputValidCredentials(DataTable dataTable) {
        List<String> expectedData = dataTable.asList();

        userId.sendKeys(expectedData.get(0));
        newPassword.sendKeys(expectedData.get(1));
        repeatPassword.sendKeys(expectedData.get(2));
        firstName.sendKeys(expectedData.get(3));
        lastName.sendKeys(expectedData.get(4));
        email.sendKeys(expectedData.get(5));
        phone.sendKeys(expectedData.get(6));
        address1.sendKeys(expectedData.get(7));
        address2.sendKeys(expectedData.get(8));
        city.sendKeys(expectedData.get(9));
        state.sendKeys(expectedData.get(10));
        zip.sendKeys(expectedData.get(11));
        country.sendKeys(expectedData.get(12));

        myListCheckbox.click();
        myBannerCheckbox.click();

    }
    public void clickOnSaveAccountInfo() {
        saveAccountBtn.click();
    }

    public void verifyWelcomeMsg() {

    }

}
