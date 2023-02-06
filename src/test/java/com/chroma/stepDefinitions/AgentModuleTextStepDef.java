package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
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
    public void an_admin_user_logs_in_with_valid_credentials_email_and_password(String email, String password)
            throws InterruptedException {
        agentModulePage.emailTextBox.sendKeys(email);
        agentModulePage.passwordTextBox.sendKeys(password);
        Thread.sleep(3000);
        agentModulePage.loginButton.click();
    }

    @When("navigates to the Agents page")
    public void navigates_to_the_Agents_page() {
        agentModulePage.agentsPage.click();
    }

    @Then("user is able to see following text {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_is_able_to_see_following_text(String membersList, String active, String inactive, String allAgents,
            String addNow, String name, String mail, String contactNumber, String actions) {

        String actualMembersList = agentModulePage.memberButton.getText();
        CommonUtils.assertEquals(actualMembersList, membersList);

        String actualActiveText = agentModulePage.activeText.getText();
        CommonUtils.assertEquals(actualActiveText, active);

        String actualInactiveText = agentModulePage.inactiveText.getText();
        CommonUtils.assertEquals(actualInactiveText, inactive);

        String actualAllAgentsText = agentModulePage.allAgentsText.getText();
        CommonUtils.assertEquals(actualAllAgentsText, allAgents);

        String actualAddNowText = agentModulePage.addNowText.getText();
        CommonUtils.assertEquals(actualAddNowText, addNow);

        String actualNameText = agentModulePage.nameText.getText();
        CommonUtils.assertEquals(actualNameText, name);

        String actualMailText = agentModulePage.mailText.getText();
        CommonUtils.assertEquals(actualMailText, contactNumber);

        String actualContactNumber = agentModulePage.contactNumberText.getText();
        CommonUtils.assertEquals(actualContactNumber, contactNumber);

        String actualActionsText = agentModulePage.actionsText.getText();
        CommonUtils.assertEquals(actualActionsText, actions);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
