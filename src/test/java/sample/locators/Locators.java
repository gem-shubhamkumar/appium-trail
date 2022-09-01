package sample.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By input_Name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By radio_Female = AppiumBy.id("com.androidsample.generalstore:id/radioFemale");
    public static By radio_Male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By btn_LetsShop = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");

    // API-Demos-apk

    public static By app = AppiumBy.accessibilityId("App");
    public static By alertDialogs = AppiumBy.accessibilityId("Alert Dialogs");
    public static By listDialog = AppiumBy.accessibilityId("List dialog");
    public static By alertTitle = AppiumBy.id("android:id/alertTitle");

}
