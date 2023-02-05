package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends PageInitializer {

    @Given("a Chroma Tech Academy teacher or admin is on login page {string}")
    public void a_Chroma_Tech_Academy_teacher_or_admin_is_on_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password)
            throws InterruptedException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signInButton.click();
        Thread.sleep(2000);
    }

    @Then("user is on dashboard page {string}")
    public void user_is_on_dashboard_page(String url) {
        String actualHomePage = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualHomePage, url);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
