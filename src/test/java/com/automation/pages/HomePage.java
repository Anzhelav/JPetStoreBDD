package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//input[@name = 'keyword']")
    WebElement searchField;

    @FindBy(xpath = "//input[@name = 'searchProducts']")
    WebElement searchBtn;

    @FindBy(xpath = "//img[contains(@src, 'images/cats')]")
    WebElement catsLink;

    @FindBy(xpath = "//a[text() = 'Sign In']")
    WebElement signInLink;

    @FindBy(xpath = "//img[contains(@src, 'images/reptiles')]")
    WebElement reptilesLink;

    @FindBy(id = "Header")
    WebElement homePageHeader;

    @FindBy(xpath = "//a[text() = 'My Account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[text() = 'Sign Out']")
    WebElement signOutBtn;

    @FindBy(xpath = "//img[contains(@src, 'images/dogs')]")
    WebElement dogsLinkSideMenu;

    @FindBy(xpath = "(//area[@alt='Birds'])[2]")
    WebElement birdsLink;

    @FindBy(name ="img_cart")
    WebElement cartBtn;

    @FindBy(xpath ="//area[@alt='Fish']")
    WebElement fishPictureFromMenu;

    @FindBy(xpath ="//area[@alt='Dogs']")
    WebElement dogPictureFromMenu;

    @FindBy(xpath ="//area[@alt='Reptiles']")
    WebElement reptilePictureFromMenu;

    @FindBy(xpath ="//area[@alt='Cats']")
    WebElement catPictureFromMenu;



    public void openWebsite() {
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

    public void inputPetType(String petType) {
        searchField.sendKeys(petType);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public void clickOnCatsLink() {
        catsLink.click();
    }

    public void clickOnSignIn() {
        signInLink.click();
    }

    public void clickOnReptilesLink() {
        reptilesLink.click();
    }

    public void verifyHomePage() {
        Assert.assertTrue("Home page is not displayed", homePageHeader.isDisplayed());
    }

    public void verifyMyAccountLink() {
        Assert.assertTrue("My Account link is not displayed", myAccountLink.isDisplayed());
    }

    public void clickOnSignOutBtn() {
        signOutBtn.click();
    }

    public void verifySignInLink() {
        Assert.assertTrue("Sign In link is not displayed", signInLink.isDisplayed());
    }

    public void clickOnDogsLinkInSideMenu() {
        dogsLinkSideMenu.click();
    }

    public void userClicksOnBirds() {
        birdsLink.click();
    }

    public void verifyBirdsCategoryIsDisplayed() {
        Assert.assertTrue("category is not displayed", birdsLink.isDisplayed());

    }

    public void userClicksOnCartButton() {
        cartBtn.click();

    }

    public void userClicksOnFishPictureFromMenu() {
        fishPictureFromMenu.click();
    }

    public void userClicksOnDogPictureFromPictureMenu() {
        dogPictureFromMenu.click();
    }

    public void userClicksOnReptilePictureFromPictureMenu() {
        reptilePictureFromMenu.click();
    }

    public void userClicksOncatPictureFromPictureMenu() {
        catPictureFromMenu.click();
    }
}
