package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateAgentsPage {

    /* Agents Button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsButton;

    /* All Agents Text */
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement allAgentsText;

    /* Add Now Button */
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNowButton;

    /* First Name */
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstName;

    /* Last Name */
    @FindBy(xpath = "//input[@name='lname']")
    public WebElement lastName;

    /* Email */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    /*Contact Number */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactNumber;

    /*Password */
    @FindBy(xpath = " //input[@name='pass']")
    public WebElement password;

    /*ReType Password */
    @FindBy(xpath = "//input[@name='cpass']")
    public WebElement retypePassword;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    
    public RealEstateAgentsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
