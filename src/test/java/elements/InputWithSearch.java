package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputWithSearch {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";
    String locatorSearchOption = "//a[@role='option']/descendant::div[@title='%s']";

    public InputWithSearch(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectWithSearch(String text) {
        System.out.println(String.format("Writing text '%s' into input with label '%s'", text, label));
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locator, label))));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locatorSearchOption, text))));
        driver.findElement(By.xpath(String.format(locatorSearchOption, text))).click();
    }
}
