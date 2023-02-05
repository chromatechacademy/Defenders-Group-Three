package com.chroma.appsCommon;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.DisableStudentPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    // Sample of instantiating an instance
    public static DashboardPage dashboardPage;
    public static IncomeModulePage incomeModulePage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static DisableStudentPage disableStudentPage;
   
    public void initializeAllPages() {
        dashboardPage = new DashboardPage();
        incomeModulePage = new IncomeModulePage();
        studentAdmissionPage = new StudentAdmissionPage();
        disableStudentPage = new DisableStudentPage();
    }
}

   
