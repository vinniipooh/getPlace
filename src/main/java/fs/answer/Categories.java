package fs.answer;

public class Categories
{
    private String id;

    private String primary;

    private String name;

    private String shortName;

    private String pluralName;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
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
        return "ClassPojo [id = "+id+", primary = "+primary+", name = "+name+", shortName = "+shortName+", pluralName = "+pluralName+"]";
    }
}