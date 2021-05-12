package com.opencart.steps;

import com.opencart.datamodel.AddCurrencyModel;
import com.opencart.pages.EditCurrencyPage;
import com.opencart.pages.SuccessEditPage;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.EditCurrencyModelRepository;
import org.testng.Assert;

public class EditCurrencyPageBL {
    private EditCurrencyPage editCurrencyPage;
    private SuccessEditPage successEditPage;
    public  EditCurrencyPageBL(){
        editCurrencyPage = new EditCurrencyPage();
    }

    public EditCurrencyPageBL editCurrency(){
        AddCurrencyModel addCurrencyModel = EditCurrencyModelRepository.getEditCurrencyModel();

        inputCode(addCurrencyModel.getCode());
        inputValue(addCurrencyModel.getCount());

        clickSave();
        successEditPage = new SuccessEditPage();

        return this;

    }

    private void inputCode(String code) {
        editCurrencyPage.getCodeInput().clear();
        editCurrencyPage.getCodeInput().sendKeys(code);
    }

    private void inputValue(String value) {
        editCurrencyPage.getValueInput().clear();
        editCurrencyPage.getValueInput().sendKeys(value);
    }

    private void clickSave() {
        editCurrencyPage.getSaveButton().click();
    }

    public void verifySuccessEditing() {
        String expectedMessage = "Success: You have modified currencies!\n" + "×";
        Assert.assertEquals(successEditPage.getSuccessEditTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyInccorectExpectedMessageEditing() {
        String expectedMessage = "Incorrect message";
        Assert.assertNotEquals(successEditPage.getSuccessEditTitle().getText(), expectedMessage, "Incorrect page title");
    }
}
