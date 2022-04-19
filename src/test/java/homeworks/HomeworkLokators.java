package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkLokators {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
    }

    @Test
    public void LokatorsTest() {
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");

        driver.findElement(By.cssSelector("p>input[name=\"name\"]")).click();
        driver.findElement(By.xpath("//p[./label[contains(text(), \"Last Name:\")]]/input")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Marital Status:\")]]/div/label[contains(text(), \" Single\")]/input")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Marital Status:\")]]/div/label[contains(text(), \" Married\")]/input")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Marital Status:\")]]/div/label[contains(text(), \" Divorced\")]/input")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"fieldset padding-bottom\"]/div/label[contains(text(), \" Dance\")]/input")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"fieldset padding-bottom\"]/div/label[contains(text(), \" Reading\")]/input")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"fieldset padding-bottom\"]/div/label[contains(text(), \" Cricket\")]/input")).click();
        driver.findElement(By.xpath("//form[@id=\"register_form\"]/fieldset[./label[contains(text(), \"Country\")]]/select")).click();
        driver.findElement(By.xpath("//form[@id=\"register_form\"]/fieldset[./label[contains(text(), \"Country\")]]/select/option[2]")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Date of Birth:\")]]/div[1]/select/option[2]")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Date of Birth:\")]]/div[2]/select/option[2]")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Date of Birth:\")]]/div[3]/select/option[contains(text(), \"2014\")]")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Phone Number:\")]]/input")).click();
        driver.findElement(By.xpath("//form[@id=\"register_form\"]/fieldset[./label[contains(text(), \"Username:\")]]/input")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"E-mail:\")]]/input")).click();
        //driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"Your Profile Picture\")]]/input")).click();
        driver.findElement(By.xpath("//fieldset[./label[contains(text(), \"About Yourself\")]]/textarea")).click();
        driver.findElement(By.xpath("//form[@id=\"register_form\"]/fieldset[./label[text()= \"Password:\"]]/input")).click();
        driver.findElement(By.xpath("//form[@id=\"register_form\"]/fieldset[./label[text()= \"Confirm Password:\"]]/input")).click();
        driver.findElement(By.cssSelector("input[value=submit]")).click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
