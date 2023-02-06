package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStudentRecordsStepDef extends PageInitializer {

    @When("user clicks on Student Details Submodule")
    public void user_clicks_on_Student_Details_Submodule() {
        studentDetailsPage.studentDetailsSubmodule.click();
    }

    @When("user selects {string} from Class dropdown and clicks search button")
    public void user_selects_from_Class_dropdown_and_clicks_search_button(String className) {
        CommonUtils.selectDropDownValue(className, studentDetailsPage.classDropdown);
        studentDetailsPage.searchButton.click();
    }

    @When("user clicks edit button")
    public void user_clicks_edit_button() {
        studentDetailsPage.editButton.click();
    }

    @When("user selects blood group {string} from Blood Group dropdown")
    public void user_selects_blood_group_from_Blood_Group_dropdown(String bloodGroup) {
        CommonUtils.selectDropDownValue(studentDetailsPage.bloodGroupDropdown, 1);
    }

    @When("clicks save button")
    public void clicks_save_button() {
        studentDetailsPage.saveEditsButton.click();
    }

    @Then("{string} alert should be displayed")
    public void alert_should_be_displayed(String expectedSuccessAlertText) {
        String actualSuccessAlertText = CommonUtils.getAlertText();
        CommonUtils.assertEquals(actualSuccessAlertText, expectedSuccessAlertText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
