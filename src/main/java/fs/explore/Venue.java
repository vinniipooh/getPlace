package fs.explore;

public class Venue {

    private String ratingSignals;

    private Location location;

    private String ratingColor;

    private String allowMenuUrlEdit;

    private Contact contact;

    private String url;

    private String id;

    private Price price;

    private String verified;

    private String name;

    private Categories[] categories;

    private String rating;

    public String getRatingSignals ()
    {
        return ratingSignals;
    }

    public void setRatingSignals (String ratingSignals)
    {
        this.ratingSignals = ratingSignals;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getRatingColor ()
    {
        return ratingColor;
    }

    public void setRatingColor (String ratingColor)
    {
        this.ratingColor = ratingColor;
    }
    public String getAllowMenuUrlEdit ()
    {
        return allowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit (String allowMenuUrlEdit)
    {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    public Contact getContact ()
    {
        return contact;
    }

    public void setContact (Contact contact)
    {
        this.contact = contact;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Price getPrice ()
    {
        return price;
    }

    public void setPrice (Price price)
    {
        this.price = price;
    }

    public String getVerified ()
    {
        return verified;
    }

    public void setVerified (String verified)
    {
        this.verified = verified;
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

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }
}
