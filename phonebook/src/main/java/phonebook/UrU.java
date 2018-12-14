package phonebook;

final public class UrU extends User
{
    private String Gender;

    UrU(String name, String phone, String Gender)
    {
        super(name, phone);
        setGender(Gender);
    }

    @Override
    public String toString()
    {
        return "UrU{" + super.toString() +
                "Gender='" + Gender + '\'' +
                '}';
    }

    public String getGender()
    {
        return Gender;
    }

    private void setGender(String Gender)
    {
        this.Gender = Gender;
    }
}
