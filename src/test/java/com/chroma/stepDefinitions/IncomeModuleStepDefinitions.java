package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepImplementation.IncomeModuleStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinitions extends PageInitializer {

    @When("clicks on Income Module")
    public void clicks_on_Income_Module() throws InterruptedException {
        IncomeModuleStepImpl.incomeModuleHeader();
    }

    @Then("Sub Modules {string}, {string}, and {string} display")
    public void sub_Modules_and_display(String expectedAddIncomeText, String expectedSearchIncomeText,
            String expectedIncomeHeadText) {
        IncomeModuleStepImpl.assertionSubmodulesText(expectedAddIncomeText, expectedSearchIncomeText,
                expectedIncomeHeadText);
    }
}
