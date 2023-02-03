package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class HomeworkPage {

     /* HOMEWORK PAGE */
     @FindBy(xpath = "//span[normalize-space()='Homework']")
     public static WebElement homeworkPage;
 
     public HomeworkPage() {
         PageFactory.initElements(WebDriverUtils.driver, this);
}
}
