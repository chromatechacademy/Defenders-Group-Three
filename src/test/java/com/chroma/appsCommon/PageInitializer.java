package com.chroma.appsCommon;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.HomeworkPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance

    public static SamplePage samplePage;
    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static HomeworkPage homeworkPage;

    public void initializeAllPages() {

        samplePage = new SamplePage();
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        homeworkPage = new HomeworkPage();
    }

}
