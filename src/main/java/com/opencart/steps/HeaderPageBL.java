package com.opencart.steps;

import com.opencart.pages.panels.HeaderPanel;

public class HeaderPageBL {

    private HeaderPanel headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPanel();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public HeaderPageBL clickOnCurrencyButton() {
        headerPage.getCurrencyButton().click();
        return this;
    }

    public HeaderPageBL clickOnPoundCurrencyButton() {
        headerPage.getPoundCurrencyButton().click();
        return this;
    }

    public ExamplePageBL clickOnExamplePage(){
        headerPage.getTestProductButton().click();
        return new ExamplePageBL();
    }
}
