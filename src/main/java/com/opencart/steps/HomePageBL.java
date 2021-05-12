package com.opencart.steps;

import com.opencart.pages.HomePage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageBL {
    private HomePage homePage;

    public HomePageBL() {
        homePage = new HomePage();
    }

    public void verifyHomePageLocation() {
        String expectedMassage = "Featured";
        assertThat(homePage.getVerifyHomePageLocation().getText(), CoreMatchers.startsWith(expectedMassage));
    }
}