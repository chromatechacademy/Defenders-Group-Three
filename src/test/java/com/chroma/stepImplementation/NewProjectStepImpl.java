package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class NewProjectStepImpl extends PageInitializer {

    public static void confirmationMessageAssertion(String confirmationMsg) {
        String actualConfirmationMessage = newProjectPage.confirmationMessage.getText();
        CommonUtils.assertEquals(actualConfirmationMessage, confirmationMsg);
        CommonUtils.nonMobileScreenshots();
    }
}
