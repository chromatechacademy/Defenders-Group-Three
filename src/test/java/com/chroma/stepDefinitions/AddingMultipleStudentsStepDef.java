package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.AddingMultipleStudentsStepImpl;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class AddingMultipleStudentsStepDef extends PageInitializer {

    @Then("user enters unique Student Admission Number {string}")
    public void user_enters_unique_Student_Admission_Number(String admissionNumber) {
        addMultipleStudentsPage.admissionNumberTextBox.sendKeys(admissionNumber);
    }

    @Then("enters Students first name {string}")
    public void enters_Students_first_name(String firstName) {
        addMultipleStudentsPage.firstNameTextBox.sendKeys(firstName);
    }

    @Then("enters last name {string}")
    public void enters_last_name(String lastName) {
        addMultipleStudentsPage.lastNameTextBox.sendKeys(lastName);
    }

    @Then("selects class {string}")
    public void selects_class(String classDropDownMenu) {
        CommonUtils.selectDropDownValue(classDropDownMenu, addMultipleStudentsPage.classDropDownMenu);
    }

    @Then("selects section {string}")
    public void selects_section(String sectionDropDownMenu) {
        CommonUtils.selectDropDownValue(sectionDropDownMenu, addMultipleStudentsPage.sectionDropDownMenu);
    }

    @Then("user selects gender {string}")
    public void user_selects_gender(String gender) {
        CommonUtils.selectDropDownValue(gender, addMultipleStudentsPage.genderDropDownMenu);
    }

    @Then("user enters DOB {string}")
    public void user_enters_DOB(String DOB) {
        studentAdmissionPage.DOBTextBox.sendKeys(DOB);
    }

    @Then("on the field If Guardian Is clicks on mother radio button")
    public void on_the_field_If_Guardian_Is_clicks_on_mother_radio_button() {
        studentAdmissionPage.motherRadioButton.click();
    }

    @Then("for Parent Guardian Details user enters mothers name {string}")
    public void for_Parent_Guardian_Details_user_enters_mothers_name(String mothersName) {
        addMultipleStudentsPage.guardianName.sendKeys(mothersName);
    }

    @Then("user enters {string}")
    public void user_enters(String guardianPhoneNumber) {
        addMultipleStudentsPage.guardianPhone.sendKeys(guardianPhoneNumber);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        AddingMultipleStudentsStepImpl.saveButton();
    }
}
