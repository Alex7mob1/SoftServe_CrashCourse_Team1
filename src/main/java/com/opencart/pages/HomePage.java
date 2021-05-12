package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[text()='Featured']")
    private WebElement verifyHomePageLocation;

    public WebElement getVerifyHomePageLocation() {
        return verifyHomePageLocation;
    }
}