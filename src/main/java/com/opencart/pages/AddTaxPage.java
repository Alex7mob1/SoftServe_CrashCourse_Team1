package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddTaxPage extends BasePage{

    @FindBy(id = "input-name")
    private WebElement nameInput;

    @FindBy(id = "input-rate")
    private WebElement rateInput;

    @FindBy(id = "input-type")
    private WebElement typeButton;

    @FindBy(xpath="//*[@value = 'F']")
    private WebElement fixedButton;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getNameInput() {
        wait.until(ExpectedConditions.visibilityOf(nameInput));
        return nameInput;
    }

    public WebElement getRateInput() {
        return rateInput;
    }

    public WebElement getTypeButton() {
        return typeButton;
    }

    public WebElement getFixedButton() {
        return fixedButton;
    }
}
