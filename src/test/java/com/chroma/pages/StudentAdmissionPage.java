package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage extends PageInitializer {

    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* STUDENT ADMISSSION SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubmodule;

    /* STUDENT ADMISSION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextBox;

    /* FIRST NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    /* CLASS DROPDOWN */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropdown;

    /* SECTION DROPDOWN */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement  sectionDropDown;

    /* GENDER OPTION */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;
    
    /* DOB */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement DOBTextBox;

    /* MOTHER RADIO BUTTON */
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherRadioButton;

    /* GUARDIAN NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    /* GUARDIAN PHONE NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement phoneNumberTextBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* CONFIRMATION MESSAGE */
    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public WebElement confirmationMessage;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
