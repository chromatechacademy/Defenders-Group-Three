package com.chroma.appsCommon;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance

    public static SamplePage samplePage;

    public void initializeAllPages() {

        samplePage = new SamplePage();

    }
    
    public static LoginPage loginPage;

    public static void initializePages() {
        
        loginPage = new LoginPage();
    }

    
}
