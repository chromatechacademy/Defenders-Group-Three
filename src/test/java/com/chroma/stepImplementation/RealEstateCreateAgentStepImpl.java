package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

public class RealEstateCreateAgentStepImpl extends PageInitializer {

    public static void adminLogsIn(String email, String password) {
        RealEstateLoginPage.emailTextbox.sendKeys(email);
        RealEstateLoginPage.passwordTextbox.sendKeys(password);
        JavascriptUtils.clickByJS(RealEstateLoginPage.loginButton);
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    public static void verifyingUniqueAgent(String firstName, String lastName, String phoneNumber,
            String email, String password) throws InterruptedException {
        CommonUtils.waitForClickability(realEstateAgentsPage.agentButton);
        realEstateAgentsPage.agentButton.click();
        realEstateAgentsPage.addNowButton.click();
        realEstateAgentsPage.firstName.sendKeys(firstName);
        realEstateAgentsPage.lastName.sendKeys(lastName);
        realEstateAgentsPage.contactNumber.sendKeys(phoneNumber);
        realEstateAgentsPage.email.sendKeys(email);
        realEstateAgentsPage.password.sendKeys(password);
        realEstateAgentsPage.retypePassword.sendKeys(password);
        realEstateAgentsPage.saveButton.click();
        CommonUtils.sleep(2000);
        realEstateAgentsPage.backButton.click();
        WebDriverUtils.driver.navigate().refresh();
        CommonUtils.nonMobileScreenshots();
    }

    public static void agentEmail(String expectedAgentEmail) {
        String actualAgentEmail = realEstateAgentsPage.activeEmail.getText();
        CommonUtils.assertEquals(expectedAgentEmail, actualAgentEmail);
        JavascriptUtils.scrollIntoView(realEstateAgentsPage.activeEmail);
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    public static void adminlogsOut() {
        realEstateAgentsPage.accountButton.click();
        realEstateAgentsPage.logoutButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    public static void userLogsIn(String email, String password) {
        RealEstateLoginPage.emailTextbox.sendKeys(email);
        RealEstateLoginPage.passwordTextbox.sendKeys(password);
        RealEstateLoginPage.loginButton.click();
        CommonUtils.sleep(2000);
    }

    public static void agentHomePageAssertion(String expectedHelloName) {
        String actualHeaderText = realEstateAgentsPage.greetingPage.getText();
        CommonUtils.assertEquals(expectedHelloName, actualHeaderText);
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }
}
