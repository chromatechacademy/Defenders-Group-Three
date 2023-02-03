package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentInformationPage {

    /*
     * Student Information Page
     */

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

    public StudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }
}
