package Framework.BrowserDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ChromeBrowserDriver implements BrowserDriver {
    private static final Logger log = LoggerFactory.getLogger(ChromeBrowserDriver.class.getName());
    public static final String CHROME_DRIVER_FILEPATH = System.getProperty("user.dir") + "/src/main/resources/driver-executables/chromedriver.exe";

    @Override
    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILEPATH);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(chromeOptions);
        return driver;
    }


}
