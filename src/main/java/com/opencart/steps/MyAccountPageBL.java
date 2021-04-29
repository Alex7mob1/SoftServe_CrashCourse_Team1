package com.opencart.steps;

import com.opencart.pages.MyAccountPage;

public class MyAccountPageBL {
    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {

        myAccountPage = new MyAccountPage();
    }
    public EditAccountPageBL clickOnEditAccountButton() throws InterruptedException {
        myAccountPage.getEditAccountButton().click();
        return new EditAccountPageBL();
    }

}
