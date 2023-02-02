package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentAdmissionsPage {

    /* STUDENT ADMISSION HEADER */
    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionHeader;

    /* STUDENT ADMISSION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextbox;

    /* CLASS DROPDOWN */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /* SECTION DROPDOWN */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

     /* FIRST NAME TEXTBOX */
     @FindBy(xpath = "//input[@id='firstname']")
     public WebElement firsNameTextBox;
 
     /* LAST NAME TEXTBOX */
     @FindBy(xpath = "//input[@id='lastname']")
     public WebElement lastNameTextBox;

     @FindBy(xpath = "//select[@name='gender']")
     public WebElement genderDropDown;

    /* DATE OF BIRTH CALENDAR */
     @FindBy(xpath = "//input[@id='dob']")
     public WebElement dateOfBirthCalendar;

    /* MOTHERS NAME TEXT BOX */
     @FindBy(xpath = "//input[@id='mother_name']")
     public WebElement mothersNameTextBox;

     @FindBy(xpath = "//label[normalize-space()='Mother']")
     public WebElement motherRadioButton;

     /* SAVE BUTTON */
     @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
     public WebElement saveButton;

     /* GUARDIAN PHONE NUMBER TEXTBOX */
     @FindBy(xpath = "//input[@id='guardian_phone']")
     public WebElement guardianPhoneNumberTextBox;

     /* SUCCESSFULLY SAVED MESSAGE  */
     @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
     public WebElement successfullySavedMessage;

     public StudentAdmissionsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
