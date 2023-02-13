package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class EditStudentRecordsStepImpl extends PageInitializer {

    public static void classDropdownAndSearchButton(String className) {
        CommonUtils.selectDropDownValue(className, studentDetailsPage.classDropdown);
        studentDetailsPage.searchButton.click();
    }

    public static void selectSectionAndBloodGroup(String sectionName,
            String bloodGroup) {
        CommonUtils.selectDropDownValue(sectionName, studentDetailsPage.sectionDropdown);
        CommonUtils.selectDropDownValue(bloodGroup, studentDetailsPage.bloodGroupDropdown);
    }

    public static void messageTextAssertion(String expectedSuccessMessageText) {
        String actualSuccessMessage = studentDetailsPage.successfulEditMessage.getText();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessageText);
        CommonUtils.nonMobileScreenshots();
    }
}
