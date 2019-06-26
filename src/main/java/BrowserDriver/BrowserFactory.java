package BrowserDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    private static final Logger LOGGER = LogManager.getLogger(BrowserFactory.class.getName());

    public static WebDriver getDriver(String browserType) {

        WebDriver driver=null;

        switch (browserType) {
            case "firefox":
                LOGGER.info("Creating FirefoxDriver");
               driver = new FireFoxBrowserDriver().createDriver();
                break;
            case "chrome":
                LOGGER.info("Creating ChromeDriver");
                driver = new ChromeBrowserDriver().createDriver();
                break;
            default:
                throw new IllegalArgumentException("Cannot create driver for browser" + browserType);
        }

        return driver;
    }

}
