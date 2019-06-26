package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenMobileApp {

   private WebDriver driver;



    public OpenMobileApp(String appPackage , String appActivity , String appiumServer) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "4.4.2");
        capabilities.setCapability("deviceName","Emulator");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("appPackage", appPackage);

        capabilities.setCapability("appActivity",appActivity);

        driver = new RemoteWebDriver(new URL(appiumServer), capabilities);
    }


}

