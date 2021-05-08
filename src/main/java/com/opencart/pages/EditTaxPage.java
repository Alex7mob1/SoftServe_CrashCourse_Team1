package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditTaxPage extends BasePage{

    @FindBy(xpath = "//*[@name='tax_rule[0][tax_rate_id]']/*[text()='my_tax']")
    private WebElement selectButton;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement saveButton;

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSelectButton() {
        wait.until(ExpectedConditions.visibilityOf(selectButton));
        return selectButton;
    }
}
