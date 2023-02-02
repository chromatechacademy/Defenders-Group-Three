package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    
    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public static WebElement studentInformationModule;
}
