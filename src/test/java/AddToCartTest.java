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
                .setQuantityAddToCart(expectedQuantity)
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
                .setQuantityAddToCart(expectedQuantity)
                .verifyAddToCart(expectedProduct);
        mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton()
                .editQuantityProducts(expectedUpdateQuantity)
                .verifyEditQuantity();
    }

    @Test
    public void testAddProductsInSearchBox() {

        String productName = "HP LP3065";
        int quantity = 3;

        mainPageBL.getSearchPanelBL()
                .searchProduct(productName)
                .clickOnIconInSearchPage()
                .setQuantityAddToCart(quantity)
                .verifyAddToCart(productName);
    }

    @Test
    public void testAddTwoProductsToCartVerifyPrice() {

        int quantity = 2;
        String productName1 = "iMac";
        String productName2="Samsung SyncMaster 941BW";

        mainPageBL.getMenuPanelBL()
                .clickOnDesktopsMenuButton()
                .clickOnMacMenuButton()
                .clickOnIMacIcon()
                .setQuantityAddToCart(quantity);
        mainPageBL.getMenuPanelBL()
                .clickOnComponentsMenuButton()
                .clickOnMonitorsMenuButton()
                .clickOnSamsungSyncMasterIcon()
                .setQuantityAddToCart(quantity);
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPanelBL()
                .clickOnShoppingCartButton();
        System.out.println("Total iMac = "+shoppingCartPageBL.verifyPrice(productName1));
        System.out.println("Total Samsung = "+shoppingCartPageBL.verifyPrice(productName2));
    }
}