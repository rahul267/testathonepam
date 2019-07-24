package Steps;

import mobileUtlity.MobileContext;
import mobileUtlity.MobileDriverWrapper;
import org.jbehave.core.annotations.*;

import java.net.MalformedURLException;

public class MobileSteps {

    private MobileDriverWrapper mobileDriver;

    @BeforeStories
    public void beforeStory() {
        mobileDriver = MobileContext.annotationConfigApplicationContext.getBean(MobileDriverWrapper.class);
    }

    @AfterStories
    public void afterStory() {
        if (mobileDriver != null)
            mobileDriver.close();
    }

    @Given("I Launch Application")
    public void launchApp() throws MalformedURLException {
        mobileDriver.launchApplication();
    }

    @Then("I click on Text button $text")
    public void clickOnButtonWithText(@Named("text") String text) {
        mobileDriver.clickOnButtonByText(text);
    }

    @Then("I click on Text View $text")
    public void clickOnTextViewWithText(@Named("text") String text) {
        mobileDriver.clickOnTextViewByText(text);
    }

    @Then("I click if button $text available wait for $time sec")
    public void clickOnButtonWithTextIfAvailable(@Named("text") String text,
                                                 @Named("time") long time) {
        mobileDriver.clickOnButtonByTextIfAvailable(text, time);
    }

    @Then("I click if TextView $text available wait for $time sec")
    public void clickOnTextViewWithTextIfAvailable(@Named("text") String text,
                                                 @Named("time") long time) {
        mobileDriver.clickOnTextViewByTextIfAvailable(text, time);
    }

    @Given("I close app")
    public void closeApp(){
        mobileDriver.closeApp();
    }

    @Given("I relaunch app")
    public void relaunchApp(){
        mobileDriver.relaunchApp();
    }
}
