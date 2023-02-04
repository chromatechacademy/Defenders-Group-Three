package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef extends PageInitializer {

    @When("user navigates to Student Information Module")
    public void user_navigates_to_Student_Information_Module() {
        studentAdmissionPage.studentInformationModule.click();
    }

    @When("navigates to Student Admission Submodule")
    public void navigates_to_Student_Admission_Submodule() {
        studentAdmissionPage.studentAdmissionSubmodule.click();
    }

    @When("enters unique Student Admission Number {string}")
    public void enters_unique_Student_Admission_Number(String admissionNumber) {
        studentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("enters Students first name {string} and last name {string}")
    public void enters_Students_first_name_and_last_name(String firstName, String lastName) {
        studentAdmissionPage.firstName.sendKeys(firstName);
        studentAdmissionPage.lastName.sendKeys(lastName);
    }

    @When("selects class {string} and section {string}")
    public void selects_class_and_section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    @When("selects gender {string}")
    public void selects_gender(String gender) {
        CommonUtils.selectDropDownValue(studentAdmissionPage.genderDropDown, gender);
    }

    @When("enters DOB {string}")
    public void enters_DOB(String DOB) {
        studentAdmissionPage.DOBTextBox.sendKeys(DOB);
    }

    @When("on field If Guardian Is clicks on mother radio button")
    public void on_field_If_Guardian_Is_clicks_on_mother_radio_button() {
        studentAdmissionPage.motherRadioButton.click();
    }

    @When("for Parent Guardian Details enters mothers name {string}")
    public void for_Parent_Guardian_Details_enters_mothers_name(String mothersName) throws InterruptedException {
       studentAdmissionPage.guardianNameTextBox.sendKeys(mothersName);
    }

    @When("for Guardian Phone enters {string}")
    public void for_Guardian_Phone_enters(String phoneNumber) {
        studentAdmissionPage.phoneNumberTextBox.sendKeys(phoneNumber);
    }

    @When("clicks on save button")
    public void clicks_on_save_button() throws InterruptedException {
        studentAdmissionPage.saveButton.click();
    }

    @Then("student is succesfully saved and confirmation message is displaying {string}")
    public void student_is_succesfully_saved_and_confirmation_message_is_displaying(String confirmationMessage) throws InterruptedException {
        String actualConfirmationMessage = studentAdmissionPage.confirmationMessage.getText();
        CommonUtils.assertEquals(actualConfirmationMessage, confirmationMessage);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
