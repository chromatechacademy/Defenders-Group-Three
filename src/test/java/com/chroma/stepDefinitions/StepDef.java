package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.LoginPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef extends PageInitializer {

    LoginPage loginPage = new LoginPage();

    @Given("a user navigate to the login page {string}")
    public void a_user_navigate_to_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("user enters invalid Username {string} and Password {string}")
    public void user_enters_invalid_Username_and_Password(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
    }

    @Then("user click on the Sign In button")
    public void user_click_on_the_Sign_In_button() {
        loginPage.signInButton.click();
    }

    @Then("user should see an error message indicating that the login was not successful")
    public void user_should_see_an_error_message_indicating_that_the_login_was_not_successful() {
        WebElement errorMessage = driver
                .findElement(By.xpath("//div[normalize-space()='Invalid Username or Password']"));
        String expectedMessage = "Invalid Username or Password";
        String actualMessage = errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match the expected message.");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    
}
