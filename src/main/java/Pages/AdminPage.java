package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AdminPage {
    private String DEFAULT_APP_URL = "https://autorqa.events.epam.com/autoqa-login?email=auto_event_owner_public@epam.com&return_url=/";
    private WebDriver driver;
    private WebElement element;
   private WebDriverWait wait ;


    @FindBy(how = How.XPATH, xpath ="//div[@class = 'evnt-profile-photo']")
    WebElement ProfilePhoto ;

    @FindBy(xpath ="//a[@class='dropdown-item admin-icon']")
    WebElement AdminLink ;

    public AdminPage() {
        WebDriverWait wait = new WebDriverWait(driver,30) ;
    }

    public AdminPage(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait =  new WebDriverWait (driver, 20);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void goToApp()
    {
        driver.get(DEFAULT_APP_URL);

    }

    public void goToAdmin()  {

        wait.until(ExpectedConditions.visibilityOf(ProfilePhoto)) ;
        ProfilePhoto.click();
        wait.until(ExpectedConditions.visibilityOf(AdminLink)) ;
        AdminLink.click();
    }




}
