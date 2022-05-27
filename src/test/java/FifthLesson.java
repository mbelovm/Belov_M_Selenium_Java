import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FifthLesson {
    private WebDriver driver;


    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    public void timeoutTest() {
        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf"));
        searchField.sendKeys("test");
        searchField.sendKeys(Keys.ENTER);
        assert driver.findElements(By.cssSelector("#search.g.tF2Cxc")).size() > 0;


    }

    @Test
    public void getAttributeTest() {
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("img.lnXdpd")).getAttribute("alt");
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}