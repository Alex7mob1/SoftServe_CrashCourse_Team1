package com.opencart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.concurrent.TimeUnit;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[@class='breadcrumb']//*[text()='Checkout']")
    private WebElement verifyCheckoutLocation;

    public WebElement getVerifyCheckoutLocation() {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));

        wait.pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> verifyCheckoutLocation.isDisplayed());
        return verifyCheckoutLocation;
    }
}