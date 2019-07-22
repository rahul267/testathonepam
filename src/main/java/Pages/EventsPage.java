package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage {

    private WebDriver driver;
    private WebElement element;

    @FindBy(id = "new_event_btn")
    WebElement NewEventButton;

    @FindBy(xpath = "//input[@class= 'uui-form-element large ']")
    WebElement NewEventName;

    @FindBy(xpath = "//input[@name='start']")
    WebElement EventDayStart;
    @FindBy(xpath = "//input[@name='end']")
    WebElement EventDayEnd;

    @FindBy(xpath = "//input[@class= 'uui-form-element large ']")
    WebElement Next;


    public EventsPage() { }

    public EventsPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickEventButton()
    {
        NewEventButton.click();
    }

    public void fillTextTitle(String title)
    {
        NewEventName.sendKeys(title);
    }

    public void fillsuggestedURL(String url)
    {

    }
    public void fillEventDays(String title1 , String title2)
    {
        EventDayStart.sendKeys(title1);
        EventDayEnd.sendKeys(title2);
    }
    public void clickNext()
    {
       Next.click();
    }

    public void fillFirstEvent()
    {

    }



}
