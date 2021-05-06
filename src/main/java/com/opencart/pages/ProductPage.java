package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[@id='product-category']//*[@title='iMac']")
    private WebElement iMacIconButton;

    @FindBy(xpath = "//*[@alt='Samsung SyncMaster 941BW']")
    private WebElement samsungSyncMasterIconButton;

    public WebElement getIMacButton() {
        return iMacIconButton;
    }

    public WebElement getSamsungSyncMasterIconButton() {
        return samsungSyncMasterIconButton;
    }
}