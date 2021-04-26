public class Triangle extends GeometricFigure
{
    public Triangle(int height , int width)
    {
        super();
        this.type = "Triangle";
        this.height = height;
        this.width = width;
        area( height, width);
    }
    public void area (int height, int width)
    {
        this.area = (height * width) / 2 ;
    }
    public void display ()
    {
        System.out.println("This is" + type);
        System.out.println("Height is" + height);
        System.out.println("Width is" + width);
        System.out.println("Area is" + area);
    }

}
