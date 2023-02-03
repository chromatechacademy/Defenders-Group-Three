package com.chroma.stepDefinitions;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @When("clicks on Income Module")
    public void clicks_on_Income_Module() throws InterruptedException {
        dashboardPage.incomeModule.click();
        Thread.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("Sub Modules {string}, {string}, and {string} display")
    public void sub_Modules_and_display(String expectedAddIncomeText, String expectedSearchIncomeText, String expectedIncomeHeadText) throws InterruptedException {

        String actualAddIncomeText = dashboardPage.addIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedAddIncomeText, actualAddIncomeText);

        String actualSearchIncomeText = dashboardPage.searchIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedSearchIncomeText, actualSearchIncomeText);

        String actualIncomeHeadText = dashboardPage.incomeHeadSubModule.getText();
        CommonUtils.assertEquals(expectedIncomeHeadText, actualIncomeHeadText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

}
