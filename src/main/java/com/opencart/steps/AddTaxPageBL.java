package com.opencart.steps;

import com.opencart.datamodel.AddTaxModel;
import com.opencart.pages.AddTaxPage;
import com.opencart.pages.SuccessAddTaxPage;
import com.opencart.repository.AddTaxModelRepository;
import org.testng.Assert;

public class AddTaxPageBL {

    private AddTaxPage addTaxPage;
    private SuccessAddTaxPage successAddTaxPage;

    public AddTaxPageBL(){addTaxPage = new AddTaxPage();}

    public AddTaxPageBL addNewTax() {

        AddTaxModel addTaxModel = AddTaxModelRepository.getAddTaxModel();

        inputName(addTaxModel.getNameInput());
        inputRate(addTaxModel.getRateInput());

        clickOnTypeButton();
        clickOnFixedButton();
        clickOnSubmitButton();

        successAddTaxPage = new SuccessAddTaxPage();

        return this;
    }

    private void inputName(String name) {
        addTaxPage.getNameInput().clear();
        addTaxPage.getNameInput().sendKeys(name);
    }

    private void inputRate(String rate) {
        addTaxPage.getRateInput().clear();
        addTaxPage.getRateInput().sendKeys(rate);
    }

    private void clickOnTypeButton(){addTaxPage.getTypeButton().click();}
    private void clickOnFixedButton(){addTaxPage.getFixedButton().click();}
    private void clickOnSubmitButton(){addTaxPage.getSubmitButton().click();}

    public void verifyAdding() {
        String expectedMessage = "×";
        Assert.assertEquals(successAddTaxPage.getSuccessMark().getText(), expectedMessage, "Incorrect page title");
    }
}
