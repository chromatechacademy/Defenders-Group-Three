package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.stepImplementation.FeesCollectionModuleStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeesCollectionModuleStepDef extends PageInitializer {

    @When("user clicks on {string} Module")
    public void user_clicks_on_Module(String feesCollectionModule) {
        DashboardPage.feesCollectionModule.click();
    }

    @Then("Collect Fees Submodule is displayed with the text {string}")
    public void collect_Fees_Submodule_is_displayed_with_the_text(String expectedCollectFeesSubmoduleText) {
        FeesCollectionModuleStepImpl.collectFeesSubmoduleTextAssertion(expectedCollectFeesSubmoduleText);
    }

    @Then("Search Fees Payment Submodule is displayed with the text {string}")
    public void search_Fees_Payment_Submodule_is_displayed_with_the_text(String expectedSearchFeesPaymentSubmoduleText) {
        FeesCollectionModuleStepImpl.feesPaymentSubmoduleTextAssertion(expectedSearchFeesPaymentSubmoduleText);
    }

    @Then("Search Due Fees Submodule is displayed with the text {string}")
    public void search_Due_Fees_Submodule_is_displayed_with_the_text(String expectedSearchDueFeesSubmoduleText) {
        FeesCollectionModuleStepImpl.searchDueFeesSubmoduleTextAssertion(expectedSearchDueFeesSubmoduleText);
    }

    @Then("Fees Master Submodule is displayed with the text {string}")
    public void fees_Master_Submodule_is_displayed_with_the_text(String expectedFeesMasterSubmoduleText) {
        FeesCollectionModuleStepImpl.feesMasterSubmoduleTextAssertion(expectedFeesMasterSubmoduleText);
    }

    @Then("Fees Group Submodule is displayed with the text {string}")
    public void fees_Group_Submodule_is_displayed_with_the_text(String expectedFeesGroupSubmoduleText) {
        FeesCollectionModuleStepImpl.feesGroupSubmoduleTextAssertion(expectedFeesGroupSubmoduleText);
    }

    @Then("Fees Type Submodule is displayed with the text {string}")
    public void fees_Type_Submodule_is_displayed_with_the_text(String expectedFeesTypeSubmoduleText) {
        FeesCollectionModuleStepImpl.feesTypeSubmoduleTextAssertion(expectedFeesTypeSubmoduleText);
    }

    @Then("Fees Discount Submodule is displayed with the text {string}")
    public void fees_Discount_Submodule_is_displayed_with_the_text(String expectedFeesDiscountSubmoduleText) {
        FeesCollectionModuleStepImpl.feesDiscountSubmoduleTextAssertion(expectedFeesDiscountSubmoduleText);
    }

    @Then("Fees Carry Forward Submodule is displayed with the text {string}")
    public void fees_Carry_Forward_Submodule_is_displayed_with_the_text(String expectedFeesCarryForwardSubmoduleText) {
        FeesCollectionModuleStepImpl.feesCarryForwardSubmoduleTextAssertion(expectedFeesCarryForwardSubmoduleText);
    }

    @Then("Fees Reminder Submodule is displayed with the text {string}")
    public void fees_Reminder_Submodule_is_displayed_with_the_text(String expectedFeesReminderSubmoduleText) {
        FeesCollectionModuleStepImpl.feesReminderSubmoduleTextAssertion(expectedFeesReminderSubmoduleText);  
    }
}