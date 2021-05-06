package com.opencart.steps;

import com.opencart.pages.EmptyShoppingCartPage;
import com.opencart.pages.HomePage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class EmptyShoppingCartPageBL {

    private EmptyShoppingCartPage emptyShoppingCartPage;
    private HomePage homePage;

    public EmptyShoppingCartPageBL() {
        emptyShoppingCartPage = new EmptyShoppingCartPage();
    }

    public EmptyShoppingCartPageBL verifyEmptyPageAndContinueButton() {

        verifyEmptyPage();
        verifyEmptyBlackWindow();
        clickOnEmptyPageContinueButton();
        homePage = new HomePage();
        return this;
    }

    public void verifyEmptyPage() {
        String expectedMessage = "Your shopping cart is empty!";
        assertThat(emptyShoppingCartPage.getVerifyEmptyPage().getText(), CoreMatchers.startsWith(expectedMessage));
    }

    public void verifyEmptyBlackWindow() {
        String expectedMessage = "0 item(s) - $0.00";
        assertThat(emptyShoppingCartPage.getVerifyEmptyBlackWindow().getText(), CoreMatchers.startsWith(expectedMessage));
    }

    public void clickOnEmptyPageContinueButton() {
        emptyShoppingCartPage.getEmptyPageContinueButton().click();
    }
}
