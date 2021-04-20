package com.opencart.steps;

import com.opencart.pages.ExamplePage;
import org.testng.Assert;

public class ExamplePageBL {
    private ExamplePage examplePage;

    public ExamplePageBL(){
        examplePage = new ExamplePage();
    }

    public void verifyResult() {
        String expectedMessage = "£14,448.00";
        Assert.assertEquals(examplePage.getActualResult().getText(),expectedMessage,"Incorrect result");
    }
    public void wrongResult() {
        String expectedMessage = "£";
        Assert.assertNotEquals(examplePage.getActualResult().getText(),expectedMessage);
    }
}
