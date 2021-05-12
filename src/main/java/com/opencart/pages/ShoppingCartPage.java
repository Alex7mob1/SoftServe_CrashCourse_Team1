package com.opencart.pages;

import com.opencart.pages.containers.ShoppingCartProductContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

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

    @FindBy(xpath = "//*[@class='pull-left']//*[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@class='table-responsive']//tbody/tr")
    private List<WebElement> shoppingCartProductList;

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
        return driver.findElement(By.xpath("//*[@class='breadcrumb']//*[text()='Shopping Cart']"));
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public List<ShoppingCartProductContainer> getShoppingCartProducts() {
        return shoppingCartProductList.stream()
                .map(ShoppingCartProductContainer::new)
                .collect(Collectors.toList());
    }
}