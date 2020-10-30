package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By USERNAME_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    public LoginPage openPage() {
        driver.get(URL);
        isPageOpened();
        return this;
    }

    public LoginPage attemptLogin(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

}
