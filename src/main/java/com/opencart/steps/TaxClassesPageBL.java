package com.opencart.steps;

import com.opencart.pages.TaxClassesPage;

public class TaxClassesPageBL {
    private TaxClassesPage taxClassesPage;

    public TaxClassesPageBL(){taxClassesPage = new TaxClassesPage();}

    public EditTaxPageBL clickOnEditTaxButton() {

        taxClassesPage.getEditButton().click();

        return new EditTaxPageBL();
    }
}
