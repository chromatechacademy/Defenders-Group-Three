package com.chroma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardPage {

    /* Student info module */
    @FindBy(xpath = "//span[contains(text(), 'Student Information')]")
    public static WebElement studentInformationModule;

    /* fees collection module */
    @FindBy(xpath = "//span[contains(text(), 'Fees Collection')]")
    public static WebElement feesCollectionModule;

    /* income module */
    @FindBy(xpath = "//span[contains(text(), 'Income')]")
    public static WebElement incomeModule;

    /* expenses module */
    @FindBy(xpath = "//span[contains(text(), 'Expenses')]")
    public static WebElement expensesModule;

    /* academics module */
    @FindBy(xpath = "//span[contains(text(), 'Academics')]")
    public static WebElement academicsModule;

    /* HR module */
    @FindBy(xpath = "//span[contains(text(), 'Human Resource')]")
    public static WebElement humanResourceModule;

    /* hw module */
    @FindBy(xpath = "//span[contains(text(), 'Homework')]")
    public static WebElement homeworkModule;

    /* reports module */
    @FindBy(xpath = "//span[contains(text(), 'Reports')]")
    public static WebElement reportsModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
