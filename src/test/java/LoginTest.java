import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogging(){
        driver.get("https://automationexercise.com/login");
        WebElement usernameInput = driver.findElement(By.tagName("login-email"));
    }






}
