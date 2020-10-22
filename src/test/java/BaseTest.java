import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.NewContactModal;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountModal;

public class BaseTest {

    private WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    NewAccountModal newAccountModal;
    NewContactModal newContactModal;
    public static final String USERNAME = "nastyana-e4e9@force.com";
    public static final String PASSWORD = "Lasertag90";

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        newAccountModal = new NewAccountModal(driver);
        newContactModal = new NewContactModal(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}