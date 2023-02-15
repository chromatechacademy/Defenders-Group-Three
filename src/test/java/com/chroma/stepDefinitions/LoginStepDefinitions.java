package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.LoginStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends PageInitializer {

    @Given("a Chroma Tech Academy teacher or admin is on login page {string}")
    public void a_Chroma_Tech_Academy_teacher_or_admin_is_on_login_page(String url) {
      LoginStepImpl.navigateToLoginPage(url);
    }

    @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password)
            throws InterruptedException {
       LoginStepImpl.loggingIn(username, password);
    }

    @Then("user is on dashboard page {string}")
    public void user_is_on_dashboard_page(String url) {
       LoginStepImpl.assertionDashboardPage(url);
    }
}
