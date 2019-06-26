package EnvironmentSetup.RequestSpecificationFactory;

public class RequestSpecificationFactory {
    public RequestSpecificationAll getSpec(String envType){
        if(envType == null){
            return new DevelopmentEnv() ;
        }
        if(envType.equalsIgnoreCase("DEV")){
            return new DevelopmentEnv() ;

        } else if(envType.equalsIgnoreCase("ITF")){
            return new ItfEnvironmnet() ;

        } else if(envType.equalsIgnoreCase("STAGE")){
            return new StageEnvironmnet() ;
        }
        else if(envType.equalsIgnoreCase("FCRM2")){
            return new FCRMDevlopment2() ;
        }

        return null;
    }

}
