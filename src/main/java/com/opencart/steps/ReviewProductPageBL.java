package com.opencart.steps;

import com.opencart.pages.ReviewProductPage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class ReviewProductPageBL {

    private ReviewProductPage reviewProductPage;

    public ReviewProductPageBL() {
        reviewProductPage = new ReviewProductPage();
    }

    public ReviewProductPageBL setQuantityAddToCart(int quantity) {

        inputQuantity(quantity);
        clickOnAddToCartButton();
        return this;
    }

    public void inputQuantity(int quantity) {
        reviewProductPage.getQuantityProducts().clear();
        reviewProductPage.getQuantityProducts().sendKeys(String.valueOf(quantity));
    }

    public void clickOnAddToCartButton() {
        reviewProductPage.getAddToCartButton().click();
    }

    public void verifyAddToCart(String product) {
        String expectedMessage = "Success: You have added " + product + " to your shopping cart!";
        assertThat(reviewProductPage.getSuccessAddToCartTextField().getText(), CoreMatchers.startsWith(expectedMessage));
    }
}