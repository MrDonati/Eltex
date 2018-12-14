package phonebook;

import java.util.Collection;
import java.util.LinkedList;

final class Conference<T> extends Calls
{
    private LinkedList<T> as = new LinkedList<>();

    @Override
    public String toString()
    {
        return "Conference{" +
                "as=" + as +
                '}';
    }

    @SafeVarargs
    public Conference(int id, String time, LinkedList<T>... n)
    {
        super(id, time);

    }
}
