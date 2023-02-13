package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class AddingMultipleStudentsStepImpl extends PageInitializer {

    public static void saveButton() {
        addMultipleStudentsPage.saveButton.click();
        CommonUtils.nonMobileScreenshots();
    }
}