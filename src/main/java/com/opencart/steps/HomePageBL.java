package com.opencart.steps;

import com.opencart.pages.HomePage;

public class HomePageBL {
    private HomePage homePage;

    public HomePageBL() {
        homePage = new HomePage();
    }

    public HomePageBL verifyHomePageLocation() {
        homePage.getVerifyHomePage().click();
        return this;
    }
}
