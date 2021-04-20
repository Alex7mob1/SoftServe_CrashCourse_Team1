package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CurrencyPage extends BasePage {
    @FindBy(xpath = ".//*[@data-original-title='Add New']")
    private WebElement addNewCurrencyButton;

    @FindBy(xpath = "//*[@id='form-currency']/div/table/tbody/tr[3]/td[6]/a")
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
