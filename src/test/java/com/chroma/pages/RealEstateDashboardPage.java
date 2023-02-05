package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage {
    
     /* DASHBOARD PAGE ELEMENT */
     @FindBy(xpath = "//a[@type='button']")
     public static WebElement dashboardPageElement;


 
 
     public RealEstateDashboardPage() {
         PageFactory.initElements(WebDriverUtils.driver, this);
     }
}
