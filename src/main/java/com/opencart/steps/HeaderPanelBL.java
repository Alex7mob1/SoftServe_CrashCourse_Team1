package com.opencart.steps;

import com.opencart.pages.panels.HeaderPanel;

public class HeaderPanelBL {

    private HeaderPanel headerPanel;

    public HeaderPanelBL() {
        headerPanel = new HeaderPanel();
    }

    public HeaderPanelBL clickOnMyAccountButton() {
        headerPanel.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPanel.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public ShoppingCartPageBL clickOnShoppingCartButton() {
        headerPanel.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }
    public HeaderPanelBL clickOnCurrencyButton() {
        headerPanel.getCurrencyButton().click();
        return new HeaderPanelBL();
    }

    public HeaderPanelBL clickOnPoundCurrencyButton() {
        headerPanel.getPoundCurrencyButton().click();
        return new HeaderPanelBL();
    }

    public ExamplePageBL clickOnExamplePage(){
        headerPanel.getTestProductButton().click();
        return new ExamplePageBL();
    }
    public LoginPageBL clickOnLoginButton() {
        headerPanel.getLoginButton().click();
        return new LoginPageBL();
    }

    public void clickOnLogoutButton() {
        headerPanel.getLogoutButton().click();
    }
}