package phonebook;

import java.util.LinkedList;

class PhoneBook
{
    private LinkedList<User> arry = new LinkedList<>();

    void addPU(String Name, String phone, String Gender)
    {
        User tmp = new PU(Name, phone, Gender);
        arry.add(tmp);
    }

    void addUrU(String Name, String phone, String INN)
    {
        User tmp = new UrU(Name, phone, INN);
        arry.add(tmp);
    }

    void Remove(String Name)
    {
        for (User i: arry)
        {
            String tmp = i.getName();
            if (Name.equals(tmp))
            {
                arry.remove(i);
            }
        }

    }

    void  Search (String Name)
    {
        for (User i: arry)
        {
            String tmp = i.getName();
            if (Name.equals(tmp))
            {
                String p = i.getPhone();
                System.out.println(p);
            }
        }
    }

 /*   void  Search2 (String Name)
    {
        for (User i: arry)
        {
            String tmp = i.getName();
            if (Name.equals(tmp))
            {
               return i;
            }
        }
    }
*/
    void  all ()
    {
        for (User i: arry)
        {
         System.out.println(i.toString());
        }
    }
}
