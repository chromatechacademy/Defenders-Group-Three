package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage {

    /* DASHBOARD PAGE ELEMENT */
    @FindBy(xpath = "//a[@type='button']")
    public static WebElement dashboardPageElement;
    /* HELLO ADMIN TEXT */
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public static WebElement helloAdminText;
    /* OVERVIEW PAGE ELEMENT */
    @FindBy(xpath = "//a[normalize-space()='Overview']")
    public static WebElement overviewPageElement;
    /* AGENTS GRAPH PAGE ELEMENT */
    @FindBy(xpath = "//a[normalize-space()='Agents Graph']")
    public static WebElement agentsGraphPageElement;
    /* PROPERTIES OVERVIEW TEXT */
    @FindBy(xpath = "//h5[@class='fs-28 my-4']")
    public static WebElement propertiesOverviewText;
    /* PROPERTIES TEXT */
    @FindBy(xpath = "//h6[@class='fs-18 fw-semibold']")
    public static WebElement propertiesText;
    /* AGENTS TAB PAGE ELEMENT */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public static WebElement agentsTab;
    /* DASHBOARD TAB PAGE ELEMENT */
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public static WebElement dashboardTab;
    /* PROJECTS TAB PAGE ELEMENT */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public static WebElement projectsTab;

    
        public RealEstateDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
     }
}
