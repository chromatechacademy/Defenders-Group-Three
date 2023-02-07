package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AddMultipleStudentsPage {
    
    /* ADMISSION NUMBER */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    /* FIRST NAME TEXTBOX */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    /* GENDER DROPDOWN MENU */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDownMenu;

    /* CLASS DROPDOWN MENU */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDownMenu;

    /* SECTION DROPDOWN MENU */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDownMenu;

    /* GUARDIAN RADIO BUTTON */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianRadioButton;

    /* GUARDIAN NAME TEXTBOX */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianName;

    /* GUARDIAN PHONE NUMBER TEXTBOX */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhone;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    public AddMultipleStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
