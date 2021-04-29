import com.opencart.navigation.Navigation;
import com.opencart.steps.EditAccountPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class EditAccountTest extends BaseTest {
    @BeforeMethod
    public void checkLoginOfEditAccountPage() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        EditAccountPageBL editAccountPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginPageButton()
                .loginPerson()
                .clickOnLoginButton()
                .clickOnEditAccountButton();
    }

    @Test
    public void emptyFirstNameField() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
        .editInformation();
        editAccountPageBL.emptyFirstName();
    }
    @Test
    public void invalidLastNameField() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation();
        editAccountPageBL.invalidLastName();
    }
    @Test
    public void incorrectEmailField() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation();
        editAccountPageBL.incorrectEmail();
    }
    @Test
    public void telephoneCharactersField() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation();
        editAccountPageBL.lackOfTelephoneCharacters();
    }
    @Test
    public void previousPageRedirection() throws InterruptedException {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .cancelEditInformation();
        editAccountPageBL.redirectToPreviousPage();
    }

    @Test
    public void updateUserParameters() {
        EditAccountPageBL editAccountPageBL = new EditAccountPageBL()
                .editInformation();
        editAccountPageBL.verifyUpdates();
    }
}

