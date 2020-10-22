package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Textarea {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/../following-sibling::textarea";

    public Textarea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label '%s'", text, label));
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locator, label))));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);

    }

}
