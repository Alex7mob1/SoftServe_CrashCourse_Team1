package com.opencart.pages;

import com.opencart.pages.panels.HeaderPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends HeaderPanel {
    @FindBy(xpath = ".//*[contains(@href, 'edit')]")
    private WebElement editAccountButton;

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }

    @FindBy(xpath = ".//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    @FindBy(xpath = ".//*[contains(@href, 'account')]")
    private WebElement accountTab;

    public WebElement getAccountTab() {
        return accountTab;
    }


}


