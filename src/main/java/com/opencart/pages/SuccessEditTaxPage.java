package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessEditTaxPage extends BasePage {
    @FindBy(xpath = "//*[@class='close']")
    private WebElement successMark;

    public WebElement getSuccessMark() {
        wait.until(ExpectedConditions.visibilityOf(successMark));
        return successMark;
    }
}
