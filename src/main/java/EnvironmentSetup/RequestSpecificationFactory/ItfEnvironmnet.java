package EnvironmentSetup.RequestSpecificationFactory;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ItfEnvironmnet implements RequestSpecificationAll {
    @Override
    public RequestSpecification create() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri ("http://fcrm.dev.mastercard.net:25003/asset-management-api");
        //builder.addParam("parameter1", "parameterValue");
        //builder.addHeader("header1", "headerValue");
        RequestSpecification requestSpec = builder.build();
        return requestSpec ;
    }
    @Override
    public Properties getRequiredProperty() throws IOException {
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("FCRMDev2.properties");
        prop.load(stream);
        return prop ;

    }
}
