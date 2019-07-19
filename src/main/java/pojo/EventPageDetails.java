package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventPageDetails {

    private String type;
    private EventProperties properties;

    public String getType() {
        return type;
    }

    public EventPageDetails setType(String type) {
        this.type = type;
        return this;
    }

    public EventProperties getProperties() {
        return properties;
    }

    public EventPageDetails setProperties(EventProperties properties) {
        this.properties = properties;
        return this;
    }
}
