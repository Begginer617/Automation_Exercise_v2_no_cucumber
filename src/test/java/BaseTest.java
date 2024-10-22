import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    // Initialize the WebDriver in your BaseTest constructor or a setup method
    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update this path
        driver = new ChromeDriver(); // Initialize the WebDriver
    }

    // Getter method for driver
    protected WebDriver getDriver() {
        return driver;
    }

    // Optionally, a method to clean up after tests
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
