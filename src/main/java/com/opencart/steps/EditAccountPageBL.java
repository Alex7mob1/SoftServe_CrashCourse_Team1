package com.opencart.steps;

import com.opencart.datamodel.EditAccountModel;
import com.opencart.pages.EditAccountPage;
import com.opencart.pages.MyAccountPage;
import com.opencart.repository.EditAccountModelRepository;
import org.testng.Assert;

public class EditAccountPageBL {
    private EditAccountPage editAccountPage;
    private MyAccountPage myAccountPage;

    public EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editInformation() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());

        clickOnContinueButton();

        myAccountPage = new MyAccountPage();
        return this;
    }
    public EditAccountPageBL cancelEditInformation() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());

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

    public void emptyFirstName(){
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(editAccountPage.getErrorMessage().getText(), expectedMessage);
    }
    public void invalidLastName(){
        String expectedMessage = "Last Name must be between 1 and 32 characters!";
        Assert.assertEquals(editAccountPage.getWarningMessage().getText(), expectedMessage);
    }
    public void incorrectEmail(){
        String expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(editAccountPage.getCautionMessage().getText(), expectedMessage);
    }
    public void lackOfTelephoneCharacters(){
        String expectedMessage = "Telephone must be between 3 and 32 characters!";
        Assert.assertEquals(editAccountPage.getDangerMessage().getText(), expectedMessage);
    }
    public void redirectToPreviousPage() throws InterruptedException {
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(myAccountPage.getAccountTab().isDisplayed())));
    }

    public void verifyUpdates() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessMessage().getText(), expectedMessage, "Edit account failed");
    }

}
