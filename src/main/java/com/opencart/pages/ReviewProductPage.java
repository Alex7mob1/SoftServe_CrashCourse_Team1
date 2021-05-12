package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReviewProductPage extends BasePage {

    @FindBy(xpath = "//*[@name='quantity']")
    private WebElement quantityProducts;

    @FindBy(xpath = "//*[@id='button-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'Success: You have added')]")
    private WebElement successAddToCartTextField;

    public WebElement getQuantityProducts() {
        return quantityProducts;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getSuccessAddToCartTextField() {
        wait.until(ExpectedConditions.visibilityOf(successAddToCartTextField));
        return successAddToCartTextField;
    }
}