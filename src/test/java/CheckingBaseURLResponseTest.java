import org.junit.Assert;
import org.junit.Test;

public class CheckingBaseURLResponseTest extends BaseTest{

    @Test
    public void checkTtile(){
        driver.get("https://automationexercise.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String expectedTtile = "Automation Exercise";

        Assert.assertEquals(title,expectedTtile);

    }

}
