import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationTest extends BaseTest {


    /*
    . Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and email address
    7. Click 'Signup' button
    8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    9. Fill details: Title, Name, Email, Password, Date of birth
    10. Select checkbox 'Sign up for our newsletter!'
    11. Select checkbox 'Receive special offers from our partners!'
    12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    13. Click 'Create Account button'
    14. Verify that 'ACCOUNT CREATED!' is visible
    15. Click 'Continue' button
    16. Verify that 'Logged in as username' is visible
     */
    public void setUp() {
        // Set up the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:/Users/Miłosz Skorupski/Documents/Automatyzacja Main Folder/chromedriver-win64.exe");
        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    // Step 1: Launch browser and navigate to URL
    public void registrationTest() {
        driver.get("http://automationexercise.com");
assertTrue();

    }

    private void assertTrue() {

    }


}


