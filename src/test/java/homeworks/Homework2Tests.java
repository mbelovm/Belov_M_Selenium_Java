package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework2Tests {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testOne() {
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        assert driver.findElement(By.xpath("//h1")).getText().equals("Welcome Back!");
        assert driver.findElements(By.xpath("//input[@type=\"email\"]")).size() > 0;
        assert driver.findElements(By.xpath("//input[@type=\"password\"]")).size() > 0;
        assert driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size() > 0;

        WebElement forgotPassword = driver.findElement(By.className("form__forgot-password"));
        assert forgotPassword.getAttribute("href").equals("https://courses.ultimateqa.com/users/password/new");

        assert driver.findElements(By.xpath("//input[@type=\"submit\"]")).size() > 0;
        assert driver.findElement(By.className("remote-sign-in__vendor-list")).getAttribute("childElementCount").equals("3");

        WebElement createAcc = driver.findElement(By.xpath("//aside/a"));
        assert createAcc.getAttribute("href").equals("https://courses.ultimateqa.com/users/sign_up");
    }

    @Test
    public void testTwo() {
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/p")));
        assert driver.findElements(By.xpath("//div/p")).size() > 0;
        assert driver.findElement(By.xpath("//div/p")).getAttribute("textContent").equals("Invalid email or password.");
    }

    @Test
    public void testThree() {
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        driver.findElement(By.xpath("//aside/a")).click();
        assert driver.findElement(By.xpath("//article/h1")).getAttribute("innerText").equals("Create a new account");



    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
