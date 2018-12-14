package phonebook;

final class PrivateCall<T> extends Calls
{
    private T cgpn;
    private T cdpn;

    public PrivateCall(int id, String time, T cgpn, T cdpn) {
        super(id, time);
        this.cgpn = cgpn;
        this.cdpn = cdpn;
    }

    @Override
    public String toString()
    {
        return "PrivateCall{" +
                "cgpn=" + cgpn +
                ", cdpn=" + cdpn +
                '}';
    }

    public T getCgpn()
    {
        return cgpn;
    }

    public void setCgpn(T cgpn)
    {
        this.cgpn = cgpn;
    }

    public T getCdpn()
    {
        return cdpn;
    }

    public void setCdpn(T cdpn)
    {
        this.cdpn = cdpn;
    }
}
