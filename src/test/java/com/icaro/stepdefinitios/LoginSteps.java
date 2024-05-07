package com.icaro.stepdefinitios;

import com.icaro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.icaro.pages.BasePage.driver;


public class LoginSteps {
    @And("User clicks on Login link")
    public void click_login_button(){
        new LoginPage(driver).clickLoginButton();
    }
    @And("User enters valid data")
    public void user_enter_valid_data(){
        new LoginPage(driver).fillEmailAndPassword("ledyolga@ukr.net", "Qwerty123!@#");
    }
    @And("User clicks on Yalla button")
    public void user_click_on_Yalla_button(){
        new LoginPage(driver).clickYalla();
    }
    @Then("User verifies Success Message is displayed")
    public void verify_succes_login(){
        new LoginPage(driver).isSuccessMessageDisplays();
    }
    @And("User enters valid email and invalid password")
    public void user_enters_valid_email_and_invalid_password(DataTable table){
        new LoginPage(driver).enterValidEmailAndInvalidPassword(table);

    }
    @Then("User verifies Error is displayed")
    public void verify_error_displaed()  {
        new LoginPage(driver).isErrorMessageDisplayed();
    }
}
