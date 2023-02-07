package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewProjectStepDef extends PageInitializer {

    @When("navigates to the Projects page")
    public void navigates_to_the_Projects_page() {
        newProjectPage.projectsModule.click();
    }

    @When("clicks on Add New Project button")
    public void clicks_on_Add_New_Project_button() {
        newProjectPage.addNewProjectButton.click();
    }

    @When("enters title {string}")
    public void enters_title(String titleName) {
        newProjectPage.titleTextBox.sendKeys(titleName);
    }

    @When("enters street number {string}")
    public void enters_street_number(String streetNum) {
        JavascriptUtils.scrollIntoView(newProjectPage.streetNumberTextBox);
        newProjectPage.streetNumberTextBox.sendKeys(streetNum);
    }

    @When("enters street name {string}")
    public void enters_street_name(String streetName) {
        newProjectPage.streetNameTextBox.sendKeys(streetName);
    }

    @When("enters suburb name {string}")
    public void enters_suburb_name(String suburb) {
        newProjectPage.suburbTextBox.sendKeys(suburb);
    }

    @When("clicks next button")
    public void clicks_next_button() {
        newProjectPage.nextButton.click();
    }

    @When("clicks save button")
    public void clicks_save_button() {
        newProjectPage.saveButton.click();
    }

    @Then("project is added and confirmation message is displaying {string}")
    public void project_is_added_and_confirmation_message_is_displaying(String confirmationMsg) {
        String actualConfirmationMessage = newProjectPage.confirmationMessage.getText();
        CommonUtils.assertEquals(actualConfirmationMessage, confirmationMsg);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}