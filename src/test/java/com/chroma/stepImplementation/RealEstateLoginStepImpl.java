package com.chroma.stepImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

public class RealEstateLoginStepImpl extends PageInitializer {
    
    public static void logginIn(String email, String password) {
        RealEstateLoginPage.emailTextbox.sendKeys(email);
        RealEstateLoginPage.passwordTextbox.sendKeys(password);
        JavascriptUtils.scrollIntoView(RealEstateLoginPage.loginButton);
        CommonUtils.sleep(2000);
        RealEstateLoginPage.loginButton.click();
    }

    public static void dashboardPageAssertion(String expectedRealEstateDashboardUrl) {
        CommonUtils.sleep(3000);
        String actualRealEstateDashboardUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(actualRealEstateDashboardUrl, expectedRealEstateDashboardUrl);
        CommonUtils.nonMobileScreenshots();
    }
}
