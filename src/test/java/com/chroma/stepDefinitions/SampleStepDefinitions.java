package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SampleStepDefinitions extends PageInitializer{

    // Add step definitions in this class
    // NOTE: Every step definitions class Extends PageInitializer
    // PageInitializer extends WebDriverUtils
    
@Given("a user is on the login page {string}")
public void a_user_is_on_the_login_page(String string) {
    
}

@When("user logs in with valid credentials username {string} and password {string}")
public void user_logs_in_with_valid_credentials_username_and_password(String string, String string2) {
   
}

}
