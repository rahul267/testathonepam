package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AdminPage {
    private String DEFAULT_APP_URL = "https://autorqa.events.epam.com/autoqa-login?email=auto_event_owner_public@epam.com&return_url=/";
    private WebDriver driver;
    private WebElement element;


    @FindBy(xpath ="//div[@class = 'evnt-profile-photo']")
    WebElement ProfilePhoto ;

    @FindBy(xpath ="//[@href = 'admin']")
    WebElement AdminLink ;

    public AdminPage() {
    }

    public AdminPage(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void goToApp()
    {
        driver.get(DEFAULT_APP_URL);

    }

    public void goToAdmin()  {

        ProfilePhoto.click();
        AdminLink.click();
    }




}
