package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = "//*[@class='pull-left']//a[contains(@href,'account')]")
    private WebElement backButton;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement continueButton;

    @FindBy(xpath = ".//div[@class='text-danger']")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[contains(@class, 'text-danger') and text()='Last Name must be between 1 and 32 characters!']")
    private WebElement warningMessage;

    @FindBy(xpath = "//div[contains(@class, 'text-danger') and text()='E-Mail Address does not appear to be valid!']")
    private WebElement cautionMessage;

    @FindBy(xpath = "//div[contains(@class, 'text-danger') and text()='Telephone must be between 3 and 32 characters!']")
    private WebElement dangerMessage;

    @FindBy(xpath = ".//div[@class='alert alert-danger alert-dismissible']")
    private WebElement notificationMessage;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getCautionMessage() {
        return cautionMessage;
    }

    public WebElement getDangerMessage() {
        return dangerMessage;
    }

    public WebElement getNotificationMessage() {
        return notificationMessage;
    }
}

