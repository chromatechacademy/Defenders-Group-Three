package com.chroma.stepDefinitions;

import com.chroma.pages.HomeworkPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeworkModule {

    LoginPage loginPage = new LoginPage();
    HomeworkPage homeworkPage = new HomeworkPage();

    // Placeholder
    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    // Placeholder
    @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }

    @When("user clicks the homework dropdown on dashboard page {string}")
    public void user_clicks_the_homework_dropdown_on_dashboard_page(String homeworkDropdown) {

    }

    @Then("The following modules should be displayed {string}")
    public void the_following_modules_should_be_displayed(String string) {

    }

}
