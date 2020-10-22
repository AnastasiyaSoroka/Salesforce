package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {

    String locatorTab = "//a/span[text()='%s']";
    String label = "Home";
    String isTabOpened = "//li/span[contains(text(),'%s')]";
    String locatorName = "//*[text()='Account']/../*[2]//*[text()='%s']";

    public HomePage isTitleDisplayed(String label) {
        isElementDisplayed(By.xpath(createTabLocator(locatorName, label)));
        return this;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openPage() {
        isPageOpened();
        return this;
    }

    public String createTabLocator(String locatorTab, String label) {
        return String.format(locatorTab, label);
    }

    public HomePage isPageOpened() {
        isElementDisplayed(By.xpath(createTabLocator(locatorTab, label)));
        return this;
    }

    public HomePage isTabOpened(String label) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        isElementDisplayed(By.xpath(createTabLocator(isTabOpened, label)));
        return this;
    }

    public HomePage selectTab(String label) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createTabLocator(locatorTab, label))));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(createTabLocator(locatorTab, label))));
        } catch (TimeoutException e) {
            Assert.fail("Tab was not found by locator :" + By.xpath(createTabLocator(locatorTab, label)));
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(createTabLocator(locatorTab, label))));
        return this;
    }

    public void clickNew() {

        isElementDisplayed(newButton);
        driver.findElement(newButton).click();
    }

}

