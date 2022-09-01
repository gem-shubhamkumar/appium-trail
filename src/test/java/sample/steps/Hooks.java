package sample.steps;

import com.gemini.generic.MobileDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before
    public void start() throws IOException {
        MobileDriverManager.androidInitialisation();
    }

    @After
    public void stop() {
        if (MobileDriverManager.getAppiumDriver()!=null) {
            MobileDriverManager.closeDriver();
            System.out.println("closed");
        } else {
            System.out.println("already closed");
        }
    }
}
