package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class NavigationModulesStepImpl extends PageInitializer {

    public static void studentInformationModuleTextAssertion(String expectedStudentInformationModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.studentInformationModule));
        CommonUtils.assertEquals(DashboardPage.studentInformationModule.getText(),
                expectedStudentInformationModuleText);
    }

    public static void feesCollectionModuleTextAssertion(String expectedFeesCollectionModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesCollectionModule));
        CommonUtils.assertEquals(DashboardPage.feesCollectionModule.getText(), expectedFeesCollectionModuleText);
    }

    public static void incomeModuleTextAssertion(String expectedIncomeModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.incomeModule));
        CommonUtils.assertEquals(DashboardPage.incomeModule.getText(), expectedIncomeModuleText);
    }

    public static void expensesModuleTextAssertion(String expectedExpensesModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.expensesModule));
        CommonUtils.assertEquals(DashboardPage.expensesModule.getText(), expectedExpensesModuleText);
    }

    public static void academicsModuleTextAssertion(String expectedAcademicsModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.academicsModule));
        CommonUtils.assertEquals(DashboardPage.academicsModule.getText(), expectedAcademicsModuleText);
    }

    public static void humanResourceTextAssertion(String expectedHumanResourceModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.humanResourceModule));
        CommonUtils.assertEquals(DashboardPage.humanResourceModule.getText(), expectedHumanResourceModuleText);
    }

    public static void homeworkModuleTextAssertion(String expectedHomeworkModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.homeworkModule));
        CommonUtils.assertEquals(DashboardPage.homeworkModule.getText(), expectedHomeworkModuleText);
    }

    public static void reportsModuleTextAssertion(String expectedReportsModuleText) {
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.reportsModule));
        CommonUtils.assertEquals(DashboardPage.reportsModule.getText(), expectedReportsModuleText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(3000);
    }
}
