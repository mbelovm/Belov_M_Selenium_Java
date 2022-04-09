import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MyTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // driver = new FirefoxDriver();
    }

    @Test
    public void myTest() {
//        driver.get("https://www.google.com");
//        driver.get("https://www.google.com/doodles");
        driver.get("https://www.google.com");
//        driver.navigate().to("https://www.google.com");
       /* driver.navigate().to("https://www.google.com/doodles");
        driver.navigate().to("https://www.google.com");
      driver.findElement(By.id("company"));
        driver.findElement(By.tagName("div.Umvnrc"));
        driver.findElement(By.className("Umvnrc"));
        driver.findElement(By.cssSelector(".Umvnrc"));

        driver.findElement(By.name("div.Umvnrc"));
        driver.findElement(By.linkText("div.Umvnrc"));
        driver.findElement(By.partialLinkText("div.Umvnrc"));
        driver.findElement(By.xpath("div.Umvnrc"));
        /* element.click();
        element.sendKeys("text");
        List<WebElement> elementList = driver.findElements(By.cssSelector("div.Umvnrc"));*/

        WebElement inputField = driver.findElement(By.cssSelector("input.gLFyf"));
        driver.navigate().refresh();
        inputField.click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
