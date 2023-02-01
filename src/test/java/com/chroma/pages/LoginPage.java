package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class LoginPage {

    /* USERNAME TEXTBOX */
<<<<<<< HEAD
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    /* PASSWORD TEXTBOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* SIGN IN BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /* INVALID USERNAME OR PASSWORD ALERT */
    @FindBy(xpath = "//div[normalize-space()='Invalid Username or Password']")
    public WebElement invalidLoginAlert;

=======
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;

    /* PASSWORD TEXTBOX */
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextBox;

    /* SIGNIN BUTTON */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

>>>>>>> 53ac2995dc315ed5f3ad94b889abc62055777d70
    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

<<<<<<< HEAD
}
=======


    
}
>>>>>>> 53ac2995dc315ed5f3ad94b889abc62055777d70
