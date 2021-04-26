class Health extends Insurance
{
    public Health()
    {
        super("Health");
        setMonthlyprice(196);
    }

    public void display()
    {
        System.out.println("The type of insurance is:" + type + "Insurance");
    }

    @Override
    public void setMonthlyprice (double monthlyprice)
    {
        this.monthlyprice = monthlyprice;
    }
}