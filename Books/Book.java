public abstract class Book {
    String title;
    double price;
    public Book(String title)
    {
        super();
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
