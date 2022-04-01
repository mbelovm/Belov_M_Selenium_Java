import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
    }

    @Test
    public void myTest() {
//        driver.get("https://www.google.com");
//        driver.get("https://www.google.com/doodles");
        driver.get("https://www.google.com");
//        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://www.google.com/doodles");
        driver.navigate().to("https://www.google.com");
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
