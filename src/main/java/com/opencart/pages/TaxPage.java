package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TaxPage extends BasePage{
    @FindBy(xpath = "//a[contains(@href,'tax_rate/add')]")
    private WebElement addNewTaxButton;

    public WebElement getAddNewTaxButton() {
        wait.until(ExpectedConditions.visibilityOf(addNewTaxButton));
        return addNewTaxButton;
    }
}
