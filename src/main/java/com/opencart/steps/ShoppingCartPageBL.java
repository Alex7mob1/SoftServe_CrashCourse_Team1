package com.opencart.steps;

import com.opencart.pages.ShoppingCartPage;
import com.opencart.pages.containers.ShoppingCartProductContainer;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.StaleElementReferenceException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertTrue;

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

    public String verifyPrice(String productName) {
        ShoppingCartProductContainer shoppingCartProductContainer = shoppingCartPage.getShoppingCartProducts()
                .stream()
                .filter(e -> e.getProductName().getText().equals(productName))
                .findFirst()
                .get();

        return shoppingCartProductContainer.getTotalPrice().getText();
    }

    public HomePageBL clickOnContinueShoppingButton() {
        shoppingCartPage.getContinueShoppingButton().click();
        return new HomePageBL();
    }

    public CheckoutPageBL clickOnCheckoutButton() {
        shoppingCartPage.getCheckoutButton().click();
        return new CheckoutPageBL();
    }

    public void verifyEditQuantity() {
        String expectedMessage = "Success: You have modified your shopping cart!";
        assertThat(shoppingCartPage.getVerifyEditQuantity().getText(), CoreMatchers.startsWith(expectedMessage));
    }

    public void verifyShoppingCartLocation() {
        String expectedMassage = "Shopping Cart";
        try {
            assertTrue(shoppingCartPage.getVerifyShoppingCartLocation().getText().contains(expectedMassage));
        }catch (StaleElementReferenceException e){
            assertTrue(shoppingCartPage.getVerifyShoppingCartLocation().getText().contains(expectedMassage));
        }
    }
}