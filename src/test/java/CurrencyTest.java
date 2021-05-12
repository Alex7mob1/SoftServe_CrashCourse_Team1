import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.*;

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
        mainPageBL.getHeaderPageBL()
                .clickOnCurrencyButton()
                .clickOnPoundCurrencyButton()
                .clickOnExamplePage()
                .verifyResult();
    }

    @Test
    public void adminLoginTest() {
        new Navigation().navigateToUrl(ADMIN_CURRENCY_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
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
    public void editCurrencyTest() {
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
    public void inccorectExpectedMessageEditCurrencyTest() {
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

    @Test
    public void addNewTaxTest() {
        new Navigation().navigateToUrl(TAX_RATES_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        TaxPageBL taxPageBL = new TaxPageBL();
        taxPageBL
                .clickOnAddTaxButton()
                .addNewTax()
                .verifyAdding();
    }

    @Test
    public void enableTaxTest(){
        new Navigation().navigateToUrl(TAX_CLASSES_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL
                .adminLogin();
        TaxClassesPageBL taxClassesPageBL = new TaxClassesPageBL();
        taxClassesPageBL.clickOnEditTaxButton()
                .testTaxEnable()
                .verifyEnabling();
    }

    @Test
    public void checkTaxEnablingOnOpencart(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL
                .checkTaxEnablingOnOpencart();
    }
}
