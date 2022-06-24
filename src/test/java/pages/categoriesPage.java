package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class categoriesPage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By btn_kadın = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView");
    By btn_giyim = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giyim\")");
    By btn_bluz = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bluz\")");


    public categoriesPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }
    public void tap_kadın(){elementHelper.tap(btn_kadın);}
    public void tap_giyim(){elementHelper.tap(btn_giyim);}
    public void scroll_to_item(String string){elementHelper.scrollTo(string);}
    public void tap_bluz(){elementHelper.tap(btn_bluz);}

}
