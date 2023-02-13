package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class AgentModuleTextStepImpl extends PageInitializer {

    public static void loggingIn(String email, String password) {
        agentModulePage.emailTextBox.sendKeys(email);
        agentModulePage.passwordTextBox.sendKeys(password);
        CommonUtils.sleep(300);
        JavascriptUtils.clickByJS(agentModulePage.loginButton);
    }

    public static void assertionAgentModuleText(String membersList, String active, String inactive, String allAgents,
            String addNow, String name, String mail, String contactNumber, String actions) {
        String actualActiveText = agentModulePage.activeText.getText();
        CommonUtils.assertEquals(actualActiveText, active);
        String actualInactiveText = agentModulePage.inactiveText.getText();
        CommonUtils.assertEquals(actualInactiveText, inactive);
        String actualAllAgentsText = agentModulePage.allAgentsText.getText();
        CommonUtils.assertEquals(actualAllAgentsText, allAgents);
        String actualAddNowText = agentModulePage.addNowText.getText();
        CommonUtils.assertEquals(actualAddNowText, addNow);
        String actualNameText = agentModulePage.nameText.getText();
        CommonUtils.assertTrue(actualNameText.equalsIgnoreCase(name));
        String actualMailText = agentModulePage.mailText.getText();
        CommonUtils.assertTrue(actualMailText.equalsIgnoreCase(mail));
        String actualContactNumber = agentModulePage.contactNumberText.getText();
        CommonUtils.assertTrue(actualContactNumber.equalsIgnoreCase(contactNumber));
        String actualActionsText = agentModulePage.actionsText.getText();
        CommonUtils.assertTrue(actualActionsText.equalsIgnoreCase(actions));
        CommonUtils.nonMobileScreenshots();
    }
}