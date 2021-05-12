import com.opencart.navigation.Navigation;
import com.opencart.steps.EditAccountPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.*;

import static com.opencart.enums.URLs.BASE_URL;

public class EditAccountTest extends BaseTest {

    @BeforeMethod
    @Parameters({"email", "password"})
    public void checkLoginOfEditAccountPage(String email, String password) {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        EditAccountPageBL editAccountPageBL = mainPageBL.getHeaderPanelBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson(email, password)
                .clickOnConfirmButton()
                .clickOnEditAccountButton();
    }

    @AfterMethod
    public void after() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPanelBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
    }

    @Test(priority = 1)
    @Parameters({"firstName", "lastName", "invalidEmail", "telephone"})
    public void updateUserInformationWithInvalidParameters(@Optional("firstName") String firstName, @Optional("lastName") String lastName, @Optional("invalidEmail") String invalidEmail, @Optional("telephone") String telephone) {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .inputInvalidInformation(firstName, lastName, invalidEmail, telephone);
        editAccountPageBL.checkFirstName();
        editAccountPageBL.checkLastName();
        editAccountPageBL.checkEmail();
        editAccountPageBL.checkTelephoneCharacters();
    }

    @Test(priority = 2)
    public void previousPageRedirection() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .cancelEditInformation();
        editAccountPageBL.checkRedirectToPreviousPage();
    }

    @Test(priority = 3)
    @Parameters({"duplicateEmail"})
    public void inputAlreadyExistEmail(@Optional("duplicateEmail") String duplicateEmail) {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .inputAlreadyRegisteredEmail(duplicateEmail);
        editAccountPageBL.checkDuplicateEmail();
    }

    @Test(priority = 4)
    public void updateUserInformationWithValidParameters() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation();
        editAccountPageBL.verifyUpdates();
    }

}

