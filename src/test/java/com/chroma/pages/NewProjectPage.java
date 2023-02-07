package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class NewProjectPage {

    /* PROJECTS MODULE */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectsModule;

    /* ADD NEW PROJECT BUTTON */
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg sidebar-cta']")
    public WebElement addNewProjectButton;

    /* TITLE TEXT BOX */
    @FindBy(xpath = "//input[@name='Title']")
    public WebElement titleTextBox;

    /* STREET NUMBER */
    @FindBy(xpath = "//input[@name='Street_Number']")
    public WebElement streetNumberTextBox;

    /* STREET NAME */
    @FindBy(xpath = "//input[@name='Street_Name']")
    public WebElement streetNameTextBox;

    /* SUBURB TEXT BOX */
    @FindBy(xpath = "//input[@name='Suburb']")
    public WebElement suburbTextBox;

    /* NEXT BUTTON */
    @FindBy(xpath = "//button[@id='nextbutton']")
    public WebElement nextButton;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;

    /* CONFIRMATION MESSAGE */
    @FindBy(xpath = "//div[normalize-space()='New Project has been added!']")
    public WebElement confirmationMessage;
    
    public NewProjectPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}