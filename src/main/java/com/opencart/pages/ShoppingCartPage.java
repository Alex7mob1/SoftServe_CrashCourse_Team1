package com.opencart.pages;

import com.opencart.pages.containers.ShoppingCartProductContainer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.concurrent.TimeUnit;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//*[@method]//*[@type='text']")
    private WebElement editQuantityProducts;

    @FindBy(xpath = "//*[@method]//*[@type='submit']")
    private WebElement updateButton;

    @FindBy(xpath = "//*[@method]//*[@data-original-title='Remove']")
    private WebElement removeButton;

    @FindBy(xpath = "//*[starts-with(text(),' Success: You have modified your shopping cart!')]")
    private WebElement verifyEditQuantity;

    @FindBy(xpath = "//*[@class='buttons clearfix']//*[contains(@href, 'checkout')]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@class='breadcrumb']//*[text()='Shopping Cart']")
    private WebElement verifyShoppingCartLocation;

    @FindBy(xpath = "//*[@class='pull-left']//*[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    public WebElement getEditQuantityProducts() {
        return editQuantityProducts;
    }

    public WebElement getUpdateButton() {
        return updateButton;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getVerifyEditQuantity() {
        return verifyEditQuantity;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getVerifyShoppingCartLocation() {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));

        wait.pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> verifyShoppingCartLocation.isDisplayed());
        return verifyShoppingCartLocation;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public ShoppingCartProductContainer getShoppingCartProducts() {
        return new ShoppingCartProductContainer();
    }
}