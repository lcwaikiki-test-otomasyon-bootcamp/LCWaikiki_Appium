package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class profilePage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By input_mail = MobileBy.id("com.lcwaikiki.android:id/edtEmail");
    By input_password = MobileBy.id("com.lcwaikiki.android:id/edtPassword");
    By btn_login = MobileBy.id("com.lcwaikiki.android:id/buttonLogin");

    public profilePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }

    public void enter_mail(String string){elementHelper.sendKey(input_mail,string);}
    public void enter_password(String string){elementHelper.sendKey(input_password,string);}
    public void tap_login_button(){elementHelper.tap(btn_login);}
}
