import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class RemoveFromCartTest extends BaseTest {

    private MainPageBL mainPageBL;

    @BeforeMethod
    public void userRegister() {

        int quantity = 3;

        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPanelBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        mainPageBL.getMenuPanelBL()
                .clickOnDesktopsMenuButton()
                .clickOnMacMenuButton()
                .clickOnIMacIcon()
                .setQuantityAddToCart(quantity);
    }

    @Test
    public void testRemoveLastElementFromCart() {

        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .clickOnRemoveWithOneProductButton()
                .verifyEmptyPageAndContinueButton();
    }

    @Test
    public void testRemoveElementFromCart() {

        int quantity = 2;

        mainPageBL.getMenuPanelBL()
                .clickOnComponentsMenuButton()
                .clickOnMonitorsMenuButton()
                .clickOnSamsungSyncMasterIcon()
                .setQuantityAddToCart(quantity);
        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .clickOnRemoveWithFewProductsButton()
                .verifyShoppingCartLocation();
    }

    @Test
    public void testContinueShopping(){

        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .clickOnContinueShoppingButton()
                .verifyHomePageLocation();
    }

    @Test
    public void testCheckOutButton(){

        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .clickOnCheckoutButton()
                .verifyCheckoutPageLocation();
    }
}

