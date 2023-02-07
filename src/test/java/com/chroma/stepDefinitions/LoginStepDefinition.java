package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends PageInitializer {

    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        driver.get(url);
    }

    @When("a user logins with valid credentials username {string} and password {string}")
    public void a_user_logins_with_valid_credentials_username_and_password(String username, String pwd) {
        CommonUtils.sendKeys(loginPage.usernameTextBox, username);
        CommonUtils.sendKeys(loginPage.passwordTextBox, pwd);
        CommonUtils.waitForClickability(loginPage.signInButton);
        CommonUtils.click(loginPage.signInButton);
    }

    @Then("the user lands on the home page {string}")
    public void the_user_lands_on_the_home_page(String dashboardUrl) {
        CommonUtils.assertEquals(dashboardUrl, driver.getCurrentUrl());
    }
}