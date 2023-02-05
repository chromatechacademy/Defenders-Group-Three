package com.chroma.stepDefinitions;

import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateDashboardPageStepDefinitions {

    @Then("the following elements should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String dashboard, String helloAdmin, String overview,
            String agentsGraph, String propoertiesOverview, String properties, String agents, String dashboardTab, String projects) {

        String actualDashboardText = RealEstateDashboardPage.dashboardPageElement.getText();
        String actualHelloAdminText = RealEstateDashboardPage.helloAdminText.getText();
        String actualOverviewText = RealEstateDashboardPage.overviewPageElement.getText();
        String actualAgentsGraphText = RealEstateDashboardPage.agentsGraphPageElement.getText();
        String actualPropertiesOverviewText = RealEstateDashboardPage.propertiesOverviewText.getText();
        String actualPropertiesText = RealEstateDashboardPage.propertiesText.getText();
        String actualAgentsText = RealEstateDashboardPage.agentsTab.getText();
        String actualDashboardTabText = RealEstateDashboardPage.dashboardTab.getText();
        String actualProjectsText = RealEstateDashboardPage.projectsTab.getText();
        CommonUtils.assertEquals(actualDashboardText, dashboard);
        CommonUtils.assertEquals(actualHelloAdminText, helloAdmin);
        CommonUtils.assertEquals(actualOverviewText, overview);
        CommonUtils.assertEquals(actualAgentsGraphText, agentsGraph);
        CommonUtils.assertEquals(actualPropertiesOverviewText, overview);
        CommonUtils.assertEquals(actualPropertiesText, properties);
        CommonUtils.assertEquals(actualAgentsText, agents);
        CommonUtils.assertEquals(actualDashboardTabText, dashboardTab);
        CommonUtils.assertEquals(actualProjectsText, projects);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}


