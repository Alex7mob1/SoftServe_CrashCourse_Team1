package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessEditPage extends BasePage{

    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    private WebElement successEditTitle;

    public WebElement getSuccessEditTitle() {
        wait.until(ExpectedConditions.visibilityOf(successEditTitle));
        return successEditTitle;
    }
}
