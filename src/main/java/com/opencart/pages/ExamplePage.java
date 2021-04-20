package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamplePage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/div/div[2]/ul[2]/li[1]/h2")
    private WebElement actualResult;

    public WebElement getActualResult() {

        return actualResult;
    }
}
