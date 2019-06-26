package Pages;

public class OpenMobileApp {

   private WebDriver driver;



    public OpenMobileApp(String appPackage , String appActivity , String appiumServer){
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

