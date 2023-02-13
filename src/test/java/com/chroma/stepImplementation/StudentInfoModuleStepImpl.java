package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.CommonUtils;

public class StudentInfoModuleStepImpl extends PageInitializer {

    public static void studentInformationDropdown(String studentInformation) {
        DashboardPage.studentInformationModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    public static void followingModulesAssertion(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete,
            String studentCategories, String studentHouse, String disableReason) {
        String actualStudentDetailsText = StudentInformationPage.studentDetailsModule.getText();
        String actualstudentAdmissionText = StudentInformationPage.studentAdmissionModule.getText();
        String actualBulkDeteText = StudentInformationPage.bulkDeleteModule.getText();
        String actualStudentCategoriesText = StudentInformationPage.studentCategoriesModule.getText();
        String actualStudentHouseText = StudentInformationPage.studentHouseModule.getText();
        String actualDisableReasonText = StudentInformationPage.disableReasonModule.getText();
        CommonUtils.assertEquals(actualStudentDetailsText, studentDetails);
        CommonUtils.assertEquals(actualstudentAdmissionText, studentAdmission);
        CommonUtils.assertEquals(actualBulkDeteText, bulkDelete);
        CommonUtils.assertEquals(actualStudentCategoriesText, studentCategories);
        CommonUtils.assertEquals(actualStudentHouseText, studentHouse);
        CommonUtils.assertEquals(actualDisableReasonText, disableReason);
        CommonUtils.nonMobileScreenshots();
    }
}
