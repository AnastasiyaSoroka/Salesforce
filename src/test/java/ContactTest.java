import models.Account;
import models.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    private String accountName = "BBBBB";
    private String tabName = "Contacts";
    private Account account = new Account(accountName,
            "",
            "Analyst",
            "",
            "",
            "Banking",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "");

    private Contact contact = new Contact(accountName,
            "Mr.",
            "FName",
            "MName",
            "suffix",
            accountName,
            "100-200",
            "nastyana@gmail.com",
            "shipping address text",
            "billingCity",
            "billingZip",
            "billingState",
            "billingCountry",
            "shippingCity",
            "shippingZip",
            "shippingState",
            "shippingCpuntry");

    @BeforeMethod
    public void preRequisites() {
        loginPage
                .openPage()
                .attemptLogin(USERNAME, PASSWORD);
        homePage
                .isPageOpened()
                .selectTab("Accounts")
                .isTabOpened("Accounts")
                .clickNew();

        newAccountModal
                .isPageOpened()
                .populateForm(account)
                .clickSave();
        homePage
                .isTitleDisplayed(accountName);
    }

    @Test
    public void createdContact() {
        homePage
                .selectTab(tabName)
                .isTabOpened(tabName)
                .clickNew();
        newContactModal
                .isPageOpened()
                .populateForm(contact)
                .clickSave();
        homePage
                .isTitleDisplayed(accountName);
    }
}
