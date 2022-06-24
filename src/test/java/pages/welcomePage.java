package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcomePage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By btn_skip = MobileBy.id("com.lcwaikiki.android:id/tvNext");

    public welcomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }

    public void tap_skip(){
        elementHelper.tap(btn_skip);
    }
}
