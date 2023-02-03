package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.pages.HomeworkPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomeworkPage homeworkPage = new HomeworkPage();

    @And("user clicks the homework dropdown on dashboard page {string}")
    public void user_clicks_the_homework_dropdown_on_dashboard_page(String homeworkDropdown) {
        HomeworkPage.homeworkPageModule.click();
    }

    @Then("The following modules should be displayed {string}")
    public void the_following_modules_should_be_displayed(String addHomework) {
        String actualAddHomeworkText = HomeworkPage.addHomeworkModule.getText();

        CommonUtils.assertEquals(addHomework, actualAddHomeworkText);

        System.out.println("HOMEWORK PAGE GOOD");
    }

}
