package com.opencart.steps;

import com.opencart.pages.MainPage;

public class MainPageBL {
    private MainPage mainPage;


    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPanelBL getHeaderPanelBL() {
        return new HeaderPanelBL();
    }

    public MainPageBL checkTaxEnablingOnOpencart() {

        clickOnAddToCartButton();
        clickOnItemsButton();
        checkEnabling();

        return this;
    }

    private void clickOnAddToCartButton() {
        mainPage.getAddToCartButton();
    }

    private void clickOnItemsButton() {
        mainPage.getItemsButton();
    }

    private void checkEnabling() {
        mainPage.getCheckText();
    }

    public MenuPanelBL getMenuPanelBL() {
        return new MenuPanelBL();
    }

    public SearchPanelBL getSearchPanelBL() {
        return new SearchPanelBL();
    }
}