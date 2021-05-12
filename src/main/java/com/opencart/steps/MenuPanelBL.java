package com.opencart.steps;

import com.opencart.pages.panels.MenuPanel;

public class MenuPanelBL {

    private MenuPanel homePage;

    public MenuPanelBL() {
        homePage = new MenuPanel();
    }

    public MenuPanelBL clickOnDesktopsMenuButton() {
        homePage.getDesktopsMenuButton().click();
        return this;
    }

    public ProductPageBL clickOnMacMenuButton() {
        homePage.getMacMenuButton().click();
        return new ProductPageBL();
    }

    public MenuPanelBL clickOnComponentsMenuButton(){
        homePage.getComponentsMenuButton().click();
        return this;
    }

    public ProductPageBL clickOnMonitorsMenuButton(){
        homePage.getMonitorsMenuButton().click();
        return new ProductPageBL();
    }
}