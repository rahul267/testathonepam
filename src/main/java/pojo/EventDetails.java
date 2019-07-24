package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDetails {

    public boolean isIs_past() {
        return is_past;
    }

    public EventDetails setIs_past(boolean is_past) {
        this.is_past = is_past;
        return this;
    }

    public String getDates() {
        return dates;
    }

    public EventDetails setDates(String dates) {
        this.dates = dates;
        return this;
    }

    private boolean is_past;
    private String dates;
}

