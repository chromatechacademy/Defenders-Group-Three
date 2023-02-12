package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.HomeworkPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDefinitions extends PageInitializer {

    @Then("user clicks the homework dropdown on dashboard page")
public void user_clicks_the_homework_dropdown_on_dashboard_page() {
    HomeworkPage.homeworkPageModule.click();
    CucumberLogUtils.logScreenShot();
    CucumberLogUtils.logExtentScreenshot();
}
    @Then("The following modules should be displayed {string}")
    public void the_following_modules_should_be_displayed(String addHomework) {
        String actualAddHomeworkText = HomeworkPage.addHomeworkModule.getText();
        CommonUtils.assertEquals(addHomework, actualAddHomeworkText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
