package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.NavigationModulesStepImpl;
import cucumber.api.java.en.Then;

public class NavigationModulesStepDef extends PageInitializer {

    @Then("Student Information Module with the text {string} is displayed")
    public void student_Information_Module_with_the_text_is_displayed(String expectedStudentInformationModuleText) {
        NavigationModulesStepImpl.studentInformationModuleTextAssertion(expectedStudentInformationModuleText);
    }

    @Then("Fees Collection Module with the text {string} is displayed")
    public void fees_Collection_Module_with_the_text_is_displayed(String expectedFeesCollectionModuleText) {
        NavigationModulesStepImpl.feesCollectionModuleTextAssertion(expectedFeesCollectionModuleText);
    }

    @Then("Income Module with the text {string} is displayed")
    public void income_Module_with_the_text_is_displayed(String expectedIncomeModuleText) {
        NavigationModulesStepImpl.incomeModuleTextAssertion(expectedIncomeModuleText);
    }

    @Then("Expenses Module with the text {string} is displayed")
    public void expenses_Module_with_the_text_is_displayed(String expectedExpensesModuleText) {
        NavigationModulesStepImpl.expensesModuleTextAssertion(expectedExpensesModuleText);
    }

    @Then("Academics Module with the text {string} is displayed")
    public void academics_Module_with_the_text_is_displayed(String expectedAcademicsModuleText) {
        NavigationModulesStepImpl.academicsModuleTextAssertion(expectedAcademicsModuleText);
    }

    @Then("Human Resource Module with the text {string} is displayed")
    public void human_Resource_Module_with_the_text_is_displayed(String expectedHumanResourceModuleText) {
        NavigationModulesStepImpl.humanResourceTextAssertion(expectedHumanResourceModuleText);
    }

    @Then("Homework Module with the text {string} is displayed")
    public void homework_Module_with_the_text_is_displayed(String expectedHomeworkModuleText) {
        NavigationModulesStepImpl.homeworkModuleTextAssertion(expectedHomeworkModuleText);
    }

    @Then("Reports Module with the text {string} is displayed")
    public void reports_Module_with_the_text_is_displayed(String expectedReportsModuleText) {
        NavigationModulesStepImpl.reportsModuleTextAssertion(expectedReportsModuleText);
    }
}
