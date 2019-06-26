package Steps;

import Pages.OpenMobileApp;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.net.MalformedURLException;

public class SetUpEnvironment {

   private OpenMobileApp mobileApp ;

    @Given("I setup Mobile Evironment to open $appPackage $appActvity on $appiumServer")
    public void testSetUpEnvironment(String appPackage, String appActivity , String appiumServer)  {
        try {
            this.mobileApp = new OpenMobileApp(appPackage,appActivity,appiumServer);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Then("I Skip LogIn and goto event Page")
    public void openAppAndSkipLogin(){
        mobileApp.skipLogin();
    }



    @Then("I Open $event")
    public void openEvent(@Named("event") String event){
        mobileApp.searchForEvent();

    }


}
