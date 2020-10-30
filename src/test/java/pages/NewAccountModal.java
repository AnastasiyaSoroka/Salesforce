package pages;

import elements.Dropdown;
import elements.Input;
import elements.Textarea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BasePage {

    private By contactLabel = By.xpath("//*[contains(text(),'Account Information')]");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public NewAccountModal isPageOpened() {
        isElementDisplayed(contactLabel);
        return this;
    }

    public NewAccountModal openPage() {
        return this;
    }

    public NewAccountModal populateForm(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Phone").write(account.getPhone());
        new Textarea(driver, "Description").write(account.getDescription());
        new Input(driver, "Employees").write(account.getEmployees());
        new Dropdown(driver, "Type").select(account.getType());
        new Dropdown(driver, "Industry").select(account.getIndustry());
        new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing State").write(account.getBillingState());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return this;
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }

}
