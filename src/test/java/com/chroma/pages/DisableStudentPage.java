package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DisableStudentPage {

    /* Student Information Module */
     @FindBy(xpath = "//span[contains(text(), 'Student Information')]")
     public static WebElement studentInformationModule;

    /* Student Details SubModule */
    @FindBy(xpath = " (//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

     /* Class Dropdown */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /* Section Dropdown */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    /* Search Button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

     /* Student Name */
     @FindBy(xpath = "(//a[contains(text(),'Yuliana Kuziv')])[1]")
     public WebElement studentName;

     /* Red thumbs down icon */
     @FindBy(xpath = "//a[@class='text-red']")
     public WebElement redThumbsDownIcon;

     public DisableStudentPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);

   
    } 
}
