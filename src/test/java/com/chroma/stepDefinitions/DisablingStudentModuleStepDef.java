package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class DisablingStudentModuleStepDef extends PageInitializer {

    @Then("navigates to Student Information Module")
    public void navigates_to_Student_Information_Module() {
        disableStudentPage.studentInformationModule.click();
    }

    @Then("navigates to Student Details Sub Module")
    public void navigates_to_Student_Details_Sub_Module() {
        disableStudentPage.studentDetailsSubModule.click();
    }

    @Then("Selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, disableStudentPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, disableStudentPage.sectionDropDown);
    }

    @Then("clicks search button")
    public void clicks_search_button() {
        disableStudentPage.searchButton.click();
    }

    @Then("clicks on student name {string}")
    public void clicks_on_student_name(String studentName) {
        disableStudentPage.studentName.sendKeys(studentName);
        disableStudentPage.studentName.click();
    }

    @Then("clicks the red thumbs down icon in the upper right corner")
    public void clicks_the_red_thumbs_down_icon_in_the_upper_right_corner() throws InterruptedException {
        disableStudentPage.redThumbsDownIcon.click();
        Thread.sleep(3000);
    }

    @Then("clicks OK on the pop up alert")
    public void clicks_OK_on_the_pop_up_alert() {
        CommonUtils.acceptAlert();
    }

    @Then("selects {string} in the Reason drop down menu")
    public void selects_in_the_Reason_drop_down_menu(String testDisableReason) {
        CommonUtils.waitForClickability(disableStudentPage.disableReasonDropDown);
        CommonUtils.selectDropDownValue(testDisableReason, disableStudentPage.disableReasonDropDown);

    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        disableStudentPage.saveButton.click();
        CommonUtils.waitForClickability(disableStudentPage.saveButton);
    }

    @Then("user navigates to Disabled Students Sub Module")
    public void user_navigates_to_Disabled_Students_Sub_Module() {
        disableStudentPage.disabledStudentSubModule.click();
    }

    @Then("selects Class {string} and section {string}")
    public void selects_Class_and_section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    @Then("user clicks search button")
    public void user_clicks_search_button() {
        disableStudentPage.searchButton.click();
    }

    @Then("user should see the name of the student in the Disabled Students Page")
    public void user_should_see_the_name_of_the_student_in_the_Disabled_Students_Page() {
        Assert.assertTrue(disableStudentPage.enableStudentSubModule.isDisplayed());
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}