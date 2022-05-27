package finalproject;

import finalproject.pages.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Application {

    private WebDriver driver;
    private WebDriverWait wait;

    private StartPage startPage;

    public Application() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        startPage = new StartPage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void fillOutFields(TestUser testUser) {
        startPage
                .open()
                .fillUserNameField(testUser.getUserName())
                .fillPasswordField(testUser.getPassword());
    }

    public void login() {
        startPage.clickLoginButton();
    }

    public boolean loginCredentialError() {
        return driver.findElement(By.xpath("//h3")).getAttribute("innerText").equals("Epic sadface: Username and password do not match any user in this service");
    }

    public boolean isLoginSuccessful() {
        return driver.findElements(By.cssSelector(".shopping_cart_link")).size() > 0;
    }

    //    public boolean isLoginPageDissappear() {
//        List<WebElement> loginList = driver.findElements(By.id("login-button"));
//        wait.until(ExpectedConditions.stalenessOf(loginList.get(0)));
//        return loginList.size() = 0;
//    }
    public boolean lockedLogin() {
        return driver.findElement(By.xpath("//h3")).getAttribute("innerText").equals("Epic sadface: Sorry, this user has been locked out.");
    }

    public boolean problemLogin() {
        return driver.findElements(By.cssSelector("[src$=\"sl-404.168b1cce.jpg\"]")).size() > 0;
    }

    public boolean waitLoginSuccessful() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[src$=\"sauce-backpack-1200x1500.34e7aa42.jpg\"]")));
        return driver.findElements(By.cssSelector("[src$=\"sauce-backpack-1200x1500.34e7aa42.jpg\"]")).size() > 0;
    }
}
