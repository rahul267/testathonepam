package Steps;

import Framework.BrowserDriver.BrowserFactory;
import Enums.Browser;
import Pages.AdminPage;
import Pages.EventsPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIAdminSteps {
    WebDriver driver;
    AdminPage adminPage;
    EventsPage eventsPage =new EventsPage(driver) ;

    public UIAdminSteps() { }


    @Given("i login to Login to events platform as Event Owner Internal")
    public void givenILoginToLoginToEventsPlatformAsEventOwnerInternal() {
        driver = BrowserFactory.getDriver(Browser.CHROME);
        adminPage = new AdminPage(driver);
        adminPage.goToApp();
        }

    @Given("Click on Profile photo at the top right corner with Admin")
    public void givenClickOnProfilePhotoAtTheTopRightCornerWithAdmin() {
        adminPage.goToAdmin();
    }

    @Then("Click 'Admin Area'\"")
    public void thenClickAdminArea() {
        }

    @Given("i  Click 'New Event' button")
    public void givenIClickNewEventButton() {
        eventsPage = new EventsPage(driver) ;
        eventsPage.clickEventButton();
    }


    @Then(" Set any title")
    public void thenSetAnyTitle() {
        eventsPage.fillTextTitle("bbhbjb");
    }

    @Then(" Set both start and end dates in the future (start and end dates should be equal)")
    public void thenSetBothStartAndEndDatesInTheFuturestartAndEndDatesShouldBeEqual() {
        eventsPage.fillEventDays("6-26-2039" , "6-26-2039");
    }

    @Then("Set Empty Template")
    public void thenSetEmptyTemplate() {

    }

    @Then("Click Create Event\"")
    public void thenClickCreateEvent() {
        eventsPage.clickNext();
    }
    @Then("Set Public privacy setting")

    public void thenSetPublicPrivacySetting() {
        // PENDING
    }

    @Then("Click Next")

    public void thenClickNext() {
        // PENDING
    }
}
