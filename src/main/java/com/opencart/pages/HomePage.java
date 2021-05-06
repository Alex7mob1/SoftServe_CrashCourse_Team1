package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']")
    private WebElement verifyHomePage;

    public WebElement getVerifyHomePage() {
        return verifyHomePage;
    }

}
