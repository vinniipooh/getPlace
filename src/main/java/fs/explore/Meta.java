package fs.explore;

public class Meta {

    private String requestId;

    private String code;

    public String getRequestId ()
    {
        return requestId;
    }

    public void setRequestId (String requestId)
    {
        this.requestId = requestId;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [requestId = "+requestId+", code = "+code+"]";
    }
}
