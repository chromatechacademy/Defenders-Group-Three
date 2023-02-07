package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpenseStepDefinition extends PageInitializer {


    /****
     * Add Expense step definitions
     */

    @Then("the user clicks on Expense module")
    public void the_user_clicks_on_module() {
        CommonUtils.waitForClickability(expensePage.expensesLink);
        CommonUtils.click(expensePage.expensesLink);
    }

    @Then("user selects Add Expense")
    public void user_selects_add_expense() {
        CommonUtils.waitForClickability(expensePage.addExpensesLink);
        CommonUtils.click(expensePage.addExpensesLink);
    }

    @Then("user is directed to the expense category page {string}")
    public void user_is_directed_to_category_page(String expectedTitle) {
        //Add Expense
        CommonUtils.waitForVisibility(expensePage.categoryTitle);
        String actualTitle = CommonUtils.getText(expensePage.categoryTitle);
        CommonUtils.assertEquals(expectedTitle, actualTitle);
    }

    @When("user selects expense head {string}")
    public void user_selects_expense_head(String expenseHeadtext) {
        CommonUtils.waitForVisibility(expensePage.expenseHeadSelect);
        CommonUtils.selectDropDownValue(expenseHeadtext, expensePage.expenseHeadSelect);
    }

    @When("user enters name {string}")
    public void user_enters_name(String name) {
        CommonUtils.waitForVisibility(expensePage.expenseNameInput);
        CommonUtils.sendKeys(expensePage.expenseNameInput, name);
    }

    @When("user enters amount {int}")
    public void user_enters_amount(int amount) {
        CommonUtils.waitForVisibility(expensePage.expenseAmountInput);
        CommonUtils.sendKeys(expensePage.expenseAmountInput, amount+"");     
    }

    @Then("Click save and confirmation message displays {string}")
    public void click_save_and_confirmation_message_displays(String expectedMessage) {
        CommonUtils.waitForVisibility(expensePage.saveButton);
        CommonUtils.click(expensePage.saveButton);
        CommonUtils.waitForVisibility(expensePage.recordSavedMessage);
        String actualMessage = CommonUtils.getText(expensePage.recordSavedMessage);
        CommonUtils.assertEquals(expectedMessage, actualMessage);
    }


    /****
     * Search Expense step definitions
     */

    @Then("user selects Search Expense")
    public void user_selects_search_expense() {
        CommonUtils.waitForVisibility(expensePage.searchExpensesLink);
        CommonUtils.click(expensePage.searchExpensesLink);
    }

    @When("user selects Search Type {string}")
    public void user_selects_search_type(String searchType) {
        CommonUtils.waitForVisibility(expensePage.expenseSearchTypeSelect);
        CommonUtils.selectDropDownValue(searchType, expensePage.expenseSearchTypeSelect);
    }

    @When("user enters search {string}")
    public void user_enters_search(String searchText) {
        CommonUtils.waitForVisibility(expensePage.expenseSearchInput);
        CommonUtils.sendKeys(expensePage.expenseSearchInput, searchText);                
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        CommonUtils.waitForVisibility(expensePage.expenseSearchButton);
        CommonUtils.click(expensePage.expenseSearchButton);                   
    }

    @Then("Search result displays {string}")
    public void search_result_displays(String expectedSearchResultText) {
        CommonUtils.waitForVisibility(expensePage.firstSearchResult);
        String actualSearchResultText = CommonUtils.getText(expensePage.firstSearchResult);
        CommonUtils.assertEquals(expectedSearchResultText, actualSearchResultText);
    }


    /**
     * Expense Head
     */

    @Then("user selects Expense head")
    public void user_selects_expense_head() {
        CommonUtils.waitForVisibility(expensePage.expenseHeadLink);
        CommonUtils.click(expensePage.expenseHeadLink);     
    }

    @When("user selects {string}")
    public void user_selects(String expenseHeadInputText) {
        CommonUtils.waitForVisibility(expensePage.expenseHeadInput);
        // CommonUtils.waitForClickability(expensePage.expenseHeadInput);
        CommonUtils.sendKeys(expensePage.expenseHeadInput, expenseHeadInputText);           
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        CommonUtils.click(expensePage.saveButton);        
    }

    @Then("Message displays {string}")
    public void message_displays(String expectedMessage) {
        String actualMessage = CommonUtils.getText(expensePage.recordSavedMessage);
        CommonUtils.assertEquals(expectedMessage, actualMessage);
    }
}
