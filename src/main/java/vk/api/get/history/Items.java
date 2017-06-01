package vk.api.get.history;

public class Items {
    private String id;

    private String body;

    private String from_id;

    private Geo geo;

    private String read_state;

    private String user_id;

    private String date;

    private String out;

    public String getId() {
        return id;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom_id() {
        return from_id;
    }

    public void setFrom_id(String from_id) {
        this.from_id = from_id;
    }

    public String getRead_state() {
        return read_state;
    }

    public void setRead_state(String read_state) {
        this.read_state = read_state;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", body = " + body + ", from_id = " + from_id + ", read_state = " + read_state + ", user_id = " + user_id + ", date = " + date + ", out = " + out + "]";
    }
}
