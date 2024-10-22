import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingBaseURLResponseTest extends BaseTest {

    @Test
    public void checkTitle() {
        // Use the getter method to access the driver
        getDriver().get("https://automationexercise.com/");
        String title = getDriver().getTitle();
        String expectedTitle = "Automation Exercise";

        // Check the current URL (optional)
        String url = getDriver().getCurrentUrl(); // You can keep this if you need to assert the URL as well


        // Assert the title
        assertEquals(expectedTitle, title);
    }
}
