package vk.api.get.dialog;

public class Items
{
    private Message message;

    private String out_read;

    private String in_read;

    public Message getMessage ()
    {
        return message;
    }

    public void setMessage (Message message)
    {
        this.message = message;
    }

    public String getOut_read ()
    {
        return out_read;
    }

    public void setOut_read (String out_read)
    {
        this.out_read = out_read;
    }

    public String getIn_read ()
    {
        return in_read;
    }

    public void setIn_read (String in_read)
    {
        this.in_read = in_read;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", out_read = "+out_read+", in_read = "+in_read+"]";
    }
}
