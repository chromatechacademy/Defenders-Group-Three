package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class ExpensePage {



    public ExpensePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*
     * Expense Category and sub category - Side bar
     */

    @FindBy(xpath = "//a[contains(.,'Expenses')]")
    public WebElement expensesLink;
    
    @FindBy(xpath = "//*[@class='sidebar-menu verttop']//a[contains(.,'Add Expense')]")
    public WebElement addExpensesLink;
    
    @FindBy(xpath = "//*[@class='sidebar']//a[contains(.,'Search Expense')]")
    public WebElement searchExpensesLink;
    
    @FindBy(xpath = "//*[@class='sidebar']//a[contains(.,'Expense Head')]")
    public WebElement expenseHeadLink;



    /*
     * Add Expense Module
     */

    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement categoryTitle;
    
    @FindBy(id = "exp_head_id")
    public WebElement expenseHeadSelect;
    
    @FindBy(name = "name")
    public WebElement expenseNameInput;
    
    @FindBy(id = "amount")
    public WebElement expenseAmountInput;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Record Saved Successfully')]")
    public WebElement recordSavedMessage; 



    /**
     * Search Expense Module
     */
    
    @FindBy(name = "search_type")
    public WebElement expenseSearchTypeSelect;
    
    @FindBy(xpath = "//*[@placeholder='Search by Expense']")
    public WebElement expenseSearchInput;

    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement expenseSearchButton;

    @FindBy(xpath = "//tbody/tr/td")
    public WebElement firstSearchResult;



    /*
     * Expense head Module
     */
    
    @FindBy(id = "expensehead")
    public WebElement expenseHeadInput;


    
    

}
