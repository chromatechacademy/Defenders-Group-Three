package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class FeesCollectionModuleStepImpl extends PageInitializer {

    public static void collectFeesSubmoduleTextAssertion(String expectedCollectFeesSubmoduleText) {
        String actualCollectFeesSubmoduleText = DashboardPage.collectFeesSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.collectFeesSubmodule));
        CommonUtils.assertEquals(actualCollectFeesSubmoduleText,
                expectedCollectFeesSubmoduleText);
    }

    public static void feesPaymentSubmoduleTextAssertion(
            String expectedSearchFeesPaymentSubmoduleText) {
        String actualSearchFeesPaymentSubmoduleText = DashboardPage.searchFeesPaymentSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.searchFeesPaymentSubmodule));
        CommonUtils.assertEquals(actualSearchFeesPaymentSubmoduleText,
                expectedSearchFeesPaymentSubmoduleText);
    }

    public static void searchDueFeesSubmoduleTextAssertion(String expectedSearchDueFeesSubmoduleText) {
        String actualSearchDueFeesSubmoduleText = DashboardPage.searchDueFeesSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.searchDueFeesSubmodule));
        CommonUtils.assertEquals(actualSearchDueFeesSubmoduleText,
                expectedSearchDueFeesSubmoduleText);
    }

    public static void feesMasterSubmoduleTextAssertion(String expectedFeesMasterSubmoduleText) {
        String actualFeesMasterSubmoduleText = DashboardPage.feesMasterSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesMasterSubmodule));
        CommonUtils.assertEquals(actualFeesMasterSubmoduleText,
                expectedFeesMasterSubmoduleText);
    }

    public static void feesGroupSubmoduleTextAssertion(String expectedFeesGroupSubmoduleText) {
        String actualFeesGroupSubmoduleText = DashboardPage.feesGroupSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesGroupSubmodule));
        CommonUtils.assertEquals(actualFeesGroupSubmoduleText,
                expectedFeesGroupSubmoduleText);
    }

    public static void feesTypeSubmoduleTextAssertion(String expectedFeesTypeSubmoduleText) {
        String actualFeesTypeSubmoduleText = DashboardPage.feesTypeSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesTypeSubmodule));
        CommonUtils.assertEquals(actualFeesTypeSubmoduleText,
                expectedFeesTypeSubmoduleText);
    }

    public static void feesDiscountSubmoduleTextAssertion(String expectedFeesDiscountSubmoduleText) {
        String actualFeesDiscountSubmoduleText = DashboardPage.feesDiscountSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesDiscountSubmodule));
        CommonUtils.assertEquals(actualFeesDiscountSubmoduleText,
                expectedFeesDiscountSubmoduleText);
    }

    public static void feesCarryForwardSubmoduleTextAssertion(
            String expectedFeesCarryForwardSubmoduleText) {
        String actualFeesCarryForwardSubmoduleText = DashboardPage.feesCarryForwardSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesCarryForwardSubmodule));
        CommonUtils.assertEquals(actualFeesCarryForwardSubmoduleText,
                expectedFeesCarryForwardSubmoduleText);
    }

    public static void feesReminderSubmoduleTextAssertion(String expectedFeesReminderSubmoduleText) {
        String actualFeesReminderSubmoduleText = DashboardPage.feesReminderSubmodule.getText();
        CommonUtils.assertTrue(CommonUtils.isElementDisplayed(DashboardPage.feesReminderSubmodule));
        CommonUtils.assertEquals(actualFeesReminderSubmoduleText,
                expectedFeesReminderSubmoduleText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(3000);
    }
}
