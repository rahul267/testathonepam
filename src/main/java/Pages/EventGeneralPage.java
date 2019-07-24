package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventGeneralPage {

    private WebDriver driver;
    private WebElement element;

    @FindBy(xpath = "//div[@class='popup-heading']")
    WebElement EventPageHeading;

    @FindBy(xpath = "//i[@class= 'fa fa-check']")
    WebElement selectDefaultTemplate;

    @FindBy(xpath = "//button[@class= 'uui-button lime-green submit-button ']")
    WebElement createEvent;


    public EventGeneralPage() { }

    public EventGeneralPage(WebDriver driver) {

        this.driver = driver;

        if(EventPageHeading.getText().equals("Choose event template"))
        {
            PageFactory.initElements(driver, this);
        }
    }

    public void CompleteCreateEvent()
    {
        selectDefaultTemplate.click();
        createEvent.click();
    }
}
