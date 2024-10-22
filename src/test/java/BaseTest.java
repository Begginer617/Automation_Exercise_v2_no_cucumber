import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        // Ensure that WebDriverManager downloads and sets up the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void checkTitle() {
        // Ensure driver is initialized before using it
        driver.get("https://automationexercise.com/");

        // Your test logic here...
    }

    @After
    public void tearDown() {
        // Quit the driver after test execution
        if (driver != null) {
            driver.quit();
        }
    }
}
