package sample.steps;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import sample.locators.Locators;

import java.io.IOException;

public class TestSteps {

    @Given("Login to the app")
    public void login_to_the_app() throws IOException {
        MobileDriverManager.getAppiumDriver().findElement(Locators.input_Name).sendKeys("Shubham");
        MobileAction.click(Locators.radio_Female);
        MobileAction.click(Locators.btn_LetsShop);
        MobileAction.waitSec(5);
    }

    @Given("verify the element text")
    public void verifyTheElementText() throws IOException {
        MobileAction.click(Locators.app);
        MobileAction.click(Locators.alertDialogs);
        MobileAction.click(Locators.listDialog);
        String title = MobileAction.getElementText(Locators.alertTitle);
        Assert.assertEquals(title, "Header title");
    }
}
