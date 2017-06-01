package fs.explore;

public class Items {

    private String referralId;

    private Tips[] tips;

    private Venue venue;

    public String getReferralId ()
    {
        return referralId;
    }

    public void setReferralId (String referralId)
    {
        this.referralId = referralId;
    }

    public Tips[] getTips ()
    {
        return tips;
    }

    public void setTips (Tips[] tips)
    {
        this.tips = tips;
    }

    public Venue getVenue ()
    {
        return venue;
    }

    public void setVenue (Venue venue)
    {
        this.venue = venue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [referralId = "+referralId+", tips = "+tips+", venue = "+venue+"]";
    }
}
