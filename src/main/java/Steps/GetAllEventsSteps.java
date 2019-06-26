package Steps;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static io.restassured.RestAssured.given;

import java.util.Arrays;
import java.util.List;

import EnvironmentSetup.RequestSpecificationFactory.RequestSpecificationFactory;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Posts;

public class GetAllEventsSteps {

    RequestSpecificationFactory requestSpecificationFactory;
    RequestSpecification req;
    String envType = System.getProperty("envType");
    static Response response;

    private static final Logger log = LogManager.getLogger();

    protected void setUp() {
        requestSpecificationFactory = new RequestSpecificationFactory();
        log.info("environment setup is doing for "+envType+" environment");
        req = requestSpecificationFactory.getSpec(envType).create();
        log.info("creating the required request");
    }


    @When("I make a get Request to get all events")
    public void getUserPosts() {
         log.info("calling get all events api method");
        setUp();
        response= given().
                spec(req).contentType("application/json").
                get();

    }
   @Then("validate the response having <eventTitle>,<eventId>,<eventDate>,<eventTime>")
    public void thenValidateTheAllEventsResponse(String eventTitle,String eventId,String eventDate,String  eventTime ) {

    }


}
