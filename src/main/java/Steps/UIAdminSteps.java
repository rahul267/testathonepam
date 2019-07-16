package Steps;

import Framework.BrowserDriver.BrowserFactory;
import Enums.Browser;
import Pages.AdminPage;
import Pages.EventsPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;

public class UIAdminSteps {
    WebDriver driver;
    AdminPage adminPage;
    EventsPage eventsPage ;

    public UIAdminSteps() {
        driver = BrowserFactory.getDriver(Browser.FIREFOX);
        adminPage = new AdminPage(driver);
    }


    @Given("i login to Login to events platform as Event Owner Internal")
    public void givenILoginToLoginToEventsPlatformAsEventOwnerInternal() {
        adminPage.goToApp();

    }


    @Given("Click on Profile photo at the top right corner")
    public void givenClickOnProfilePhotoAtTheTopRightCorner() {
        adminPage.goToAdmin();
    }

    @Then("Click 'Admin Area'\"")
    public void thenClickAdminArea() {


    }

    @Given("i  Click 'New Event' button")
    public void givenIClickNewEventButton() {
       eventsPage.clickEventButton();
    }

    @Then("Set any title")
    public void thenSetAnyTitle() {
        eventsPage.fillTextTitle("bbhbjb");

    }


    @Then("Set both start and end dates in the future (start and end dates should be equal)")
    public void thenSetBothStartAndEndDatesInTheFutureStartAndEndDatesShouldBeEqual() {
       eventsPage.fillEventDays("6-26-2019" , "6-26-2019");
    }

    @Then("Set Public privacy setting")
    public void thenSetPublicPrivacySetting() {

    }

    @Then("Click Next")
    public void thenClickNext() {
        eventsPage.clickNext();

    }
}
