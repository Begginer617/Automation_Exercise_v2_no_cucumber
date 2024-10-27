import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingBaseURLResponseTest extends BaseTest {

    @Test
    public void shouldReturnExpectedTitle_whenNavigatingToHomePage() {
        // Use the driver directly from the base class
        driver.get("https://automationexercise.com/");
        String title = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        assertEquals(expectedTitle, title);
    }
}
