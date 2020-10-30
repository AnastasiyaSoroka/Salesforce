package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    String optionLocator = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInputSelect')]//a";

    WebDriver driver;
    String label;

    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }

}