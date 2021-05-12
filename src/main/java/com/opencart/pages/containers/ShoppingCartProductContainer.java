package com.opencart.pages.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartProductContainer extends BasePage {

    private WebElement element;

    public ShoppingCartProductContainer(WebElement element) {
        this.element = element;
    }

    public WebElement getTotalPrice() {
        return element.findElement(By.xpath(".//*[@class='text-right'][last()]"));
    }

    public WebElement getProductName() {
        return element.findElement(By.xpath(".//*[@class= 'text-left']//*[contains(@href,'product')]"));
    }
}