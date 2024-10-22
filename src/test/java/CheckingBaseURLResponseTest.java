import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingBaseURLResponseTest extends BaseTest {

    @Test
    public void checkTitle() {
        driver.get("https://automationexercise.com/");
        String title = driver.getTitle();
        String expectedTitle = "Automation Exercise";

        assertEquals(expectedTitle, title);
    }
}
