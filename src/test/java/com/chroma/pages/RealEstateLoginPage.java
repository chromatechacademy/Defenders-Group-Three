package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateLoginPage {

    /* email textbox */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement emailTextbox;

    /* password textbox */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement passwordTextbox;

    /* login button */
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public static WebElement loginButton;

    public RealEstateLoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
