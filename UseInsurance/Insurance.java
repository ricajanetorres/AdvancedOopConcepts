abstract class Insurance
{
    String type;
    double monthlyprice;

    public Insurance(String type)
    {
        super();
        this.type = type;
    }
    public double getMonthlyprice()
    {
        return monthlyprice;
    }
    public String getType()
    {
        return type;
    }

    public abstract void setMonthlyprice(double monthlyprice);

    public abstract void display ();
}