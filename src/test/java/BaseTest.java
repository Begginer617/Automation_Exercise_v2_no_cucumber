import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;


    // Initialize the WebDriver in your BaseTest constructor or a setup method
    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Miłosz Skorupski/Documents/Automatyzacja Main Folder/chromedriver-win64"); // Update this path
        driver = new ChromeDriver(); // Initialize the WebDriver
    }

    // Getter method for driver
    protected WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }



}