package fs.categories;

public class Categories
{
    private String id;

    private String name;

    private PodCategories[] categories;

    private String shortName;

    private String pluralName;

    public PodCategories[] getCategories() {
        return categories;
    }

    public void setCategories(PodCategories[] categories) {
        this.categories = categories;
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

    public String getShortName ()
    {
        return shortName;
    }

    public void setShortName (String shortName)
    {
        this.shortName = shortName;
    }

    public String getPluralName ()
    {
        return pluralName;
    }

    public void setPluralName (String pluralName)
    {
        this.pluralName = pluralName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", shortName = "+shortName+", pluralName = "+pluralName+"]";
    }
}