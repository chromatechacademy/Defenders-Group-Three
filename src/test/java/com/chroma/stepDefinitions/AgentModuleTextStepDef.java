package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.AgentModuleTextStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgentModuleTextStepDef extends PageInitializer {

    @Given("an admin user is on login page {string}")
    public void an_admin_user_is_on_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("an admin user logs in with valid credentials email {string} and password {string}")
    public void an_admin_user_logs_in_with_valid_credentials_email_and_password(String email, String password) {
        AgentModuleTextStepImpl.loggingIn(email, password);
    }

    @When("navigates to the Agents page")
    public void navigates_to_the_Agents_page() {
        agentModulePage.agentsPage.click();
    }

    @Then("user is able to see following text {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_following_text(String membersList, String active, String inactive, String allAgents,
            String addNow, String name, String mail, String contactNumber, String actions) {
        AgentModuleTextStepImpl.assertionAgentModuleText(membersList, active, inactive, allAgents, addNow, name, mail,
                contactNumber, actions);
    }
}
