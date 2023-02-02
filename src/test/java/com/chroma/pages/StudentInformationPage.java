package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentInformationPage {
    
    /*
     * Student Information Page 
     */

     /* STUDENT DETAILS MODULE */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']") 
    public WebElement studentDetailsModule;

    /* STUDENT ADMISSION MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionModule;

    /* DISABLED STUDENTS */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentsModule;

    /* BULK DELETE */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteModule;

    /* STUDENT CATEGORIES MODULE */
    @FindBy(xpath = "//span[contains(text(),'Human Resource')]")
    public WebElement studentCategoriesModule;

    /* STUDENT HOUSE MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouseModule;

    /* DISABLE REASON MODULE */
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReasonModule;


}
