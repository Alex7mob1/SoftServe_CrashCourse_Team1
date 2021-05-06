package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyShoppingCartPage extends BasePage {
    @FindBy(xpath = "//*[@class='col-sm-12']//*[contains(text(),'Your shopping cart is empty!')]")
    private WebElement verifyEmptyPage;

    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    private WebElement emptyPageContinueButton;

    @FindBy(xpath = "//*[@id='cart-total']")
    private WebElement verifyEmptyBlackWindow;

    public WebElement getVerifyEmptyPage() {
        return verifyEmptyPage;
    }

    public WebElement getEmptyPageContinueButton() {
        return emptyPageContinueButton;
    }

    public WebElement getVerifyEmptyBlackWindow() {
        return verifyEmptyBlackWindow;
    }

}
