import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddToCartTest extends BaseTest {

    private MainPageBL mainPageBL;

    @BeforeMethod
    public void userRegister() {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPanelBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
    }

    @Test
    public void testAddMacToCart() {

        int expectedQuantity = 3;
        int expectedUpdateQuantity = 4;
        String expectedProduct = "iMac";

        mainPageBL.getMenuPanelBL()
                .clickOnDesktopsMenuButton()
                .clickOnMacMenuButton()
                .clickOnIMacIcon()
                .setQuantity(expectedQuantity)
                .verifyAddToCart(expectedProduct);
        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .editQuantityProducts(expectedUpdateQuantity)
                .verifyEditQuantity();
    }


    @Test
    public void testAddSamsungSyncMasterToCart() {

        int expectedQuantity = 2;
        int expectedUpdateQuantity = 1;
        String expectedProduct = "Samsung SyncMaster 941BW";

        mainPageBL.getMenuPanelBL()
                .clickOnComponentsMenuButton()
                .clickOnMonitorsMenuButton()
                .clickOnSamsungSyncMasterIcon()
                .setQuantity(expectedQuantity)
                .verifyAddToCart(expectedProduct);
        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .editQuantityProducts(expectedUpdateQuantity)
                .verifyEditQuantity();
    }

    @Test
    public void testAddTwoProductsToCart(){

        int quantity=2;
        String productName= "iMac";

        mainPageBL.getMenuPanelBL()
                .clickOnDesktopsMenuButton()
                .clickOnMacMenuButton()
                .clickOnIMacIcon()
                .setQuantity(quantity)
                .clickOnAddToCartButton();
        mainPageBL.getMenuPanelBL()
                .clickOnComponentsMenuButton()
                .clickOnMonitorsMenuButton()
                .clickOnSamsungSyncMasterIcon()
                .setQuantity(quantity)
                .clickOnAddToCartButton();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton();
        System.out.println(shoppingCartPageBL.verifyPrice(productName));
        shoppingCartPageBL.clickOnRemoveWithFewProductsButton()
                .verifyShoppingCartLocation();

    }





    //TODO
    // @Test
    // public void testAddMacToCartAndCheckout()

}