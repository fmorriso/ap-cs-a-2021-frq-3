/**
 * AP CS A - 2021 - FRQ #3
 * Created By: Frederick Morrison
 * Creation Date: 2023-04-26
 */
public class MemberInfo
{
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {return gradYear;}

    public boolean inGoodStanding() { return hasGoodStanding;}

    @Override
    public String toString()
    {
        return "MemberInfo{" +
                "name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", hasGoodStanding=" + hasGoodStanding +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setHasGoodStanding(boolean hasGoodStanding)
    {
        this.hasGoodStanding = hasGoodStanding;
    }
}
