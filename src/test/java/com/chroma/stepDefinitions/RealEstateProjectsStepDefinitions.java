package com.chroma.stepDefinitions;

import com.chroma.pages.RealEstateProjectsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateProjectsStepDefinitions {

    @Then("admin clicks the projects dropdown on dashboard page")
    public void admin_clicks_the_projects_dropdown_on_dashboard_page() {
        RealEstateProjectsPage.projectsTabPageElement.click();
        CommonUtils.sleep(1000);
    }

    @Then("the following elements should be displayed {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String addNewProject, String projects, String active,
            String archived) {
        String actualAddNewProjectText = RealEstateProjectsPage.addNewProjectElement.getText();
        String actualProjectsText = RealEstateProjectsPage.projectsPageElement.getText();
        String actualActiveText = RealEstateProjectsPage.activeRadialButton.getText();
        String actualArchivedText = RealEstateProjectsPage.archivedRadialButton.getText();
        CommonUtils.assertEquals(actualAddNewProjectText, addNewProject);
        CommonUtils.assertEquals(actualProjectsText, projects);
        CommonUtils.assertEquals(actualActiveText, active);
        CommonUtils.assertEquals(actualArchivedText, archived);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
