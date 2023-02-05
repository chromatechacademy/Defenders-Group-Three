package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeesCollectionModuleStepDef extends PageInitializer {

    @When("user clicks on {string} Module")
    public void user_clicks_on_Module(String feesCollectionModule) {
        DashboardPage.feesCollectionModule.click();
    }

    @Then("Collect Fees Submodule is displayed with the text {string}")
    public void collect_Fees_Submodule_is_displayed_with_the_text(String expectedCollectFeesSubmoduleText) {
        String actualCollectFeesSubmoduleText = DashboardPage.collectFeesSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.collectFeesSubmodule));
        CommonUtils.assertEquals(actualCollectFeesSubmoduleText,
                expectedCollectFeesSubmoduleText);
    }

    @Then("Search Fees Payment Submodule is displayed with the text {string}")
    public void search_Fees_Payment_Submodule_is_displayed_with_the_text(String expectedSearchFeesPaymentSubmoduleText) {
       String actualSearchFeesPaymentSubmoduleText = DashboardPage.searchFeesPaymentSubmodule.getText();
       CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.searchFeesPaymentSubmodule));
       CommonUtils.assertEquals(actualSearchFeesPaymentSubmoduleText,
       expectedSearchFeesPaymentSubmoduleText);
    }

    @Then("Search Due Fees Submodule is displayed with the text {string}")
    public void search_Due_Fees_Submodule_is_displayed_with_the_text(String expectedSearchDueFeesSubmoduleText) {
      String actualSearchDueFeesSubmoduleText = DashboardPage.searchDueFeesSubmodule.getText();
    CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.searchDueFeesSubmodule));
    CommonUtils.assertEquals(actualSearchDueFeesSubmoduleText,
    expectedSearchDueFeesSubmoduleText);
    }

    @Then("Fees Master Submodule is displayed with the text {string}")
    public void fees_Master_Submodule_is_displayed_with_the_text(String expectedFeesMasterSubmoduleText) {
        String actualFeesMasterSubmoduleText = DashboardPage.feesMasterSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesMasterSubmodule));
        CommonUtils.assertEquals(actualFeesMasterSubmoduleText,
                expectedFeesMasterSubmoduleText);
    }

    @Then("Fees Group Submodule is displayed with the text {string}")
    public void fees_Group_Submodule_is_displayed_with_the_text(String expectedFeesGroupSubmoduleText) {
        String actualFeesGroupSubmoduleText = DashboardPage.feesGroupSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesGroupSubmodule));
        CommonUtils.assertEquals(actualFeesGroupSubmoduleText,
                expectedFeesGroupSubmoduleText);
    }

    @Then("Fees Type Submodule is displayed with the text {string}")
    public void fees_Type_Submodule_is_displayed_with_the_text(String expectedFeesTypeSubmoduleText) {
        String actualFeesTypeSubmoduleText = DashboardPage.feesTypeSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesTypeSubmodule));
        CommonUtils.assertEquals(actualFeesTypeSubmoduleText,
                expectedFeesTypeSubmoduleText);
    }

    @Then("Fees Discount Submodule is displayed with the text {string}")
    public void fees_Discount_Submodule_is_displayed_with_the_text(String expectedFeesDiscountSubmoduleText) {
        String actualFeesDiscountSubmoduleText = DashboardPage.feesDiscountSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesDiscountSubmodule));
        CommonUtils.assertEquals(actualFeesDiscountSubmoduleText,
                expectedFeesDiscountSubmoduleText);
    }

    @Then("Fees Carry Forward Submodule is displayed with the text {string}")
    public void fees_Carry_Forward_Submodule_is_displayed_with_the_text(String expectedFeesCarryForwardSubmoduleText) {
        String actualFeesCarryForwardSubmoduleText = DashboardPage.feesCarryForwardSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesCarryForwardSubmodule));
        CommonUtils.assertEquals(actualFeesCarryForwardSubmoduleText,
                expectedFeesCarryForwardSubmoduleText);
    }

    @Then("Fees Reminder Submodule is displayed with the text {string}")
    public void fees_Reminder_Submodule_is_displayed_with_the_text(String expectedFeesReminderSubmoduleText) {
        String actualFeesReminderSubmoduleText = DashboardPage.feesReminderSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesReminderSubmodule));
        CommonUtils.assertEquals(actualFeesReminderSubmoduleText,
                expectedFeesReminderSubmoduleText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();    
        CommonUtils.sleep(3000);    
    }
}