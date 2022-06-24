package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By btn_home = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ana Sayfa\")");
    By btn_categories = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By btn_basket = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By btn_favoriler = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Favoriler\")");
    By btn_profil = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");


    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }

    public void tap_profile(){elementHelper.tap(btn_profil);}
    public void tap_kategoriler(){elementHelper.tap(btn_categories);}

}
