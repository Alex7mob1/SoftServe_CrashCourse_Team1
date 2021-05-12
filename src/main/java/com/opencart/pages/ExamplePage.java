package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExamplePage extends BasePage{
    @FindBy(xpath = "//*[text()='£14,544.00']")
    private WebElement actualResult;

    public WebElement getActualResult() {
        return actualResult;
    }
}
