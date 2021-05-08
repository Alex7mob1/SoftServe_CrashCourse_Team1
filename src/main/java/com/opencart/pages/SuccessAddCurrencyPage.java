package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessAddCurrencyPage extends BasePage{

    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    private WebElement successModifyTitle;

    public WebElement getSuccessModifyTitle() {
        wait.until(ExpectedConditions.visibilityOf(successModifyTitle));
        return successModifyTitle;
    }
}
