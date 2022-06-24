package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class elementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public elementHelper(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
    }

    public MobileElement findElement(By key){
        return (MobileElement) driver.findElement(key);
    }
    public void tap(By key){
        findElement(key).click();
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }
    public void checkElementVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }
    public String getText(By key){
        return findElement(key).getText();
    }
    public boolean checkElementText(By key, String text){
        if(getText(key).equals(text)){return true;}
        else return false;
    }
    public void checkElementOnList(By key, String text){
        boolean find = false;
        List<MobileElement> elements = (List<MobileElement>) findElement(key);
        for(MobileElement element : elements){
            if (element.getText().contains(text)) {
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }
    public void clickElementOnList(By key, String text){
        boolean find = false;
        List<MobileElement> elements = (List<MobileElement>) findElement(key);
        for(MobileElement element : elements){
            if (element.getText().contains(text)) {
                element.click();
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }
    public void sendKeyElementOnList(By key, String text, String input){
        boolean find = false;
        List<MobileElement> elements = (List<MobileElement>) findElement(key);
        for(MobileElement element : elements){
            if (element.getText().contains(text)) {
                element.sendKeys(input);
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }

    public void scrollTo(String string){
        TouchAction action = new TouchAction(driver);
        action.press(new PointOption().withCoordinates(200, 1210)).moveTo(new PointOption().withCoordinates(200, 800)).release().perform();
    }
}
