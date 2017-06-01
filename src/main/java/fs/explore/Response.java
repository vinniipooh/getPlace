package fs.explore;

public class Response {

    private String totalResults;

    private String headerLocationGranularity;

    private String query;

    private String suggestedRadius;

    private String headerLocation;

    private String headerFullLocation;

    private Groups[] groups;

    private Warning warning;

    public String getTotalResults ()
    {
        return totalResults;
    }

    public void setTotalResults (String totalResults)
    {
        this.totalResults = totalResults;
    }

    public String getHeaderLocationGranularity ()
    {
        return headerLocationGranularity;
    }

    public void setHeaderLocationGranularity (String headerLocationGranularity)
    {
        this.headerLocationGranularity = headerLocationGranularity;
    }

    public String getQuery ()
    {
        return query;
    }

    public void setQuery (String query)
    {
        this.query = query;
    }

    public String getSuggestedRadius ()
    {
        return suggestedRadius;
    }

    public void setSuggestedRadius (String suggestedRadius)
    {
        this.suggestedRadius = suggestedRadius;
    }

    public String getHeaderLocation ()
    {
        return headerLocation;
    }

    public void setHeaderLocation (String headerLocation)
    {
        this.headerLocation = headerLocation;
    }

    public String getHeaderFullLocation ()
    {
        return headerFullLocation;
    }

    public void setHeaderFullLocation (String headerFullLocation)
    {
        this.headerFullLocation = headerFullLocation;
    }

    public Groups[] getGroups ()
    {
        return groups;
    }

    public void setGroups (Groups[] groups)
    {
        this.groups = groups;
    }

    public Warning getWarning ()
    {
        return warning;
    }

    public void setWarning (Warning warning)
    {
        this.warning = warning;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [totalResults = "+totalResults+", headerLocationGranularity = "+headerLocationGranularity+", query = "+query+", suggestedRadius = "+suggestedRadius+", headerLocation = "+headerLocation+", headerFullLocation = "+headerFullLocation+", groups = "+groups+", warning = "+warning+"]";
    }
}
