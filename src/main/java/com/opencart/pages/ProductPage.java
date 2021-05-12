package com.opencart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[@id='product-category']//*[@title='iMac']")
    private WebElement iMacIconButton;

    @FindBy(xpath = "//*[@alt='Samsung SyncMaster 941BW']")
    private WebElement samsungSyncMasterIconButton;

    public WebElement getIMacButton() {
        return iMacIconButton;
    }

    public WebElement getSamsungSyncMasterIconButton() {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));

        wait.pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> samsungSyncMasterIconButton.isDisplayed());
        return samsungSyncMasterIconButton;
    }
}