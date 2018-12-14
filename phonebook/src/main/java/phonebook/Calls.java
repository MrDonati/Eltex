package phonebook;

import java.util.LinkedList;

abstract class Calls
{
    private int id;
    private String time;

    @Override
    public String toString()
    {
        return "Calls{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }

    public Calls(int id, String time)
    {
        this.id = id;
        this.time = time;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }
}
