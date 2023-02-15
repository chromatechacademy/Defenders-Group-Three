package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateProjectsPage;
import com.chroma.web.CommonUtils;

public class RealEstateProjectsStepImpl extends PageInitializer {

    public static void projectsDropDown() {
        RealEstateProjectsPage.projectsTabPageElement.click();
        CommonUtils.sleep(1000);
    }

    public static void followingTextAssertion(String addNewProject, String projects, String active,
            String archived) {
        String actualAddNewProjectText = RealEstateProjectsPage.addNewProjectElement.getText();
        String actualProjectsText = RealEstateProjectsPage.projectsPageElement.getText();
        String actualActiveText = RealEstateProjectsPage.activeRadialButton.getText();
        String actualArchivedText = RealEstateProjectsPage.archivedRadialButton.getText();
        CommonUtils.assertEquals(actualAddNewProjectText, addNewProject);
        CommonUtils.assertEquals(actualProjectsText, projects);
        CommonUtils.assertEquals(actualActiveText, active);
        CommonUtils.assertEquals(actualArchivedText, archived);
        CommonUtils.nonMobileScreenshots();
    }
}
