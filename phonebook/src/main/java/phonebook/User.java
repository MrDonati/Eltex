package phonebook;

import java.util.LinkedList;

public abstract class User
{
    private String Name;
    private String Phone;
    private LinkedList<Calls> arry = new LinkedList<>();

    @Override
    public String toString()
    {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    User(String name, String phone)
    {
        setName(name);
        setPhone(phone);
    }

    void addPrivateCall(int id, int time, User cdpn, User cgpn )
    {
//        Calls tmp = new Calls<User>(id, time, cdpn, cgpn);
  //      arry.add(tmp);
    }

    void addConference()
    {

    }

    void showCalls()
    {
        String t;
        for (Calls i : arry)
        {
            t = i.toString();
            System.out.println(t);

        }
    }

    String getName()
    {
        return Name;
    }

    private void setName(String name)
    {
        Name = name;
    }

    String getPhone()
    {
        return Phone;
    }

    private void setPhone(String phone)
    {
        Phone = phone;
    }


}
