package com.chroma.appsCommon;

import com.chroma.pages.AdminLoginPage;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.AgentsPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.ExpensePage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    // Sample of instantiating an instance
    public static SamplePage samplePage;
    public static DashboardPage dashboardPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static IncomeModulePage incomeModulePage;
    public static LoginPage loginPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static AgentModulePage agentModulePage;
    public static AgentsPage agentPage;
    public static AdminLoginPage adminLoginPage;
    public static StudentInformationPage studentInfoPage;
    public static ExpensePage expensePage;

    public void initializeAllPages() {
        samplePage = new SamplePage();
        dashboardPage = new DashboardPage();
        realEstateLoginPage = new RealEstateLoginPage();
        incomeModulePage = new IncomeModulePage();
        loginPage = new LoginPage();
        studentAdmissionPage = new StudentAdmissionPage();
        agentModulePage = new AgentModulePage();
        agentPage = new AgentsPage();
        adminLoginPage = new AdminLoginPage();
        studentInfoPage = new StudentInformationPage();
        expensePage = new ExpensePage();
    }
}

   
