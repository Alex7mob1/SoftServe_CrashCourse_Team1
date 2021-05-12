package com.opencart.steps;

import com.opencart.pages.panels.SearchPanel;

public class SearchPanelBL {

    private SearchPanel searchPanel;

    public SearchPanelBL() {
        searchPanel = new SearchPanel();
    }

    public SearchPageBL searchProduct(String productName) {
        inputProductName(productName);
        clickOnSearchButton();
        return new SearchPageBL();
    }

    public void inputProductName(String productName) {
        searchPanel.getSearchBox().clear();
        searchPanel.getSearchBox().sendKeys((productName));
    }

    public void clickOnSearchButton() {
        searchPanel.getSearchButton().click();
    }
}