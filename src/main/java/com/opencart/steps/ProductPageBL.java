package com.opencart.steps;

import com.opencart.pages.ProductPage;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public ReviewProductPageBL clickOnIMacIcon() {
        productPage.getIMacButton().click();
        return new ReviewProductPageBL();
    }

    public ReviewProductPageBL clickOnSamsungSyncMasterIcon() {
        productPage.getSamsungSyncMasterIconButton().click();
        return new ReviewProductPageBL();
    }
}