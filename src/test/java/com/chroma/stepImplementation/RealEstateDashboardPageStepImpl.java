package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.web.CommonUtils;

public class RealEstateDashboardPageStepImpl extends PageInitializer {

    public static void followingElementsAssertion(String dashboard, String helloAdmin, String overview,
            String agentsGraph, String propoertiesOverview, String properties, String agents, String dashboardTab,
            String projects) {
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
        CommonUtils.nonMobileScreenshots();
    }
}
