package com.opencart.pages.panels;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPanel extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href, 'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//*[@class='btn btn-link dropdown-toggle']")
    private WebElement currencyButton;

    @FindBy(name = "GBR")
    private WebElement poundCurrencyButton;

    @FindBy(xpath = ".//*[@title='MacBook']")
    private WebElement testProductButton;

    @FindBy(xpath = ".//*[contains(@href, 'login')]")
    private WebElement loginButton;

    @FindBy(xpath = ".//*[contains(@href, 'logout')]")
    private WebElement logoutButton;

    public WebElement getTestProductButton() {
        wait.until(ExpectedConditions.visibilityOf(testProductButton));
        return testProductButton;
    }

    public WebElement getCurrencyButton() {
        wait.until(ExpectedConditions.visibilityOf(currencyButton));
        return currencyButton;
    }

    public WebElement getPoundCurrencyButton() {
        return poundCurrencyButton;
    }

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }
    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

}
