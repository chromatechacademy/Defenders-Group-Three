package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentAdmissionStepImpl extends PageInitializer {

    public static void StudentsFirstNameAndLastName(String firstName, String lastName) {
        studentAdmissionPage.firstName.sendKeys(firstName);
        studentAdmissionPage.lastName.sendKeys(lastName);
    }

    public static void classAndSectionDropDowns(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropdown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    public static void confirmationMessageAssertion(String confirmationMessage) {
        String actualConfirmationMessage = studentAdmissionPage.confirmationMessage.getText();
        CommonUtils.assertEquals(actualConfirmationMessage, confirmationMessage);
        CommonUtils.nonMobileScreenshots();
    }
}
