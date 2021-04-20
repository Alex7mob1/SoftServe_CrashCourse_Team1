package com.opencart.steps;

import com.opencart.datamodel.AddCurrencyModel;
import com.opencart.pages.AddCurrencyPage;
import com.opencart.pages.SuccessAddCurrencyPage;
import com.opencart.repository.AddCurrencyModelRepository;
import org.testng.Assert;

public class AddCurrencyPageBL {

    private AddCurrencyPage addCurrencyPage;
    private SuccessAddCurrencyPage successAddCurrencyPage;

    public AddCurrencyPageBL(){addCurrencyPage = new AddCurrencyPage(); }

    public AddCurrencyPageBL AddNewCurrency() {

        AddCurrencyModel addCurrencyModel = AddCurrencyModelRepository.getAddCurrencyModel();

        inputTitle(addCurrencyModel.getTitle());
        inputCode(addCurrencyModel.getCode());
        inputSymbolL(addCurrencyModel.getSymbolLeft());
        inputSymbolR(addCurrencyModel.getSymbolRight());
        inputDecimal(addCurrencyModel.getDecimal());
        inputValue(addCurrencyModel.getCount());
       
        clickOnSaveButton();

        successAddCurrencyPage = new SuccessAddCurrencyPage();
        return this;
    }

    private void inputTitle(String title) {
        addCurrencyPage.getTitleInput().clear();
        addCurrencyPage.getTitleInput().sendKeys(title);
    }

    private void inputCode(String code) {
        addCurrencyPage.getCodeInput().clear();
        addCurrencyPage.getCodeInput().sendKeys(code);
    }

    private void inputSymbolL(String symbolL) {
        addCurrencyPage.getSymbolLeftInput().clear();
        addCurrencyPage.getSymbolLeftInput().sendKeys(symbolL);
    }

    private void inputSymbolR(String symbolR) {
        addCurrencyPage.getSymbolRightInput().clear();
        addCurrencyPage.getSymbolRightInput().sendKeys(symbolR);
    }

    private void inputDecimal(String decimal) {
        addCurrencyPage.getDecimalInput().clear();
        addCurrencyPage.getDecimalInput().sendKeys(decimal);
    }

    private void inputValue(String value) {
        addCurrencyPage.getValueInput().clear();
        addCurrencyPage.getValueInput().sendKeys(value);
    }

    public void clickOnSaveButton() {
        addCurrencyPage.getSubmitButton().click();
    }

    public void verifyAddingCurrency() {
        String expectedMessage = "Success: You have modified currencies!\n" +
                "×";
        Assert.assertEquals(successAddCurrencyPage.getSuccessModifyTitle().getText(), expectedMessage, "Incorrect result");
    }

    public void incorrectVerifyAddingCurrencyExpectedMessege() {
        String expectedMessage = "Success: You have modified currencies!" ;
        Assert.assertNotEquals(successAddCurrencyPage.getSuccessModifyTitle().getText(), expectedMessage, "Incorrect result");
    }
}
