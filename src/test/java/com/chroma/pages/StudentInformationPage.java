package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentInformationPage {

    /* STUDENT DETAILS MODULE */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public static WebElement studentDetailsModule;

    /* STUDENT ADMISSION MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public static WebElement studentAdmissionModule;

    /* DISABLED STUDENTS */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public static WebElement disabledStudentsModule;

    /* BULK DELETE */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public static WebElement bulkDeleteModule;

    /* STUDENT CATEGORIES MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public static WebElement studentCategoriesModule;

    /* STUDENT HOUSE MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public static WebElement studentHouseModule;

    /* DISABLE REASON MODULE */
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public static WebElement disableReasonModule;

    /*
     * Student Info side bar
     */
    @FindBy(xpath = "//a[contains(.,'Student Information')]")
    public WebElement studentInfoLink;

    /*
     * Student Category Module
     */
    @FindBy(xpath = "//a[contains(.,'Student Categories')]")
    public WebElement studentCategoryLink;

    @FindBy(className = "box-title")
    public WebElement categoryTitle;

    @FindBy(id = "category")
    public WebElement categoryNameInput;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'Record Saved Successfully')]")
    public WebElement recordSavedMessage;

    @FindBy(xpath = "//*[contains(text(),'Record Delete Successfully')]")
    public WebElement recordDeletedMessage;

    // Category delete button
    public WebElement getCateoryDeleteButton(String categoryName) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//*[contains(text(),'" + categoryName + "')]/parent::tr//a[@title='Delete']"));
    }

    //

    /*
     * Student Admission Module
     */
    @FindBy(xpath = "//a[contains(.,'Student Admission')]")
    public WebElement studentAdmissionLink;

    @FindBy(xpath = "//h4[@class='pagetitleh-whitebg']")
    public WebElement studentAdmissionHeader;

    @FindBy(id = "admission_no")
    public WebElement admissionNumInput;

    @FindBy(id = "class_id")
    public WebElement classIdSelect;

    @FindBy(id = "section_id")
    public WebElement sectionIdSelect;

    @FindBy(id = "firstname")
    public WebElement firstnameInput;

    @FindBy(name = "gender")
    public WebElement genderSelect;

    @FindBy(id = "dob")
    public WebElement dobInput;// 01/01/1996

    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianFatherRadioButon;

    @FindBy(id = "guardian_name")
    public WebElement guardianNameInput;

    @FindBy(id = "guardian_phone")
    public WebElement guardianPhoneInput;

    // Recorded message
    public WebElement getErrorMessage(String msg) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + msg + "')]"));
    }

    public StudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
