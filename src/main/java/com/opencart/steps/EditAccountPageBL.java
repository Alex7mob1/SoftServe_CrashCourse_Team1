package com.opencart.steps;


import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.EditAccountPage;
import com.opencart.pages.MyAccountPage;
import com.opencart.repository.RegisterModelRepository;
import org.testng.Assert;


public class EditAccountPageBL {
    private EditAccountPage editAccountPage;
    private MyAccountPage myAccountPage;

    public EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editInformation() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());


        clickOnContinueButton();

        myAccountPage = new MyAccountPage();
        return this;
    }

    public EditAccountPageBL inputInvalidInformation(String firstName, String lastName, String invalidEmail, String telephone) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(invalidEmail);
        inputTelephone(telephone);

        clickOnContinueButton();

        editAccountPage = new EditAccountPage();
        return this;
    }

    public EditAccountPageBL inputAlreadyRegisteredEmail(String duplicateEmail) {
        inputEmail(duplicateEmail);

        clickOnContinueButton();

        editAccountPage = new EditAccountPage();
        return this;
    }

    public EditAccountPageBL cancelEditInformation() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());

        clickOnBackButton();

        myAccountPage = new MyAccountPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        editAccountPage.getFirstNameInput().clear();
        editAccountPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editAccountPage.getLastNameInput().clear();
        editAccountPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editAccountPage.getEmailInput().clear();
        editAccountPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editAccountPage.getTelephoneInput().clear();
        editAccountPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnBackButton() {
        editAccountPage.getBackButton().click();
    }

    public void clickOnContinueButton() {
        editAccountPage.getContinueButton().click();
    }

    public void checkFirstName() {
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(editAccountPage.getErrorMessage().getText(), expectedMessage);
    }

    public void checkLastName() {
        String expectedMessage = "Last Name must be between 1 and 32 characters!";
        Assert.assertEquals(editAccountPage.getWarningMessage().getText(), expectedMessage);
    }

    public void checkEmail() {
        String expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(editAccountPage.getCautionMessage().getText(), expectedMessage);
    }

    public void checkTelephoneCharacters() {
        String expectedMessage = "Telephone must be between 3 and 32 characters!";
        Assert.assertEquals(editAccountPage.getDangerMessage().getText(), expectedMessage);
    }

    public void checkDuplicateEmail() {
        String expectedMessage = "Warning: E-Mail address is already registered!";
        Assert.assertEquals(editAccountPage.getNotificationMessage().getText(), expectedMessage);
    }

    public void checkRedirectToPreviousPage() {
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(myAccountPage.getAccountTab().isDisplayed())));
    }

    public void verifyUpdates() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessMessage().getText(), expectedMessage, "Edit account failed");
    }


}
