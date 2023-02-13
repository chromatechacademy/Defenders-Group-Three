package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class DisablingStudentModuleStepImpl extends PageInitializer {

    public static void classAndSection(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, disableStudentPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, disableStudentPage.sectionDropDown);
    }

    public static void studentNameButton(String studentName) {
        disableStudentPage.studentName.sendKeys(studentName);
        disableStudentPage.studentName.click();
    }

    public static void clickOnRedThumbsDownIcon() {
        disableStudentPage.redThumbsDownIcon.click();
        CommonUtils.sleep(2000);
    }

    public static void clickOkPopAlert() {
        CommonUtils.acceptAlert();
        CommonUtils.nonMobileScreenshots();
    }

    public static void selectReason(String testDisableReason) {
        CommonUtils.waitForClickability(disableStudentPage.disableReasonDropDown);
        CommonUtils.selectDropDownValue(testDisableReason, disableStudentPage.disableReasonDropDown);
    }

    public static void saveButton() {
        disableStudentPage.saveButton.click();
        CommonUtils.waitForClickability(disableStudentPage.saveButton);
    }

    public static void disabledStudentsSubmodule() {
        disableStudentPage.disabledStudentSubModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    public static void selectClassAndSection(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    public static void assetionEnableStudentSubModule() {
        CommonUtils.assertTrue(disableStudentPage.enableStudentSubModule.isDisplayed());
        CommonUtils.nonMobileScreenshots();
    }
}
