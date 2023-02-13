package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.RealEstateCreateAgentStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateCreateAgentStepDef extends PageInitializer {

    @Given("an admin user is on the Real Estate login page {string}")
    public void an_admin_user_is_on_the_Real_Estate_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("user logs in with username and password {string} {string}")
    public void user_logs_in_with_username_and_password(String email, String password) {
        RealEstateCreateAgentStepImpl.adminLogsIn(email, password);
    }

    @When("verifies a unique agent has been added wih {string}, {string}, {string}, {string}, {string}")
    public void verifies_a_unique_agent_has_been_added_wih(String firstName, String lastName, String phoneNumber,
            String email, String password) throws InterruptedException {
        RealEstateCreateAgentStepImpl.verifyingUniqueAgent(firstName, lastName, phoneNumber, email, password);
    }

    @Then("admin goes to Active Members list")
    public void admin_goes_to_Active_Members_list() {
        realEstateAgentsPage.activeMember.click();
    }

    @Then("admin checks if agent with email {string} was succesfully added")
    public void admin_checks_if_agent_with_email_was_succesfully_added(String expectedAgentEmail) {
        RealEstateCreateAgentStepImpl.agentEmail(expectedAgentEmail);
    }

    @Then("admin logs out the admin site")
    public void admin_logs_out_the_admin_site() {
        RealEstateCreateAgentStepImpl.adminlogsOut();
    }

    @When("user logs in with valid username and password {string} {string}")
    public void user_logs_in_with_valid_username_and_password(String email, String password) {
        RealEstateCreateAgentStepImpl.userLogsIn(email, password);
    }

    @Then("the admin is landed on a Agent home page with text {string}")
    public void the_admin_is_landed_on_a_Agent_home_page_with_text(String expectedHelloName) {
        RealEstateCreateAgentStepImpl.agentHomePageAssertion(expectedHelloName);
    }
}
