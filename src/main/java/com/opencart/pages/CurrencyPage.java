package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CurrencyPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href,'currency/add')]")
    private WebElement addNewCurrencyButton;

    @FindBy(xpath = "//a[contains(@href,'currency_id=1')]")
    private WebElement editButton;

    public WebElement getEditButton() {
        wait.until(ExpectedConditions.visibilityOf(editButton));
        return editButton;
    }
    public WebElement getAddNewCurrency() {
        wait.until(ExpectedConditions.visibilityOf(addNewCurrencyButton));
        return addNewCurrencyButton;
    }
}
