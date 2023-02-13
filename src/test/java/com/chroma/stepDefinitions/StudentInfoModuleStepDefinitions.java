package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.StudentInfoModuleStepImpl;
import cucumber.api.java.en.Then;

public class StudentInfoModuleStepDefinitions extends PageInitializer {

    @Then("user clicks the student information dropdown on dashboard page {string}")
    public void user_clicks_the_student_information_dropdown_on_dashboard_page(String studentInformation) {
        StudentInfoModuleStepImpl.studentInformationDropdown(studentInformation);
    }

    @Then("The following modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_be_displayed(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete,
            String studentCategories, String studentHouse, String disableReason) {
        StudentInfoModuleStepImpl.followingModulesAssertion(studentDetails, studentAdmission, disabledStudents,
                bulkDelete, studentCategories, studentHouse, disableReason);
    }
}
