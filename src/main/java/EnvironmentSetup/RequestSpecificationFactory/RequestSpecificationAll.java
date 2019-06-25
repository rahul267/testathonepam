package EnvironmentSetup.RequestSpecificationFactory;

import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.Properties;

public interface RequestSpecificationAll {
    RequestSpecification create() ;
    Properties getRequiredProperty() throws IOException;
}

