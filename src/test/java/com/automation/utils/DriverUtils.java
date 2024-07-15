package com.automation.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverUtils {
    static WebDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "latest");

        switch (ConfigReader.getProperty("browser")) {
            case "firefox":
                //WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
               // WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                //WebDriverManager.chromedriver().setup();
                /*ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");*/
                driver = new ChromeDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
