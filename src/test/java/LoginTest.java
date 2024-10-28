import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Before
    public void setUp() {
        super.setUp(); // Inicjalizuje driver z klasy bazowej
    }

    @Test
    public void successfulLogging() {
        // Znajdź pola email oraz hasło używając `data-qa` jako selektora
        WebElement usernameField = driver.findElement(By.cssSelector("[data-qa='login-email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[data-qa='login-password']"));

        // Wprowadź dane logowania
        usernameField.sendKeys("sisopay609@digopm.com");
        passwordField.sendKeys("sisopay609@digopm.com");

        // Znajdź i kliknij przycisk logowania używając `data-qa` jako selektora
        WebElement loginButton = driver.findElement(By.cssSelector("[data-qa='login-button']"));
        loginButton.click();

        // Możesz dodać tutaj asercje, aby zweryfikować, czy logowanie się powiodło
    }
}
