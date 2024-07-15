package com.automation.stepdef;

import com.automation.pages.SearchPage;
import io.cucumber.java.en.Then;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @Then("verify valid search results are displayed")
    public void verify_valid_search_results_are_displayed() {
        searchPage.verifyPage();
    }

    @Then("verify user gets please enter a keyword message")
    public void verifyUserGetsPleaseEnterAKeywordMessage() {
        searchPage.verifyNoKeywordMsg();
    }
}


