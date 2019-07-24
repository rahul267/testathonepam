package Steps.ApiTests;

import EnvironmentSetup.RequestSpecificationFactory.RequestSpecificationFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pojo.EventPageDetails;


import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetEventPageDetailsSteps {

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
        System.setProperty("jsse.enableSNIExtension", "false");
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }


   @When("I make a get request to get Eventpage details for eventId<eventId>")
    public Response invokeEventPageDetails(@Named("eventId") int eventId) {
        log.info("calling get events page details");
        setUp();
        response= given().
                spec(req).
                contentType("application/json").
                pathParam("event_id",eventId).
                get("/{event_id}/pages/details");
        return response;
    }

    @Then("validate the response having type<type>,title<title>,eventTitle<eventTitle>,eventUrl<eventUrl>,eventDate<eventDate>,isPast<isPast>")
    public void validateEventDetailsResponse(@Named("type") String type, @Named("title") String title, @Named("eventTitle") String eventTitle, @Named("eventUrl") String eventUrl, @Named("eventDate") String eventDate, @Named("isPast") String isPast) {
        log.info("converting event details page response to pojo");
        List<EventPageDetails> eventsPageDetails = Arrays.asList(response.as(EventPageDetails[].class));
        EventPageDetails details = eventsPageDetails.get(0);
        log.info("Validating event page details Response");
        Assertions.assertThat(details.getType()).contains(type);
        Assertions.assertThat(details.getProperties().getText().get(0).getType()).contains(title);
        Assertions.assertThat(details.getProperties().getText().get(0).getText()).contains(eventTitle);
        Assertions.assertThat(details.getProperties().getEvent_url()).contains(eventUrl);
        Assertions.assertThat(details.getProperties().getDetails().getDates()).contains(eventDate);
        Assertions.assertThat(details.getProperties().getDetails().isIs_past()).isFalse();
    }

    @When("I make a get request to get Event proposed talks for eventId<eventId>")
    public Response invokeGetEventProposedTalks(@Named("eventId") String eventId) {
        log.info("calling get events proposed Talks details");
        setUp();
        response= given().
                spec(req).
                contentType("application/json").
                pathParam("event_id",eventId).
                get("/{event_id}/pages/proposed-talks");
        return response;
    }

    @Then("validate the proposed talks response having type<type>,title<title>,eventTitle<eventTitle>,eventUrl<eventUrl>,eventDate<eventDate>,isPast<isPast>")
    public void validateEventProposedTalksResponse(@Named("type") String type, @Named("title") String title, @Named("eventTitle") String eventTitle, @Named("eventUrl") String eventUrl, @Named("eventDate") String eventDate, @Named("isPast") String isPast) {
        log.info("converting proposed talks response to pojo");
        List<EventPageDetails> eventProposedTalks = Arrays.asList(response.as(EventPageDetails[].class));
        EventPageDetails proposedTalks = eventProposedTalks.get(0);
        log.info("Validating event proposed talks Response");
        /*Assertions.assertThat(proposedTalks.getType()).contains(type);
        Assertions.assertThat(proposedTalks.getProperties().getText().get(0).getType()).contains(title);
        Assertions.assertThat(proposedTalks.getProperties().getText().get(0).getText()).contains(eventTitle);
        Assertions.assertThat(proposedTalks.getProperties().getEvent_url()).contains(eventUrl);
        Assertions.assertThat(proposedTalks.getProperties().getDetails().getDates()).contains(eventDate);
        Assertions.assertThat(proposedTalks.getProperties().getDetails().isIs_past()).isFalse();*/
    }

    @When("I make a get request to get Event agenda properties for eventId<eventId>")
    public Response invokeGetEventAgenda(@Named("eventId") String eventId) {
        log.info("calling get events agenda  details");
        setUp();
        response= given().
                spec(req).
                contentType("application/json").
                pathParam("event_id",eventId).
                get("/{event_id}/pages/agenda");
        return response;
    }

    @Then("validate the agenda properties response having type<type>,textType<textType>,textText<textText>")
    public void validateEventAgendaDetails(@Named("type") String type, @Named("textType") String textType, @Named("textText") String textText) {
        log.info("converting agenda details response to pojo");
        List<EventPageDetails> eventAgenda = Arrays.asList(response.as(EventPageDetails[].class));
        EventPageDetails agenda = eventAgenda.get(0);
        log.info("Validating event agenda Response");
        Assertions.assertThat(agenda.getType()).contains(type);
        Assertions.assertThat(agenda.getProperties().getText().get(0).getType()).contains(textType);
        Assertions.assertThat(agenda.getProperties().getText().get(0).getText()).contains(textText);
       /* Assertions.assertThat(agenda.getProperties().getEvent_url()).contains(eventUrl);
        Assertions.assertThat(agenda.getProperties().getDetails().getDates()).contains(eventDate);
        Assertions.assertThat(agenda.getProperties().getDetails().isIs_past()).isFalse();*/
    }

    @When("I make a get request to get Event speakers details for eventId<eventId>")
    public Response invokeGetEventSpeakers(@Named("eventId") String eventId) {
        log.info("calling get events agenda  details");
        setUp();
        response= given().
                spec(req).
                contentType("application/json").
                pathParam("event_id",eventId).
                get("/{event_id}/pages/speakers");
        return response;
    }

    @Then("validate the speakers deatils response having type<type>,textType<textType>,textText<textText>")
    public void validateEventSpeakersResponse(@Named("type") String type, @Named("textType") String textType, @Named("textText") String textText) {
        log.info("converting event speakers response to pojo");
        List<EventPageDetails> eventSpeakers = Arrays.asList(response.as(EventPageDetails[].class));
        EventPageDetails speakers = eventSpeakers.get(0);
        log.info("Validating event speakers Response");
        Assertions.assertThat(speakers.getType()).contains(type);
        Assertions.assertThat(speakers.getProperties().getText().get(0).getType()).contains(textType);
        Assertions.assertThat(speakers.getProperties().getText().get(0).getText()).contains(textText);
       /* Assertions.assertThat(agenda.getProperties().getEvent_url()).contains(eventUrl);
        Assertions.assertThat(agenda.getProperties().getDetails().getDates()).contains(eventDate);
        Assertions.assertThat(agenda.getProperties().getDetails().isIs_past()).isFalse();*/
    }

    @Then("validate the status code is <statusCode>")
    public void validateStatusCode(@Named("statusCode") int statusCode) {
        log.info("Status code of get All events is"+statusCode);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }
}
