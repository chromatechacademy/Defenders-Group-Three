package com.chroma.stepDefinitions;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class NavigationModulesStepDef extends PageInitializer{
  
    @Then("Student Information Module with the text {string} is displayed")
    public void student_Information_Module_with_the_text_is_displayed(String expectedStudentInformationModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.studentInformationModule));
        CommonUtils.assertEquals(DashboardPage.studentInformationModule.getText(),
                expectedStudentInformationModuleText);
    }

    @Then("Fees Collection Module with the text {string} is displayed")
    public void fees_Collection_Module_with_the_text_is_displayed(String expectedFeesCollectionModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesCollectionModule));
        CommonUtils.assertEquals(DashboardPage.feesCollectionModule.getText(), expectedFeesCollectionModuleText);
    }

    @Then("Income Module with the text {string} is displayed")
    public void income_Module_with_the_text_is_displayed(String expectedIncomeModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.incomeModule));
        CommonUtils.assertEquals(DashboardPage.incomeModule.getText(), expectedIncomeModuleText);
    }

    @Then("Expenses Module with the text {string} is displayed")
    public void expenses_Module_with_the_text_is_displayed(String expectedExpensesModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.expensesModule));
        CommonUtils.assertEquals(DashboardPage.expensesModule.getText(), expectedExpensesModuleText);
    }

    @Then("Academics Module with the text {string} is displayed")
    public void academics_Module_with_the_text_is_displayed(String expectedAcademicsModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.academicsModule));
        CommonUtils.assertEquals(DashboardPage.academicsModule.getText(), expectedAcademicsModuleText);
    }

    @Then("Human Resource Module with the text {string} is displayed")
    public void human_Resource_Module_with_the_text_is_displayed(String expectedHumanResourceModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.humanResourceModule));
        CommonUtils.assertEquals(DashboardPage.humanResourceModule.getText(), expectedHumanResourceModuleText);
    }

    @Then("Homework Module with the text {string} is displayed")
    public void homework_Module_with_the_text_is_displayed(String expectedHomeworkModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.homeworkModule));
        CommonUtils.assertEquals(DashboardPage.homeworkModule.getText(), expectedHomeworkModuleText);
    }

    @Then("Reports Module with the text {string} is displayed")
    public void reports_Module_with_the_text_is_displayed(String expectedReportsModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.reportsModule));
        CommonUtils.assertEquals(DashboardPage.reportsModule.getText(), expectedReportsModuleText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(3000);
    }
}
