package com.opencart.pages.panels;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPanel extends BasePage {

    @FindBy(xpath = "//*[@id='menu']//*[text()='Desktops']")
    private WebElement desktopsMenuButton;

    @FindBy(xpath = "//*[@id='menu']//*[@class='dropdown open']//*[contains(text(),'Mac')]")
    private WebElement macMenuButton;

    @FindBy(xpath = "//*[@id='menu']//*[text()='Components']")
    private WebElement componentsMenuButton;

    @FindBy(xpath = "//*[@class='dropdown-inner']//*[contains(text(),'Monitors')]")
    private WebElement monitorsMenuButton;

    public WebElement getDesktopsMenuButton() {
        return desktopsMenuButton;
    }

    public WebElement getMacMenuButton() {
        return macMenuButton;
    }

    public WebElement getComponentsMenuButton() {
        return componentsMenuButton;
    }

    public WebElement getMonitorsMenuButton() {
        return monitorsMenuButton;
    }

}