package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AgentsPage {

    @FindBy(xpath = "//a[@href='agents.php']")
    public WebElement agentsHyperlink;

    @FindBy(xpath = "//button[contains(text(), 'Add Now')]")
    public WebElement addNowButton;

    @FindBy(name = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(name = "lastname")
    public WebElement lastNameTextBox;

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(name = "phone")
    public WebElement phoneTextBox;

    @FindBy(name = "pass")
    public WebElement passwordTextBox;

    @FindBy(name = "cpass")
    public WebElement retypePasswordTextBox;

    @FindBy(id = "addagentbutton")
    public WebElement addAgentSavebutton;

    @FindBy(className = "btn-close")
    public WebElement closeModelButton;

    @FindBy(xpath = "//a[contains(text(), 'Agents Graph')]")
    public WebElement agentsGraphHyperlink;

    @FindBy(xpath = "//a[contains(text(), 'Overview')]")
    public WebElement overviewGraphHyperlink;

    @FindBy(xpath = "//div[@class='content']//h5")
    public WebElement graphHeader;

    public WebElement getElement(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[contains(.,'" + text + "')]"));
    }

    public WebElement getMenuButton(String fullname) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//td[contains(.,'" + fullname + "')]/following-sibling::td//button"));
    }

    public WebElement getMenuDeleteButton(String fullname) {
        return WebDriverUtils.driver.findElement(By.xpath(
                "//td[contains(.,'" + fullname + "')]/following-sibling::td//button[contains(text(),'Delete')]"));
    }

    public AgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
