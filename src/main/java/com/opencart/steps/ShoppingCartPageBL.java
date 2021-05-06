package com.opencart.steps;

import com.opencart.pages.ShoppingCartPage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartPageBL {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageBL() {
        shoppingCartPage = new ShoppingCartPage();
    }

    public ShoppingCartPageBL editQuantityProducts(int quantity) {

        inputEditQuantity(quantity);

        clickOnUpdateButton();

        return this;
    }

    public void inputEditQuantity(int editQuantity) {

        shoppingCartPage.getEditQuantityProducts().clear();
        shoppingCartPage.getEditQuantityProducts().sendKeys(String.valueOf(editQuantity));

    }

    public void clickOnUpdateButton() {
        shoppingCartPage.getUpdateButton().click();
    }

    public EmptyShoppingCartPageBL clickOnRemoveWithOneProductButton() {
        shoppingCartPage.getRemoveButton().click();
        return new EmptyShoppingCartPageBL();
    }

    public ShoppingCartPageBL clickOnRemoveWithFewProductsButton() {
        shoppingCartPage.getRemoveButton().click();

        return this;
    }

    public String verifyPrice(String productName){
            return shoppingCartPage.getShoppingCartProducts().getTotalPrice(productName).getText();
    }

    public HomePageBL clickOnContinueShoppingButton(){
        shoppingCartPage.getContinueShoppingButton().click();
        return new HomePageBL();
    }

    public void clickOnCheckoutButton() {
        shoppingCartPage.getCheckoutButton().click();
    }

    public void verifyEditQuantity() {
        String expectedMessage = "Success: You have modified your shopping cart!";
        assertThat(shoppingCartPage.getVerifyEditQuantity().getText(), CoreMatchers.startsWith(expectedMessage));
    }

    public void verifyShoppingCartLocation() {
        String expectedMassage = "Shopping Cart";
        assertThat(shoppingCartPage.getVerifyShoppingCartLocation().getText(),CoreMatchers.startsWith(expectedMassage));
    }
}