package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventText {


    private String type;
    private String text;

    public String getType() {
        return type;
    }

    public EventText setType(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public EventText setText(String text) {
        this.text = text;
        return this;
    }



}
