package users;

public class UsersInfo {

    private String id;

    private String geoLocation;

    public UsersInfo(String id, String geoLocation) {
        this.id = id;
        this.geoLocation = geoLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }
}
