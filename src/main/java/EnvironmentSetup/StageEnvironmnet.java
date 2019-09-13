package EnvironmentSetup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StageEnvironmnet implements RequestSpecificationAll {

    @Override
    public RequestSpecification create() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri ("https://autorqa.events.epam.com/api/v2/events");
        //builder.addParam("parameter1", "parameterValue");
        //builder.addHeader("header1", "headerValue");
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
