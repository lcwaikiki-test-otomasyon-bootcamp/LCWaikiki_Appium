package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driverFactory {
    static AppiumDriver driver;
    static DesiredCapabilities capabilities;
    public static AppiumDriver initialize_Driver(String browser) {
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")) {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("app", "C:\\Users\\ksaribardak.OFFICE\\IdeaProjects\\LCWaikiki_Appium\\src\\main\\resources\\lc-waikiki-3-3-30.apk");
            //apabilities.setCapability("appPackage", "");
            capabilities.setCapability("appWaitActivity", "com.lcwaikiki.android.ui.*");
            capabilities.setCapability("fullReset", true);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        }
        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int impWait = 10;
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }


}