package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {
    private int id;
    private String title;
    private boolean is_past;
    private String dates;
    private String url;

    public int getId() {
        return id;
    }

    public Events setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Events setTitle(String title) {
        this.title = title;
        return this;
    }

    public boolean isIs_past() {
        return is_past;
    }

    public Events setIs_past(boolean is_past) {
        this.is_past = is_past;
        return this;
    }

    public String getDates() {
        return dates;
    }

    public Events setDates(String dates) {
        this.dates = dates;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Events setUrl(String url) {
        this.url = url;
        return this;
    }





}
