package vk.api.get.history;

public class Response
{
    private String count;

    private Items[] items;

    private String out_read;

    private String in_read;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
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
        return "ClassPojo [count = "+count+", items = "+items+", out_read = "+out_read+", in_read = "+in_read+"]";
    }
}
