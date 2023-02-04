package com.chroma.appsCommon;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    // Sample of instantiating an instance
    public static SamplePage samplePage;
    public static DashboardPage dashboardPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static IncomeModulePage incomeModulePage;
    public static StudentAdmissionPage studentAdmissionPage;

    public void initializeAllPages() {
        samplePage = new SamplePage();
        dashboardPage = new DashboardPage();
        realEstateLoginPage = new RealEstateLoginPage();
        incomeModulePage = new IncomeModulePage();
        studentAdmissionPage = new StudentAdmissionPage();

    }
}

   
