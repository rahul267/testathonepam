package EnvironmentSetup.RequestSpecificationFactory;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import Utilities.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DevelopmentEnv implements RequestSpecificationAll{


    @Override
    public RequestSpecification create() {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri ("http://10.157.146.21:25003/asset-management-api");
       // builder.setBaseUri ("http://fcrm.dev.mastercard.net:25003/asset-management-api");
        //builder.setBaseUri ("http://10.157.148.103:25003/asset-management-api/account-range-management");
        builder.addFilter(new ResponseLoggingFilter().logResponseTo(Log.getLogStream())) ;
        builder.addFilter(new RequestLoggingFilter().logRequestTo(Log.getLogStream())) ;
        RequestSpecification requestSpec = builder.build();
        return requestSpec ;
    }

    @Override
    public Properties getRequiredProperty() throws IOException {
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("config/env.properties");
        prop.load(stream);
        return prop ;

    }


}
