import models.Account;
import models.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    private String accountName = "BBBBB";
    private String tabName = "Contacts";

    private Account account = Account.builder()
            .accountName(accountName)
            .type("Analyst")
            .industry("Banking")
            .build();

    private Contact contact = Contact.builder()
            .lastName(accountName)
            .salutation("Mr.")
            .firstName("FName")
            .middleName("MName")
            .suffix("suffix")
            .accountName(accountName)
            .title("sss")
            .eMail("nastyana@gmail.com")
            .phone("4445555666")
            .mobilePhone("123456678")
            .department("11123dc")
            .fax("12312312312")
            .mailingCountry("mailingCountry")
            .mailingState("mailingState")
            .mailingCity("mailingCity")
            .mailingStreet("mailingStreet")
            .mailingZip("mailingZip")
            .build();

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
