package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.MyAccountPage;
import org.openqa.selenium.WebElement;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {

        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }
    public LoginPageBL clickOnLoginPageButton() {
        headerPage.getLoginPageButton().click();
        return new LoginPageBL();}
}





