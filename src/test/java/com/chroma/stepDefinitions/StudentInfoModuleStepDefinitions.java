package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class StudentInfoModuleStepDefinitions extends PageInitializer {

    DashboardPage dashboardPage = new DashboardPage();
    StudentInformationPage studentInformationPage = new StudentInformationPage();
    LoginPage loginPage = new LoginPage();

    @Then("user clicks the student information dropdown on dashboard page {string}")
    public void user_clicks_the_student_information_dropdown_on_dashboard_page(String studentInformation) {
        DashboardPage.studentInformationModule.click();
    }

    @Then("The following modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_be_displayed(String studentDetails, String studentAdmission,
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

    }

}
