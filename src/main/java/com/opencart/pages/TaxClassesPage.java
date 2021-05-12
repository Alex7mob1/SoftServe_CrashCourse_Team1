package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

//*[@name='tax_rule[0][tax_rate_id]']/*[text()='my_tax']
public class TaxClassesPage extends BasePage{

    @FindBy(xpath = "//a[contains(@href,'class_id=9')]")
    private WebElement editButton;

    public WebElement getEditButton() {
        wait.until(ExpectedConditions.visibilityOf(editButton));
        return editButton;
    }
}
