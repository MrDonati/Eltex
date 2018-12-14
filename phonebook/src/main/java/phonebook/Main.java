package phonebook;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        String URL = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC&useSSL=false";
        String UserName = "root";
        String Password = "In&ec235";
        try(Connection connection = DriverManager.getConnection(URL, UserName, Password))
        {
            System.out.println("connected");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        PhoneBook book = new PhoneBook();

        boolean flag = true;
        while (flag)
        {
            System.out.println("Enter number. " +
                    "1 - Add physical user. " +
                    "2 - Add legal user. " +
                    "3 - Show all. " +
                    "4 - Remove user. " +
                    "5 - Search. " +
                    "0 - Exit. ");
            int x = in.nextInt();
            if (x == 1)
            {
                System.out.println("Enter a space-separated full name, phone number and gender");
                String Name = in.next();
                String Phone = in.next();
                String Gender = in.next();
                book.addPU(Name, Phone, Gender);
            }
            if (x == 2)
            {
                System.out.println("Enter a space-separated full name, phone number and INN");
                String Name = in.next();
                String Phone = in.next();
                String INN = in.next();
                book.addUrU(Name, Phone, INN);
            }
            if (x == 3)
            {
                book.all();
            }
            if (x == 4)
            {
                System.out.println("Enter full name");
                String Name = in.next();
                book.Remove(Name);

            }

            if (x == 5)
            {
                System.out.println("Enter full name");
                String Name = in.next();
                book.Search(Name);
            }

            if (x == 6)
            {
                System.out.println("Enter full name incoming user");
                String Name1 = in.next();
                System.out.println("Enter full name outgoing user");
                String Name2 = in.next();
                System.out.println("Enter speaking time");
                String time = in.next();
                int id = 0;
                id += 1;
                User user;

            }

            if(x == 0)
            {
                flag = false;
            }


        }

    }
}
