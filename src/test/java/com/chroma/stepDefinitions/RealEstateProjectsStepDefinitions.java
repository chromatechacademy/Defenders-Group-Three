package com.chroma.stepDefinitions;

import com.chroma.stepImplementation.RealEstateProjectsStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateProjectsStepDefinitions {

    @Then("admin clicks the projects dropdown on dashboard page")
    public void admin_clicks_the_projects_dropdown_on_dashboard_page() {
        RealEstateProjectsStepImpl.projectsDropDown();
    }

    @Then("the following elements should be displayed {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String addNewProject, String projects, String active,
            String archived) {
        RealEstateProjectsStepImpl.followingTextAssertion(addNewProject, projects, active, archived);
    }
}
