package vk.api.get.message;

public class Items
{
    private String id;

    private String body;

    private String title;

    private String read_state;

    private String user_id;

    private String date;

    private String out;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getRead_state ()
    {
        return read_state;
    }

    public void setRead_state (String read_state)
    {
        this.read_state = read_state;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getOut ()
    {
        return out;
    }

    public void setOut (String out)
    {
        this.out = out;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", body = "+body+", title = "+title+", read_state = "+read_state+", user_id = "+user_id+", date = "+date+", out = "+out+"]";
    }
}
