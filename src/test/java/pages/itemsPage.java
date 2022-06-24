package pages;

import helpers.elementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class itemsPage {
    AppiumDriver driver;
    WebDriverWait wait;
    helpers.elementHelper elementHelper;

    By btn_filter = MobileBy.id("com.lcwaikiki.android:id/filter_product");
    By btn_renk = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By input_filter = MobileBy.id("com.lcwaikiki.android:id/searchFilterEditText");
    By colour_black = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Siyah\")");
    By btn_subFilter = MobileBy.id("com.lcwaikiki.android:id/subFilterButton");
    By btn_resultFilter = MobileBy.id("com.lcwaikiki.android:id/buttonFilter");

    // It is gonna be change with list
    By first_item = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView");

    By add_basket = MobileBy.id("com.lcwaikiki.android:id/basket");
    By btn_sizeS = MobileBy.AndroidUIAutomator("new UiSelector().text(\"S\")");
    By btn_goToBasket = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Git\")");


    public itemsPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new elementHelper(driver);
    }
    public void tap_filtre(){elementHelper.tap(btn_filter);}
    public void tap_renk(){elementHelper.tap(btn_renk);}
    public void filter_by_colour(String string){elementHelper.sendKey(input_filter,string);}
    public void tap_siyah(){elementHelper.tap(colour_black);}
    public void tap_uygula(){elementHelper.tap(btn_subFilter);}
    public void tap_show_result(){elementHelper.tap(btn_resultFilter);}
    public void tap_item_by_order(int i){
        System.out.println(i);
        elementHelper.tap(first_item);
    }
    public void tap_sepete_ekle(){elementHelper.tap(add_basket);}

    public void chooice_size(String string){
        System.out.println("Size:" + string);
        elementHelper.tap(btn_sizeS);
    }
    public void tap_sepetime_git(){elementHelper.tap(btn_goToBasket);}
}
