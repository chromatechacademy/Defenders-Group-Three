package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgentsStepDefinitions extends PageInitializer {

    @Given("Login to admin site {string} is successful with {string} and {string}")
    public void login_to_admin_site_is_successful_with_and(String url, String adminEmail, String adminPwd) {
        driver.get(url);
        adminLoginPage.login(adminEmail, adminPwd);
        String title = driver.getTitle();
        CommonUtils.assertEquals("Admin Panel", title);
    }

    @Then("Add agent {string} {string} {string} {string} {string}")
    public void add_agent(String firstname, String lastname, String email, String phone, String pwd) {
        CommonUtils.click(agentPage.agentsHyperlink);
        CommonUtils.click(agentPage.addNowButton);
        CommonUtils.sendKeys(agentPage.firstNameTextBox, firstname);
        CommonUtils.sendKeys(agentPage.lastNameTextBox, lastname);
        CommonUtils.sendKeys(agentPage.emailTextBox, email);
        CommonUtils.sendKeys(agentPage.phoneTextBox, phone);
        CommonUtils.sendKeys(agentPage.passwordTextBox, pwd);
        CommonUtils.sendKeys(agentPage.retypePasswordTextBox, pwd);
        CommonUtils.click(agentPage.addAgentSavebutton);
        JavascriptUtils.clickByJS(agentPage.closeModelButton);
        CommonUtils.sleep(5000);
        // agentPage.addAgent(firstname, lastname, email, phone, pwd, pwd);
    }

    @Then("Verify added agent {string} {string} {string} {string} {string}")
    public void verify_added_agent(String firstname, String lastname, String email, String phone, String pwd) {
        driver.navigate().refresh();
        String fullname = firstname + " " + lastname;

        CommonUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(agentPage.getElement(fullname));
        CommonUtils.waitForVisibility(agentPage.getElement(fullname));
        CommonUtils.waitForVisibility(agentPage.getElement(email));
        CommonUtils.waitForVisibility(agentPage.getElement(phone));
    }

    @Then("Delete added agent {string} {string} {string} {string} {string}")
    public void delete_added_agent(String firstname, String lastname, String email, String phone, String pwd) {
        String fullname = firstname + " " + lastname;

        CommonUtils.waitForClickability(agentPage.getMenuButton(fullname));
        CommonUtils.click(agentPage.getMenuButton(fullname));
        CommonUtils.sleep(1000);
        CommonUtils.waitForClickability(agentPage.getMenuDeleteButton(fullname));
        CommonUtils.click(agentPage.getMenuDeleteButton(fullname));
        CommonUtils.sleep(1000);

        CommonUtils.waitForInvisibility(agentPage.getElement(fullname));
        CommonUtils.waitForInvisibility(agentPage.getElement(email));
        CommonUtils.waitForInvisibility(agentPage.getElement(phone));

    }

    @When("Go to Agents Graph")
    public void go_to_agents_graph() {
        CommonUtils.waitForVisibility(agentPage.agentsGraphHyperlink);
        CommonUtils.click(agentPage.agentsGraphHyperlink);    
    }

    @Then("Header text is {string}")
    public void header_text_is(String expected) {
        CommonUtils.waitForVisibility(agentPage.graphHeader);
        String actual = CommonUtils.getText(agentPage.graphHeader);    
        CommonUtils.assertEquals(expected, actual);
    }

    @When("Go to Overview Graph")
    public void go_to_overview_graph() {
        CommonUtils.waitForVisibility(agentPage.overviewGraphHyperlink);
        CommonUtils.click(agentPage.overviewGraphHyperlink);
    }

}
