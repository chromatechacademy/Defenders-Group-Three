package com.chroma.stepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoModuleStepDef extends PageInitializer {

    DashboardPage dashboardPage = new DashboardPage();
    StudentInformationPage studentInformationPage = new StudentInformationPage();
    LoginPage loginPage = new LoginPage();

    // Placeholder
    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    // Placeholder
    @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }

    @And("user clicks the student information dropdown on dashboard page {string}")
    public void user_clicks_the_student_information_dropdown_on_dashboard_page(String string) {
        DashboardPage.studentInformationModule.click();
    }

    @Then("The following modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_be_displayed(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete,
            String studentCategories, String studentHouse, String disableReason) {

        String actualStudentDetailsText = StudentInformationPage.studentDetailsModule.getText();
        System.out.println(actualStudentDetailsText);

        String actualstudentAdmissionText = StudentInformationPage.studentAdmissionModule.getText();
        System.out.println(actualstudentAdmissionText);

        String actualBulkDeteText = StudentInformationPage.bulkDeleteModule.getText();
        System.out.println(actualBulkDeteText);

        String actualStudentCategoriesText = StudentInformationPage.studentCategoriesModule.getText();
        System.out.println(actualStudentCategoriesText);

        String actualStudentHouseText = StudentInformationPage.studentHouseModule.getText();
        System.out.println(actualStudentHouseText);

        String actualDisableReasonText = StudentInformationPage.disableReasonModule.getText();
        System.out.println(actualDisableReasonText);

        Assert.assertEquals(actualStudentDetailsText, studentDetails);
        Assert.assertEquals(actualstudentAdmissionText, studentAdmission);
        Assert.assertEquals(actualBulkDeteText, bulkDelete);
        Assert.assertEquals(actualStudentCategoriesText, studentCategories);
        Assert.assertEquals(actualStudentHouseText, studentHouse);
        Assert.assertEquals(actualDisableReasonText, disableReason);
        
    


        System.out.println("I MADE IT THROUGH JAVA CLASS!");
    }

}
