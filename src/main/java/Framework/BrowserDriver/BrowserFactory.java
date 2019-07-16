package Framework.BrowserDriver;

import Enums.Browser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    private static final Logger LOGGER = LogManager.getLogger(BrowserFactory.class.getName());

    public static WebDriver getDriver(Browser browserType) {

        WebDriver driver=null;

        switch (browserType) {
            case FIREFOX :
                LOGGER.info("Creating FirefoxDriver");
               driver = new FireFoxBrowserDriver().createDriver();
                break;
            case CHROME:
                LOGGER.info("Creating ChromeDriver");
                driver = new ChromeBrowserDriver().createDriver();
                break;


            default:
                throw new IllegalArgumentException("Cannot create driver for browser" + browserType);
        }

        return driver;
    }

}
