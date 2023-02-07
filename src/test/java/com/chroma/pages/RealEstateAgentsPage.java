package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentsPage {

    /* Agents Button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentButton;

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

    /* Back Button */
    @FindBy(xpath = "//div[@role='dialog']//div//div//form//div//button[@type='button']")
    public WebElement backButton;

    /* Active Members list */
    @FindBy(xpath = " //a[normalize-space()='Active']")
    public WebElement activeMember;

    /* Verifying Email */
    @FindBy(xpath = "//td[normalize-space()='majd6u4e@gmailw.com']")
    public WebElement activeEmail;

    /* Account button */
    @FindBy(xpath = "//span[normalize-space()='account_box']")
    public WebElement accountButton;

    /* Log out button */
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logoutButton;

    /* Greeting Page */
    @FindBy(xpath = "//h1[normalize-space()='Hello, Name123']")
    public WebElement greetingPage;

    public RealEstateAgentsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
