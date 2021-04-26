class Life extends Insurance 
{
    public Life()
    {
        super("Life");
        setMonthlyprice(36);
    }
    @Override
    public void display ()
    {
        System.out.println("The type of insurance is:" + type + "Insurance");
        System.out.println("The cost per month is:" + monthlyprice);
    }
    @Override
    public void setMonthlyprice(double monthlyprice)
    {
        this.monthlyprice = monthlyprice;
    }


}