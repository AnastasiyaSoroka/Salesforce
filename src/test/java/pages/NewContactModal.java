package pages;

import elements.Dropdown;
import elements.Input;
import elements.InputWithSearch;
import elements.Textarea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage {

    private By contactLabel = By.xpath("//*[contains(text(),'Contact Information')]");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public NewContactModal isPageOpened() {
        isElementDisplayed(contactLabel);
        return this;
    }

    public NewContactModal openPage() {
        return this;
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }

    public NewContactModal populateForm(Contact contact) {
        new Input(driver, "Last Name").write(contact.getLastName());
        new Dropdown(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new InputWithSearch(driver, "Account Name").selectWithSearch(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.geteMail());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobilePhone());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new Textarea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        return this;
    }

}