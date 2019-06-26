package Steps;

import Pages.OpenMobileApp;

public class SetUpEnvironment {

   private OpenMobileApp mobileApp ;

    @Given("I setup Mobile Evironment to open $appPackage $appActvity on $appiumServer")
    public SetUpEnvironment(String appPackage, String appActivity , String appiumServer){
        this.mobileApp = new OpenMobileApp(appPackage,appActivity,appiumServer);
    }
}
