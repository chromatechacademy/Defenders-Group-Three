package com.chroma.pages;

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

    /* collect fees submodule */
    @FindBy(linkText = "Collect Fees")
    public static WebElement collectFeesSubmodule;

    /* search fees payment submodule */
    @FindBy(partialLinkText = "Search Fees Payme")
    public static WebElement searchFeesPaymentSubmodule;

    /* search due fees submodule */
    @FindBy(partialLinkText = "Search Due Fe")
    public static WebElement searchDueFeesSubmodule;

    /* fees master submodule */
    @FindBy(partialLinkText = "Fees Mast")
    public static WebElement feesMasterSubmodule;

    /* fees group submodule */
    @FindBy(partialLinkText = "Fees Gro")
    public static WebElement feesGroupSubmodule;

    /* fees type submodule */
    @FindBy(partialLinkText = "Fees Ty")
    public static WebElement feesTypeSubmodule;

    /* fees discount submodule */
    @FindBy(partialLinkText = "Fees Discou")
    public static WebElement feesDiscountSubmodule;

    /* fees carry forward submodule */
    @FindBy(partialLinkText = "Fees Carry Forwa")
    public static WebElement feesCarryForwardSubmodule;

    /* fees reminder submodule */
    @FindBy(partialLinkText = "Fees Remind")
    public static WebElement feesReminderSubmodule;

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
