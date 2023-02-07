package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

public class AdminLoginPage {

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(name = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButton;


    /**
     * Login to admin site using valid email and password
     */
    public void login(String email, String pwd) {
        CommonUtils.sendKeys(emailTextBox, email);
        CommonUtils.sendKeys(passwordTextBox, pwd);
        CommonUtils.waitForClickability(loginButton);
        JavascriptUtils.clickByJS(loginButton);
        CommonUtils.acceptAlert();
    }

    public AdminLoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
