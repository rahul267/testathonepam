package EnvironmentSetup.RequestSpecificationFactory;

public class RequestSpecificationFactory {
    public RequestSpecificationAll getSpec(String envType){
        if(envType == null){
            return new DevelopmentEnv() ;
        }
        if(envType.equalsIgnoreCase("DEV")){
            return new DevelopmentEnv() ;
        } else if(envType.equalsIgnoreCase("STAGE")){
            return new StageEnvironmnet() ;
        }
        return null;
    }

}
