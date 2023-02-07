package com.chroma.stepDefinitions;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoStepDef extends PageInitializer {

    @Then("the user clicks on {string} module")
    public void the_user_clicks_on_module(String string) {
        CommonUtils.waitForClickability(studentInfoPage.studentInfoLink);
        CommonUtils.click(studentInfoPage.studentInfoLink);
    }

    @Then("user selects Student Categories")
    public void user_selects_Student_Categories() {
        CommonUtils.waitForClickability(studentInfoPage.studentCategoryLink);
        CommonUtils.click(studentInfoPage.studentCategoryLink);
    }

    @Then("user is directed to Category page {string}")
    public void user_is_directed_to_Category_page(String expectedHeaderText) {
        CommonUtils.waitForVisibility(studentInfoPage.categoryTitle);
        String actualHeaderText = CommonUtils.getText(studentInfoPage.categoryTitle);
        CommonUtils.assertEquals(expectedHeaderText, actualHeaderText);
    }

    @When("user selects Category and enters {string}")
    public void user_selects_Category_and_enters(String newCategoryName) {
        CommonUtils.waitForVisibility(studentInfoPage.categoryNameInput);
        CommonUtils.sendKeys(studentInfoPage.categoryNameInput, newCategoryName);
    }

    @When("user clicks on the Category Save button")
    public void user_clicks_on_the_Category_Save_button() {
        CommonUtils.waitForVisibility(studentInfoPage.saveButton);
        CommonUtils.click(studentInfoPage.saveButton);
    }

    @Then("Category is succesfully saved and confirmation message displays {string}")
    public void category_is_succesfully_saved_and_confirmation_message_displays(String expectedMessage) {
        CommonUtils.waitForVisibility(studentInfoPage.recordSavedMessage);
        String actualMessage = CommonUtils.getText(studentInfoPage.recordSavedMessage);
        CommonUtils.assertEquals(expectedMessage, actualMessage);
    }

    @Then("user clicks on the Category {string} Delete button")
    public void user_clicks_on_the_Category_Delete_button(String newCategoryName) {
        WebElement deleteButton = studentInfoPage.getCateoryDeleteButton(newCategoryName);
        CommonUtils.waitForVisibility(deleteButton);
        CommonUtils.click(deleteButton);
        CommonUtils.acceptAlert();
    }

    @Then("Category is deleted")
    public void category_is_deleted() {
        CommonUtils.waitForVisibility(studentInfoPage.recordDeletedMessage);
        String expectedMessage = "Record Delete Successfully";
        String actualMessage = CommonUtils.getText(studentInfoPage.recordDeletedMessage);
        CommonUtils.assertEquals(expectedMessage, actualMessage);
    }

    /*
     * Student Admission Module
     */
    @And("user selects Student admission")
    public void user_selects_student_admission() {
        CommonUtils.waitForVisibility(studentInfoPage.studentAdmissionLink);
        CommonUtils.click(studentInfoPage.studentAdmissionLink);
    }

    @Then("user is directed to Student admission page {string}")
    public void user_is_directed_to_student_admission_page(String expectedHeaderText) {
        CommonUtils.waitForVisibility(studentInfoPage.studentAdmissionHeader); 
        String actualHeaderText = CommonUtils.getText(studentInfoPage.studentAdmissionHeader);
        CommonUtils.assertEquals(expectedHeaderText, actualHeaderText);            
    }

    @Then("user inputs admission number {string}")
    public void user_inputs_admission_number(String admssionNumber) {
        CommonUtils.waitForVisibility(studentInfoPage.admissionNumInput); 
        CommonUtils.sendKeys(studentInfoPage.admissionNumInput, admssionNumber);
    }

    @Then("user selects class {string}")
    public void user_selects_class(String className) {
        CommonUtils.waitForVisibility(studentInfoPage.classIdSelect); 
        CommonUtils.selectDropDownValue(className, studentInfoPage.classIdSelect);
    }

    @Then("user selects section {string}")
    public void user_selects_section(String section) {
        CommonUtils.waitForVisibility(studentInfoPage.sectionIdSelect); 
        CommonUtils.selectDropDownValue(section, studentInfoPage.sectionIdSelect);                
    }

    @Then("user inputs firstname {string}")
    public void user_inputs_firstname(String firstname) {
        CommonUtils.waitForVisibility(studentInfoPage.sectionIdSelect); 
        CommonUtils.sendKeys(studentInfoPage.firstnameInput, firstname);     
    }

    @Then("user selects gender {string}")
    public void user_selects_gender(String gender) {
        CommonUtils.waitForVisibility(studentInfoPage.genderSelect); 
        CommonUtils.selectDropDownValue(gender, studentInfoPage.genderSelect);           
    }

    @Then("user inputs DOB {string}")
    public void user_inputs_dob(String dobString) {
        CommonUtils.waitForVisibility(studentInfoPage.dobInput); 
        CommonUtils.sendKeys(studentInfoPage.dobInput, dobString);    
    }

    @Then("user selects guardian {string}")
    public void user_selects_guardian(String guandianString) {
        if(guandianString.equalsIgnoreCase("Father")) {
            CommonUtils.waitForVisibility(studentInfoPage.guardianFatherRadioButon);
            CommonUtils.click(studentInfoPage.guardianFatherRadioButon);
        }
    }

    @Then("user inputs guardian name {string}")
    public void user_inputs_guardian_name(String guandianName) {
        CommonUtils.waitForVisibility(studentInfoPage.guardianNameInput); 
        CommonUtils.sendKeys(studentInfoPage.guardianNameInput, guandianName);  
    }

    @Then("user inputs guardian phone {string}")
    public void user_inputs_guardian_phone(String guandianPhone) {
        CommonUtils.waitForVisibility(studentInfoPage.guardianPhoneInput); 
        CommonUtils.sendKeys(studentInfoPage.guardianPhoneInput, guandianPhone);  
    }

    @Then("Error message is displayed {string}")
    public void error_message_displays(String expectedMessage) {
        CommonUtils.waitForVisibility(studentInfoPage.getErrorMessage(expectedMessage));
    }
}