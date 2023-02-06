package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage {

    /* student details submodule */
    @FindBy(linkText = "Student Details")
    public WebElement studentDetailsSubmodule;

    /* class dropdown */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropdown;

    /* class and section search button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    /* edit button for first student */
    @FindBy(xpath = "(//a[@class='btn btn-default btn-xs'])[2]")
    public WebElement editButton;

    /* blood group dropdown */
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropdown;

    /* save edits button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveEditsButton;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
