import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Miłosz Skorupski/Documents/Automatyzacja Main Folder/chromedriver-win64.exe");

        ChromeOptions options = new ChromeOptions();
        // Example of options (uncomment as needed)
        // options.addArguments("--headless"); // Run in headless mode
        // options.addArguments("--disable-notifications"); // Disable notifications
        // options.addArguments("--start-maximized"); // Start maximized

        driver = new ChromeDriver(options);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
