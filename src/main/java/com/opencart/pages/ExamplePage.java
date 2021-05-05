package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamplePage extends BasePage{
    @FindBy(xpath = "//*[text()='£14,448.00']")
    private WebElement actualResult;

    public WebElement getActualResult() {
        return actualResult;
    }
}
