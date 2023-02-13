package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.RealEstateLoginStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginStepDef extends PageInitializer {

    @Given("an admin or student user is on login page {string}")
    public void an_admin_or_student_user_is_on_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("admin or student user logs in with valid credentials email {string} and password {string}")
    public void admin_or_student_user_logs_in_with_valid_credentials_email_and_password(String email, String password) {
        RealEstateLoginStepImpl.logginIn(email, password);
    }

    @Then("admin or student user should be on dashboard page {string}")
    public void admin_or_student_user_should_be_on_dashboard_page(String expectedRealEstateDashboardUrl) {
        RealEstateLoginStepImpl.dashboardPageAssertion(expectedRealEstateDashboardUrl);
    }
}
