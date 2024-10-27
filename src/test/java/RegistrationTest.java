import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C://Users//Miłosz Skorupski//Documents//Automatyzacja Main Folder//chromedriver-win64//chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    // Step 1: Launch browser and navigate to URL
    public void registrationTest() {
        // Launch the browser and navigate to the URL
        driver.get("http://automationexercise.com");

        // Assert that the title of the page is exactly as expected
        assertEquals("Automation Exercise", driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
