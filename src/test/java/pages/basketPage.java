package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basketPage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By go_payment = MobileBy.id("com.lcwaikiki.android:id/tv_go_checkout");

    public basketPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }
    public void go_to_payment(){elementHelper.tap(go_payment);}
}
