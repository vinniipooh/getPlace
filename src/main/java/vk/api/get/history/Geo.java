package vk.api.get.history;

public class Geo
{
    private Place place;

    private String type;

    private String coordinates;

    public Place getPlace ()
    {
        return place;
    }

    public void setPlace (Place place)
    {
        this.place = place;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getCoordinates ()
    {
        return coordinates;
    }

    public void setCoordinates (String coordinates)
    {
        this.coordinates = coordinates;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [place = "+place+", type = "+type+", coordinates = "+coordinates+"]";
    }
}
