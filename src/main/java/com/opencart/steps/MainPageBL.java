package com.opencart.steps;

import com.opencart.pages.MainPage;

public class MainPageBL {
    private MainPage mainPage;
    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }
    public MainPageBL(){mainPage = new MainPage();}

    public MainPageBL checkTaxEnablingOnOpencart(){

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

    private void checkEnabling(){
        mainPage.getCheckText();
    }
}
