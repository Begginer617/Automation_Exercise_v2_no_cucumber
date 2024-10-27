import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogging() {
        // Navigate to the login page
        driver.get("https://automationexercise.com/login");

        // Find the username and password input fields
        WebElement usernameField = driver.findElement(By.name("email")); // Use the correct name attribute for the email field
        WebElement passwordField = driver.findElement(By.name("password")); // Use the correct name attribute for the password field

        // Input the username and password
        usernameField.sendKeys("sisopay609@digopm.com");
        passwordField.sendKeys("sisopay609@digopm.com");

        // Submit the form
        passwordField.submit();

    }
}
