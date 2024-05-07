package com.icaro.stepdefinitios;

import com.icaro.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

import static com.icaro.pages.BasePage.driver;

public class SearchSteps {

    @When("User click ilCarro Search")
    public  void user_click_ilCarro_search(){
        new SearchPage(driver).clickNavigationLinkSearch();
    }
    @And("User enters valid city")
    public void user_enters_valid_city(){
        new SearchPage(driver).fillValidCity();
    }
}
