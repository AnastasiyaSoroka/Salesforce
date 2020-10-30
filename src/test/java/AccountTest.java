import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    private String tabName = "Accounts";
    private String accountName = "AAAAA";
    private Account account = new Account(accountName,
            "SSS.tut",
            "Analyst",
            "234124123423",
            "description text",
            "Banking",
            "100-200",
            "billing address text",
            "shipping address text",
            "billingCity",
            "billingZip",
            "billingState",
            "billingCountry",
            "shippingCity",
            "shippingZip",
            "shippingState",
            "shippingCpuntry");

    @Test
    public void createdAccount() {
        loginPage
                .openPage()
                .attemptLogin(USERNAME, PASSWORD);

        homePage
                .isPageOpened()
                .selectTab(tabName)
                .isTabOpened(tabName)
                .clickNew();

        newAccountModal
                .isPageOpened()
                .populateForm(account)
                .clickSave();
        homePage
                .isTitleDisplayed(accountName);
    }

}
