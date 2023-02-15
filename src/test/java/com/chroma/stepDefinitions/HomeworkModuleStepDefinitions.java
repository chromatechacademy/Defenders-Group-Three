package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.HomeworkModuleStepImpl;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDefinitions extends PageInitializer {

    @Then("user clicks the homework dropdown on dashboard page")
    public void user_clicks_the_homework_dropdown_on_dashboard_page() {
        HomeworkModuleStepImpl.homeworkDropdown();
    }

    @Then("The following modules should be displayed {string}")
    public void the_following_modules_should_be_displayed(String addHomework) {
        HomeworkModuleStepImpl.assertionFollowingModules(addHomework);
    }
}
