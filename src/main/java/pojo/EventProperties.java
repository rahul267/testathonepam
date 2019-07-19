package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventProperties {

    private List<EventText> text;
    private EventDetails details;
    private String event_url;
    private String url;

    public String getEvent_url() {
        return event_url;
    }

    public EventProperties setEvent_url(String event_url) {
        this.event_url = event_url;
        return this;
    }

    public List<EventText> getText() {
        return text;
    }

    public EventProperties setText(List<EventText> text) {
        this.text = text;
        return this;
    }

    public EventDetails getDetails() {
        return details;
    }

    public EventProperties setDetails(EventDetails details) {
        this.details = details;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public EventProperties setUrl(String url) {
        this.url = url;
        return this;
    }






}
