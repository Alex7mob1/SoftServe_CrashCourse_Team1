package com.opencart.steps;

import com.opencart.pages.SearchPage;

public class SearchPageBL {

    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public ReviewProductPageBL clickOnIconInSearchPage() {
        searchPage.getProductIcon().click();
        return new ReviewProductPageBL();
    }
}