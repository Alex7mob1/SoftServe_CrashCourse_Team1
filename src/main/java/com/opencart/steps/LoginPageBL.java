package com.opencart.steps;


import com.opencart.pages.LoginPage;
import com.opencart.pages.MyAccountPage;

public class LoginPageBL {
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson(String email, String password) {
        inputEmail(email);
        inputPassword(password);

        myAccountPage = new MyAccountPage();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }


    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    public MyAccountPageBL clickOnConfirmButton() {
        loginPage.getConfirmButton().click();
        return new MyAccountPageBL();
    }

}
