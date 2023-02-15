package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.EditStudentRecordsStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStudentRecordsStepDef extends PageInitializer {

    @When("user clicks on Student Details Submodule")
    public void user_clicks_on_Student_Details_Submodule() {
        studentDetailsPage.studentDetailsSubmodule.click();
    }

    @When("user selects {string} from Class dropdown and clicks search button")
    public void user_selects_from_Class_dropdown_and_clicks_search_button(String className) {
        EditStudentRecordsStepImpl.classDropdownAndSearchButton(className);
    }

    @When("user clicks edit button")
    public void user_clicks_edit_button() {
        studentDetailsPage.editButton.click();
    }

    @When("user selects section {string} from Section dropdown and blood group {string} from Blood Group dropdown")
    public void user_selects_section_from_Section_dropdown_and_blood_group_from_Blood_Group_dropdown(String sectionName,
            String bloodGroup) {
        EditStudentRecordsStepImpl.selectSectionAndBloodGroup(sectionName, bloodGroup);
    }

    @When("clicks save button")
    public void clicks_save_button() {
        studentDetailsPage.saveEditsButton.click();
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedSuccessMessageText) {
        EditStudentRecordsStepImpl.messageTextAssertion(expectedSuccessMessageText);
    }
}
