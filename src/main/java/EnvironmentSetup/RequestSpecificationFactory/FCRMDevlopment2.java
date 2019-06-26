package EnvironmentSetup.RequestSpecificationFactory;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import Utilities.Log;

import java.io.IOException;
import java.util.Properties;

public class FCRMDevlopment2 implements RequestSpecificationAll {
    @Override
    public RequestSpecification create() {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        //builder.setBaseUri("http://10.157.148.103:25003/asset-management-api");
       try {
           builder.setBaseUri(this.getRequiredProperty().getProperty("url"));
       }
       catch (Exception IOException){}
        builder.addFilter(new ResponseLoggingFilter().logResponseTo(Log.getLogStream()));
        builder.addFilter(new RequestLoggingFilter().logRequestTo(Log.getLogStream()));
        RequestSpecification requestSpec = builder.build();
        return requestSpec;
    }

    @Override
    public Properties getRequiredProperty() throws IOException {
        Properties prop = new Properties();
        prop.load(getClass().getClassLoader().getResourceAsStream("config/FCRMDev2.properties"));
        return prop;

    }
}

