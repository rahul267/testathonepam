package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EventTemplateChooser {


        private WebDriver driver;
        private WebElement element;

        @FindBy(xpath = "//div[@class='popup-heading']")
        WebElement EventPageHeading;

        @FindBy(xpath = "//i[@class= 'fa fa-check']")
        WebElement selectDefaultTemplate;

        @FindBy(xpath = "//button[@class= 'uui-button lime-green submit-button ']")
        WebElement createEvent;


        public EventTemplateChooser() { }

        public EventTemplateChooser(WebDriver driver) {

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
           // return new EventGeneralPage() ;
        }




        }

