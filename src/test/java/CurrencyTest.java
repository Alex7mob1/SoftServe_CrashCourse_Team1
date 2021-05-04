import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.CurrencyPageBL;
import com.opencart.steps.ExamplePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_CURRENCY_URL;
import static com.opencart.enums.URLs.BASE_URL;

public class CurrencyTest extends BaseTest {

    @Test
    public void correctCurrencyWithExampleProduct() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        ExamplePageBL examplePageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyButton()
                .clickOnPoundCurrencyButton()
                .clickOnExamplePage();
        examplePageBL.verifyResult();
    }

    @Test
    public void incorrectCurrencyWithExampleProduct() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        ExamplePageBL examplePageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyButton()
                .clickOnPoundCurrencyButton()
                .clickOnExamplePage();
        examplePageBL.wrongResult();
    }

    @Test
    public void adminLoginTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL.clickOnAddNewCurrencyButton();

    }

    @Test
    public void addNewCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL
                .clickOnAddNewCurrencyButton()
                .addNewCurrency()
                .verifyAddingCurrency();
    }

    @Test
    public void incorrectExpectedMessageNewCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL
                .clickOnAddNewCurrencyButton()
                .addNewCurrency()
                .incorrectVerifyAddingCurrencyExpectedMessege();
    }

    @Test
    public void EditCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL
                .clickOnEditButton()
                .editCurrency()
                .verifySuccessEditing();
    }

    @Test
    public void InccorectExpectedMessageEditCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL
                .clickOnEditButton()
                .editCurrency()
                .verifyInccorectExpectedMessageEditing();
    }


}
