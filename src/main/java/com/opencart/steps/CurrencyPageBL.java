package com.opencart.steps;

import com.opencart.pages.CurrencyPage;
import com.opencart.pages.EditCurrencyPage;

import java.util.Currency;

public class CurrencyPageBL {
    private CurrencyPage currencyPage;

    public CurrencyPageBL(){currencyPage = new CurrencyPage();}


    public AddCurrencyPageBL clickOnAddNewCurrencyButton() {
        currencyPage.getAddNewCurrency().click();
        return new AddCurrencyPageBL();
    }

    public EditCurrencyPageBL clickOnEditButton(){
        currencyPage.getEditButton().click();
        return new EditCurrencyPageBL();
    }

}
