package com.opencart.pages.panels;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPanel extends BasePage {

    @FindBy(xpath = "//*[@class='form-control input-lg']")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@class='input-group-btn']")
    private WebElement searchButton;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
