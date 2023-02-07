package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateAddAgentStepDef extends PageInitializer {

    @Then("admin clicks on Agent Button")
    public void admin_clicks_on_Agent_Button() {
        realEstateAgentsPage.agentsButton.click();
    }

    @Then("admin will land on the Agents page with the text {string}")
    public void admin_will_land_on_the_Agents_page_with_the_text(String expectedAllAgentsText) {
        String actualAllAgentsText = realEstateAgentsPage.allAgentsText.getText();
        CommonUtils.assertEquals(expectedAllAgentsText, actualAllAgentsText);
    }

    @Then("admin will click on the Add Now Button")
    public void admin_will_click_on_the_Add_Now_Button() {
        realEstateAgentsPage.addNowButton.click();
    }

    @Then("admin enters Agent {string} and {string}")
    public void admin_enters_Agent_and(String firstName, String lastName) {
        realEstateAgentsPage.firstName.sendKeys(firstName);
        realEstateAgentsPage.lastName.sendKeys(lastName);
    }

    @Then("admin enters Agent {string} {string} {string}")
    public void admin_enters_Agent(String email, String contactNumber, String password) {
        realEstateAgentsPage.email.sendKeys(email);
        realEstateAgentsPage.contactNumber.sendKeys(contactNumber);
        realEstateAgentsPage.password.sendKeys(password);
        realEstateAgentsPage.retypePassword.sendKeys(password);
    }

    @Then("admin will click Save Button")
    public void admin_will_click_Save_Button() {
        realEstateAgentsPage.saveButton.click();
    }

}
