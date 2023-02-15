package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.HomeworkPage;
import com.chroma.web.CommonUtils;

public class HomeworkModuleStepImpl extends PageInitializer {

    public static void homeworkDropdown() {
        HomeworkPage.homeworkPageModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    public static void assertionFollowingModules(String addHomework) {
        String actualAddHomeworkText = HomeworkPage.addHomeworkModule.getText();
        CommonUtils.assertEquals(addHomework, actualAddHomeworkText);
        CommonUtils.nonMobileScreenshots();
    }
}
