package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NavigationModulesStepDef {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Student Information Module with the text {string} is displayed")
    public void student_Information_Module_with_the_text_is_displayed(String expectedStudentInformationModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.studentInformationModule);
        CommonUtils.assertEquals(DashboardPage.studentInformationModule.getText(),
                expectedStudentInformationModuleText);
    }

    @Then("Fees Collection Module with the text {string} is displayed")
    public void fees_Collection_Module_with_the_text_is_displayed(String expectedFeesCollectionModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.feesCollectionModule);
        CommonUtils.assertEquals(DashboardPage.feesCollectionModule.getText(), expectedFeesCollectionModuleText);
    }

    @Then("Income Module with the text {string} is displayed")
    public void income_Module_with_the_text_is_displayed(String expectedIncomeModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.incomeModule);
        CommonUtils.assertEquals(DashboardPage.incomeModule.getText(), expectedIncomeModuleText);
    }

    @Then("Expenses Module with the text {string} is displayed")
    public void expenses_Module_with_the_text_is_displayed(String expectedExpensesModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.expensesModule);
        CommonUtils.assertEquals(DashboardPage.expensesModule.getText(), expectedExpensesModuleText);
    }

    @Then("Academics Module with the text {string} is displayed")
    public void academics_Module_with_the_text_is_displayed(String expectedAcademicsModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.academicsModule);
        CommonUtils.assertEquals(DashboardPage.academicsModule.getText(), expectedAcademicsModuleText);
    }

    @Then("Human Resource Module with the text {string} is displayed")
    public void human_Resource_Module_with_the_text_is_displayed(String expectedHumanResourceModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.humanResourceModule);
        CommonUtils.assertEquals(DashboardPage.humanResourceModule.getText(), expectedHumanResourceModuleText);
    }

    @Then("Homework Module with the text {string} is displayed")
    public void homework_Module_with_the_text_is_displayed(String expectedHomeworkModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.homeworkModule);
        CommonUtils.assertEquals(DashboardPage.homeworkModule.getText(), expectedHomeworkModuleText);
    }

    @Then("Reports Module with the text {string} is displayed")
    public void reports_Module_with_the_text_is_displayed(String expectedReportsModuleText) {
        CommonUtils.isElementDisplayed(DashboardPage.reportsModule);
        CommonUtils.assertEquals(DashboardPage.reportsModule.getText(), expectedReportsModuleText);
    }
}
