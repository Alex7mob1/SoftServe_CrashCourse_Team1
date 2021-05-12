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
}