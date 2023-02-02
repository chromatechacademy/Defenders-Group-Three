package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardPage {
    
    /* INCOME MODULE HEADER */ 
    @FindBy(xpath= "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    /* ADD INCOME SUBMODULE TEXT */
    @FindBy(xpath = "//a[contains(text(),'Add Income')]")
    public WebElement addIncomeSubModule; 

    /* SEARCH INCOME SUBMODULE TEXT */
    @FindBy(xpath = "//a[contains(text(),'Search Income')]")
    public WebElement searchIncomeSubModule;

    /* INCOME HEAD SUBMODULE TEXT */
    @FindBy(xpath = "//a[contains(text(),'Income Head')]")
    public WebElement incomeHeadSubModule;


    
    
    
    
    
    
    
    
    public DashboardPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
