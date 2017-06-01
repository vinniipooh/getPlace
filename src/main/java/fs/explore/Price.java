package fs.explore;

public class Price {

    private String message;

    private String tier;

    private String currency;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getTier ()
    {
        return tier;
    }

    public void setTier (String tier)
    {
        this.tier = tier;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", tier = "+tier+", currency = "+currency+"]";
    }
}
