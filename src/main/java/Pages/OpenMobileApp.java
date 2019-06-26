package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenMobileApp {

   private WebDriver driver;



    public OpenMobileApp(String appPackage , String appActivity , String appiumServer) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","42109deca85184cd");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("appPackage", appPackage);

        capabilities.setCapability("appActivity",appActivity);

        driver = new AndroidDriver(new URL(appiumServer), capabilities);
    }


    public void skipLogin(){
        driver.findElement(By.name("GET STARTED")).click();
    }

    public void searchForEvent(){
        assert driver.findElement(By.name("Event")) != null;

    }
}

