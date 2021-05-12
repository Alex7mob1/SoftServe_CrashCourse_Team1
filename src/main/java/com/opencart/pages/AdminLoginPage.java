package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminLoginPage extends BasePage{
    @FindBy(name = "username")
    private WebElement adminName;

    @FindBy(name = "password")
    private WebElement adminPassword;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement admitButton;

    public WebElement getAdmitButton() {
        return admitButton;
    }

    public WebElement getAdminNameInput() {
        wait.until(ExpectedConditions.visibilityOf(adminName));
        return adminName;
    }

    public WebElement getAdminPasswordInput() {
        return adminPassword;
    }
}
