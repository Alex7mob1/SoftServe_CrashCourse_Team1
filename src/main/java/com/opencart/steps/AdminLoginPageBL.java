package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.AdminLoginPage;
import com.opencart.repository.LoginModelRepository;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPage;

    public AdminLoginPageBL(){
        adminLoginPage = new AdminLoginPage();
    }

    public AdminLoginPageBL adminLogin(){

        LoginModel loginModel = LoginModelRepository.getLoginModel();

        inputAdminName(loginModel.getAdminName());
        inputAdminPassword(loginModel.getAdminPassword());

        clickOnAdmitButton();

        return this;
    }
    public void clickOnAdmitButton() {
        adminLoginPage.getAdmitButton().click();
    }

    private void inputAdminName(String adminName) {
        adminLoginPage.getAdminNameInput().clear();
        adminLoginPage.getAdminNameInput().sendKeys(adminName);
    }
    private void inputAdminPassword(String adminPassword) {
        adminLoginPage.getAdminPasswordInput().clear();
        adminLoginPage.getAdminPasswordInput().sendKeys(adminPassword);
    }
}
