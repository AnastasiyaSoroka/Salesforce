package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    String URL = "https://itechart4.my.salesforce.com/";
    By saveButton = By.cssSelector("[title=Save]");
    By newButton = By.cssSelector("[title=New]");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract BasePage isPageOpened();

    public abstract BasePage openPage();

    public boolean isElementDisplayed(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            Assert.fail("Element was not found by locator :" + locator);
            return false;
        }
        return true;
    }
}