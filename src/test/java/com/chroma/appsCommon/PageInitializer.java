package com.chroma.appsCommon;

import com.chroma.pages.AddMultipleStudentsPage;
import com.chroma.pages.AgentModulePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.DisableStudentPage;
import com.chroma.pages.HomeworkPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateAgentsPage;
import com.chroma.pages.NewProjectPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    // Sample of instantiating an instance
    public static DashboardPage dashboardPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static IncomeModulePage incomeModulePage;
    public static LoginPage loginPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static DisableStudentPage disableStudentPage;
    public static AddMultipleStudentsPage addMultipleStudentsPage;
    public static AgentModulePage agentModulePage;
    public static RealEstateAgentsPage realEstateAgentsPage;
    public static StudentDetailsPage studentDetailsPage;
    public static NewProjectPage newProjectPage;
    public static HomeworkPage homeworkPage;

    public void initializeAllPages() {
        dashboardPage = new DashboardPage();
        realEstateLoginPage = new RealEstateLoginPage();
        incomeModulePage = new IncomeModulePage();
        loginPage = new LoginPage();
        studentAdmissionPage = new StudentAdmissionPage();
        disableStudentPage = new DisableStudentPage();
        addMultipleStudentsPage = new AddMultipleStudentsPage();
        agentModulePage = new AgentModulePage();
        realEstateAgentsPage = new RealEstateAgentsPage();
        studentDetailsPage = new StudentDetailsPage();
        newProjectPage = new NewProjectPage();
        homeworkPage = new HomeworkPage();
    }
}