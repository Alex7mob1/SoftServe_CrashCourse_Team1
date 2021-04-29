package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends HeaderPage {
    @FindBy(xpath = ".//*[contains(@href, 'edit')]")
    private WebElement editAccountButton;

    public WebElement getEditAccountButton() throws InterruptedException {
        Thread.sleep(5000);
        return editAccountButton;
    }

    @FindBy(xpath = ".//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }
    @FindBy(xpath = ".//*[contains(@href, 'account')]")
    private WebElement accountTab;

    public WebElement getAccountTab() throws InterruptedException {
        Thread.sleep(5000);
        return accountTab;
    }


    }


