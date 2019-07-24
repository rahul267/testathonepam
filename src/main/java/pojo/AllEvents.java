package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllEvents {

    private List<Events>  events;

    public List<Events> getEvents() {
        return events;
    }

    public AllEvents setEvents(List<Events> events) {
        this.events = events;
        return this;
    }
}
