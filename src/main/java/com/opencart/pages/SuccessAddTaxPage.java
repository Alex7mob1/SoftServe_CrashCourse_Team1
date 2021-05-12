package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAddTaxPage extends BasePage{

    @FindBy(xpath = "//*[@class='close']")
    private WebElement successMark;

    public WebElement getSuccessMark() {
        return successMark;
    }
}
