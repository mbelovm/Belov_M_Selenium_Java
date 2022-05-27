package finalproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Page {
    public StartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public StartPage open() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }
    public StartPage fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
        return this;
    }

    public StartPage fillPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public StartPage clickLoginButton() {
        loginButton.click();
        return new StartPage(driver);
    }


}
