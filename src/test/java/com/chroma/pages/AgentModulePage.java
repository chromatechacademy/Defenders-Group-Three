package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AgentModulePage {

    /* EMAIL TEXTBOX */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailTextBox;

    /* PASSWORD TEXTBOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* LOGIN BUTTON */
    @FindBy(xpath = "//button[@type='submit'][1]")
    public WebElement loginButton;

    /* AGENTS PAGE */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsPage;

    /* MEMBER BUTTON */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement memberButton;

    /* ACTIVE TEXT */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeText;

    /* INACTIVE TEXT */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveText;

    /* ALL AGENTS TEXT */
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement allAgentsText;

    /* AGENTS TEXT */
    @FindBy(xpath = "//a[normalize-space()='Agents']")
    public WebElement AgentsText;

    /* NAME TEXT */
    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement nameText;

    /* MAIL TEXT */
    @FindBy(xpath = "//th[normalize-space()='Mail']")
    public WebElement mailText;

    /* CONTACT NUMBER */
    @FindBy(xpath = "//th[normalize-space()='Contact Number']")
    public WebElement contactNumberText;

    /* ADD NOW TEXT*/
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNowText;

    /* ACTIONS TEXT */
    @FindBy(xpath = "//th[@class='text-end']")
    public WebElement actionsText;

    public AgentModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}