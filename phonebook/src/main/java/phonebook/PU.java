package phonebook;

final public class PU extends User
{
    private String INN;

    PU(String name, String phone, String INN)
    {
        super(name, phone);
        setINN(INN);
    }

    @Override
    public String toString()
    {
        return "PU{" + super.toString() +
                "INN='" + INN + '\'' +
                '}';
    }

    public String getINN()
    {
        return INN;
    }

    private void setINN(String INN)
    {
        this.INN = INN;
    }
}
