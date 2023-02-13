package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class IncomeModuleStepImpl extends PageInitializer {

    public static void incomeModuleHeader() throws InterruptedException {
        incomeModulePage.incomeModule.click();
        Thread.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    public static void assertionSubmodulesText(String expectedAddIncomeText, String expectedSearchIncomeText,
            String expectedIncomeHeadText) {
        String actualAddIncomeText = incomeModulePage.addIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedAddIncomeText, actualAddIncomeText);
        String actualSearchIncomeText = incomeModulePage.searchIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedSearchIncomeText, actualSearchIncomeText);
        String actualIncomeHeadText = incomeModulePage.incomeHeadSubModule.getText();
        CommonUtils.assertEquals(expectedIncomeHeadText, actualIncomeHeadText);
        CommonUtils.nonMobileScreenshots();
    }

}
