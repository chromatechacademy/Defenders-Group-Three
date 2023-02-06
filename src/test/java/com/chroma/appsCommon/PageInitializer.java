package com.chroma.appsCommon;

import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.NewProjectPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    // Sample of instantiating an instance
    public static SamplePage samplePage;
    public static DashboardPage dashboardPage;
    public static IncomeModulePage incomeModulePage;
    public static LoginPage loginPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static AgentModulePage agentModulePage;
    public static NewProjectPage newProjectPage;
   
    public void initializeAllPages() {
        samplePage = new SamplePage();
        dashboardPage = new DashboardPage();
        incomeModulePage = new IncomeModulePage();
        loginPage = new LoginPage();
        studentAdmissionPage = new StudentAdmissionPage();
        agentModulePage = new AgentModulePage();
        newProjectPage = new NewProjectPage();
    }
}