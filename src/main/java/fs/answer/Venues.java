package fs.answer;

public class Venues
{
    private Location location;

    private Contact contact;

    private String id;

    private String name;

    private Categories[] categories;

    private String hasPerk;

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public Contact getContact ()
    {
        return contact;
    }

    public void setContact (Contact contact)
    {
        this.contact = contact;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Categories[] getCategories ()
    {
        return categories;
    }

    public void setCategories (Categories[] categories)
    {
        this.categories = categories;
    }

    public String getHasPerk ()
    {
        return hasPerk;
    }

    public void setHasPerk (String hasPerk)
    {
        this.hasPerk = hasPerk;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [location = "+location+", contact = "+contact+", id = "+id+", name = "+name+", categories = "+categories+", hasPerk = "+hasPerk+"]";
    }
}
