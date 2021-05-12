package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    @FindBy(xpath = "//*[text()='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = ".//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement itemsButton;

    @FindBy(xpath = "//*[text()='test']")
    private WebElement checkText;

    public WebElement getAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton;
    }

    public WebElement getItemsButton() {
        return itemsButton;
    }

    public WebElement getCheckText() {
        return checkText;
    }
}
