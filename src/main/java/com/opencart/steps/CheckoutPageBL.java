package com.opencart.steps;

import com.opencart.pages.CheckoutPage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutPageBL {
    private CheckoutPage checkoutPage;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public void verifyCheckoutPageLocation() {
        String expectedMassage = "Checkout";
        assertThat(checkoutPage.getVerifyCheckoutLocation().getText(), CoreMatchers.startsWith(expectedMassage));
    }
}