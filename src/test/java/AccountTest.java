import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    private String tabName = "Accounts";
    private String accountName = "AAAAA";

    private Account account = Account.builder()
            .accountName(accountName)
            .website("SSS.tut")
            .type("Analyst")
            .description("description text")
            .phone("234124123423")
            .industry("Banking")
            .employees("100")
            .billingCountry("billingCountry")
            .billingCity("billingCity")
            .billingState("billingState")
            .billingStreet("billing address text")
            .billingZip("billingZip")
            .shippingCountry("shippingCpuntry")
            .shippingState("shippingState")
            .shippingCity("shippingCity")
            .shippingStreet("shipping address text")
            .shippingZip("shippingCpuntry")
            .build();

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
