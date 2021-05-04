package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href, 'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@class='btn btn-link dropdown-toggle']")
    private WebElement currencyButton;

    @FindBy(name = "GBR")
    private WebElement poundCurrencyButton;

    @FindBy(xpath = ".//*[@title='MacBook']")
    private WebElement testProductButton;

    public WebElement getTestProductButton() {
        wait.until(ExpectedConditions.visibilityOf(testProductButton));
        return testProductButton;
    }

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getCurrencyButton() {
        wait.until(ExpectedConditions.visibilityOf(currencyButton));
        return currencyButton;
    }

    public WebElement getPoundCurrencyButton() {
        return poundCurrencyButton;
    }

}
