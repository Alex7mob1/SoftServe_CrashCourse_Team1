package com.opencart.pages.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartProductContainer extends BasePage {

    public ShoppingCartProductContainer() {
    }

    public WebElement getTotalPrice(String productName) {
        return driver.findElement(By.xpath(String.format("//*[@class='table table-bordered']//*[text()='%s']/ancestor::tr//*[@class='text-right'][last()]", productName)));
    }

}
