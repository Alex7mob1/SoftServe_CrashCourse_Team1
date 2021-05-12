package com.opencart.steps;

import com.opencart.pages.EditTaxPage;
import com.opencart.pages.SuccessAddTaxPage;
import org.testng.Assert;

public class EditTaxPageBL {
    private EditTaxPage editTaxPage;
    private SuccessAddTaxPage successAddTaxPage;

    public EditTaxPageBL(){editTaxPage = new EditTaxPage();}

    public EditTaxPageBL testTaxEnable(){

    clickOnSelectButton();
    clickOnSubmitButton();

    successAddTaxPage = new SuccessAddTaxPage();

    return this;

    }

    private void clickOnSelectButton() {
        editTaxPage.getSelectButton().click();
    }

    private void clickOnSubmitButton() {
        editTaxPage.getSaveButton().click();
    }

    public void verifyEnabling() {
        String expectedMessage = "×";
        Assert.assertEquals(successAddTaxPage.getSuccessMark().getText(), expectedMessage, "Incorrect page title");
    }
}
