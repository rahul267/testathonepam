package Steps;

import Pages.GooglePage;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySteps {

    private GooglePage page ;

    public MySteps () {
        System.setProperty("webdriver.firefox.marionette","D:\\GeckoDriver.exe");
        WebDriver driver = new FirefoxDriver() ;
        page = new GooglePage(driver);

    }



    @When("I type query as \"$keyword\"")
    public void searchGoogle(String keyword) {
        page.searchOnGoogle(keyword);
    }

    @Then("I submit")
    public void submit() throws Exception {
        page.submitSearch();
    }

    @Then("I should see title \"$keyword\"")
    public void titleShouldContain(String keyword) {
        Assert.assertEquals(keyword, page.getTitle());
    }
}
