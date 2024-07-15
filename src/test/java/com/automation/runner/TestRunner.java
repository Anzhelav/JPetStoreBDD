package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "com.automation.stepdef",
        tags = "@Regression or @Smoke",
        plugin = {"html:target/cucumber-html.html","json:target/cucumber.json"}

)

public class TestRunner {
}
