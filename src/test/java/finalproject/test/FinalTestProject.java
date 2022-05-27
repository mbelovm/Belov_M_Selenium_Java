package finalproject.test;

import finalproject.TestBase;
import finalproject.TestUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.lang3.RandomStringUtils;

public class FinalTestProject extends TestBase {
    public final String validPassword = "secret_sauce";
//    public final String[] validUsernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};

    @Test
    public void wrongPassword() {
        TestUser testUser = new TestUser()
                .setUserName("standard_user")
                .setPassword(RandomStringUtils.randomAlphabetic(8));

        app.fillOutFields(testUser);
        app.login();

        assert app.loginCredentialError();
    }

    @Test
    public void commonLogin() {
        TestUser testUser = new TestUser()
                .setUserName("standard_user")
                .setPassword(validPassword);

        app.fillOutFields(testUser);
        app.login();

        assert app.isLoginSuccessful();
    }

    @Test
    public void lockedOutLogin() {
        TestUser testUser = new TestUser()
                .setUserName("locked_out_user")
                .setPassword(validPassword);

        app.fillOutFields(testUser);
        app.login();

        assert app.lockedLogin();
    }

    @Test
    public void problemLogin() {
        TestUser testUser = new TestUser()
                .setUserName("problem_user")
                .setPassword(validPassword);

        app.fillOutFields(testUser);
        app.login();

        assert app.problemLogin();
    }

    @Test
    public void performanceGlitchLogin() {
        TestUser testUser = new TestUser()
                .setUserName("performance_glitch_user")
                .setPassword(validPassword);

        app.fillOutFields(testUser);
        app.login();

        assert app.waitLoginSuccessful();
    }
}
