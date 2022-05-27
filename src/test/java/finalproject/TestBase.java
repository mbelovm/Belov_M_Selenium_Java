package finalproject;

import org.junit.After;
import org.junit.Before;

public class TestBase {
    public static ThreadLocal<Application> tlApp = new ThreadLocal<>();
    public Application app;

    @Before
    public void setup() {
        if (tlApp.get() != null) {
            app = tlApp.get();
        }

        app = new Application();
        tlApp.set(app);
    }

    // stop driver and shut down browser
    @After
    public void stop() {
        Runtime.getRuntime().addShutdownHook( new Thread(() -> { app.quit(); app = null; } ));
    }

}
