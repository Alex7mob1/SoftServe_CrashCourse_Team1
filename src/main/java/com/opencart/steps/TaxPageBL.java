package com.opencart.steps;

import com.opencart.pages.AddTaxPage;
import com.opencart.pages.TaxPage;

public class TaxPageBL {
    private TaxPage taxPage;

    public TaxPageBL(){ taxPage = new TaxPage(); }

    public AddTaxPageBL clickOnAddTaxButton(){
        taxPage.getAddNewTaxButton().click();
        return new AddTaxPageBL();
    }
}
