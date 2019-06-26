package Steps;

import Pages.OpenMobileApp;
import org.jbehave.core.annotations.Given;

import java.net.MalformedURLException;

public class SetUpEnvironment {

   private OpenMobileApp mobileApp ;

    @Given("I setup Mobile Evironment to open $appPackage $appActvity on $appiumServer")
    public void testSetUpEnvironment(String appPackage, String appActivity , String appiumServer) throws MalformedURLException {
        this.mobileApp = new OpenMobileApp(appPackage,appActivity,appiumServer);
    }
}
