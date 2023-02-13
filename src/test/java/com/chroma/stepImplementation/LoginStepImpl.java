package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class LoginStepImpl extends PageInitializer {

    public static void navigateToLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    public static void loggingIn(String username, String password)
            throws InterruptedException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        loginPage.signInButton.click();
        Thread.sleep(2000);
    }

    public static void assertionDashboardPage(String url) {
        String actualHomePage = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(actualHomePage, url);
        CommonUtils.nonMobileScreenshots();
    }
}
