package Framework.BrowserDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowserDriver implements BrowserDriver {
    private static final Logger LOGGER = LogManager.getLogger(FireFoxBrowserDriver.class.getName());
    public static final String FIREFOX_DRIVER_FILEPATH = System.getProperty("user.dir") + "/src/main/resources/driver-executables/geckodriver.exe";

    @Override
    public WebDriver createDriver() {
        System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_FILEPATH);
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        return driver;
    }

}
