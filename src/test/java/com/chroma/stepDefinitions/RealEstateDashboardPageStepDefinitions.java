package com.chroma.stepDefinitions;

import com.chroma.stepImplementation.RealEstateDashboardPageStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateDashboardPageStepDefinitions {

    @Then("the following elements should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String dashboard, String helloAdmin, String overview,
            String agentsGraph, String propoertiesOverview, String properties, String agents, String dashboardTab,
            String projects) {
        RealEstateDashboardPageStepImpl.followingElementsAssertion(dashboard, helloAdmin, overview, agentsGraph,
                propoertiesOverview, properties, agents, dashboardTab, projects);
    }
}
