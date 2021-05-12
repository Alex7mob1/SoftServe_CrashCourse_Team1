package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCurrencyPage extends BasePage{

    @FindBy(name = "code")
    private WebElement codeInput;

    @FindBy(name = "value")
    private WebElement valueInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement saveButton;

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getValueInput() {
        return valueInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}
