package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class HomeworkSelenide {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    //    testOne from Homework2Tests was rewritten using Selenide library for this task
    @Test
    public void selenideTest() {
        open("https://courses.ultimateqa.com/users/sign_in");
        $(By.xpath("//h1")).shouldHave(exactText("Welcome Back!"));
        $$(By.xpath("//input[@type=\"email\"]")).shouldHave(sizeGreaterThan(0));
        $$(By.xpath("//input[@type=\"password\"]")).shouldHave(sizeGreaterThan(0));
        $$(By.xpath("//input[@type=\"checkbox\"]")).shouldHave(sizeGreaterThan(0));

        $(By.className("form__forgot-password")).shouldHave(attribute("href", "https://courses.ultimateqa.com/users/password/new"));
        $$(By.xpath("//input[@type=\"submit\"]")).shouldHave(sizeGreaterThan(0));
        $(By.className("remote-sign-in__vendor-list")).shouldHave(attribute("childElementCount", "3"));

        $(By.xpath("//aside/a")).shouldHave(attribute("href", "https://courses.ultimateqa.com/users/sign_up"));

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}
