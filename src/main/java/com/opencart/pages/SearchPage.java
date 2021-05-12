package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//*[@class='img-responsive']")
    private WebElement productIcon;

    public WebElement getProductIcon() {
        return productIcon;
    }
}