package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoModuleStepDef extends PageInitializer {

    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String string) {

    }

    @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String string, String string2) {

    }

    @And("user clicks the student information dropdown on dashboard page {string}")
    public void user_clicks_the_student_information_dropdown_on_dashboard_page(String string) {
        DashboardPage.studentInformationModule.click();
    }

    @Then("The following modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_be_displayed(String string, String string2, String string3, String string4,
            String string5, String string6, String string7) {

    }

}
