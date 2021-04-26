public class BookArray 
{
    public static void main(String[] args)
    {
        Book[] b = new Book [10];
        b[0] = new Fiction ("War and Peace");
        b[1] = new Fiction ("Moby Dick");
        b[2] = new NonFiction ("Silent Spring");
        b[3] = new NonFiction ("In Cold Blood");
        b[4] = new Fiction ("Atonement");
        b[5] = new Fiction ("Beloved");
        b[6] = new NonFiction ("A Walk in the Woods");
        b[7] = new NonFiction ("Pride and Prejudice");
        b[8] = new Fiction ("Little Women");
        b[9] = new NonFiction ("Into the Wild");

        for (int i=0;i<10;i++){
            System.out.println(b[i].getTitle()+" => $ " + b[i]getPrice());
        }
        
    }
}
