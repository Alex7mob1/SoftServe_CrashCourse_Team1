package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddCurrencyPage extends BasePage{

    @FindBy(id = "input-title")
    private WebElement titleInput;

    @FindBy(id = "input-code")
    private WebElement codeInput;

    @FindBy(id = "input-symbol-left")
    private WebElement symbolLeftInput;

    @FindBy(id = "input-symbol-right")
    private WebElement symbolRightInput;

    @FindBy(id = "input-decimal-place")
    private WebElement decimalInput;

    @FindBy(id = "input-value")
    private WebElement valueInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement submitButton;

    public WebElement getTitleInput() {
        wait.until(ExpectedConditions.visibilityOf(titleInput));
        return titleInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getSymbolLeftInput() {
        return symbolLeftInput;
    }

    public WebElement getSymbolRightInput() {
        return symbolRightInput;
    }

    public WebElement getDecimalInput() {
        return decimalInput;
    }

    public WebElement getValueInput() {
        return valueInput;
    }
}
