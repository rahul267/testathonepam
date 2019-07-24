package Steps.ApiTestSteps;


import io.restassured.RestAssured;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static io.restassured.RestAssured.given;

import java.util.List;

import EnvironmentSetup.RequestSpecificationFactory.RequestSpecificationFactory;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.AllEvents;
import pojo.Events;

public class GetAllEventsSteps {

    RequestSpecificationFactory requestSpecificationFactory;
    RequestSpecification req;
    String envType = System.getProperty("envType");
    static Response response;

    private static final Logger log = LoggerFactory.getLogger(GetAllEventsSteps.class);

    protected void setUp() {
        requestSpecificationFactory = new RequestSpecificationFactory();
        log.info("environment setup is doing for "+envType+" environment");
        req = requestSpecificationFactory.getSpec(envType).create();
        log.info("creating the required request");
        System.setProperty("jsse.enableSNIExtension", "false");
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @When("I make a get Request to get all events")
    public Response getUserPosts() {
         log.info("calling get all events api method");
        setUp();
        response= given().
                spec(req).contentType("application/json").
                get();
        return response;

    }

    @Then("validate the getEvents status code is <statusCode>")
    public void validateSuccessGetStstusCode(@Named("statusCode") int statusCode) {
        log.info("Status code of get All events is"+statusCode);
      Assertions.assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }

    @Then("validate the success response having <eventTitle>,<eventId>,<eventDate>,<eventisPast>")
    public void validateGetEventsSuccessResponse(@Named("eventTitle") String eventTitle, @Named("eventId") String eventId, @Named("eventDate") String eventDate, @Named("eventisPast") boolean isPast) {
        log.info("Converting Response to pojo");
        AllEvents allEvents = response.as(AllEvents.class);
       List<Events> events = allEvents.getEvents();
       for (Events event:events){
           if (event.getTitle() == eventTitle ){
               log.info("validating event details of"+eventTitle);
               Assertions.assertThat(event.getId()).isEqualTo(eventId);
               Assertions.assertThat(event.getDates()).isEqualTo(eventDate);
               Assertions.assertThat(event.isIs_past()).isEqualTo(isPast);
           }
       }

    }
}
