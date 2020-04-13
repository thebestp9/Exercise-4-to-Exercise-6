import java.util.Scanner;
public class TestBook {
    public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Number of book: ");
    int n = in.nextInt();
    
    Book[] myLibrary = new Book[n];
    
    for(int i = 0;i < myLibrary.length;i++)
    {
        in.nextLine();
    
        System.out.print("title of the book: ");
            String title = in.nextLine();
        System.out.print("price of the book: RM");
            double price = in.nextDouble();
   
        myLibrary[i] = new Book();
   
        myLibrary[i].Book(title,price);
    }
    
    double high = myLibrary[0].getPrice();
    String point = myLibrary[0].getTitle();
   
    for(int i = 0;i < myLibrary.length;i++)
    {
        if(high < myLibrary[i].getPrice())
        {
            high = myLibrary[i].getPrice();
            point = myLibrary[i].getTitle();
        }
    }
    
   System.out.println("The book with the highest price is: ");
   System.out.printf(point + "\t--\t\tRM" + high);
   
   System.out.println("\nThe book with the word 'Java' in their title: ");
       for (int i = 0; i < myLibrary.length; i++) 
       {
           if (myLibrary[i].getTitle().indexOf("Java") != -1) 
               System.out.println(myLibrary[i].getTitle()); 
       }
    }
}
class Book {
    private String title;      //book’s title
    private double price;      //book’s price

public void Book(String t, double p)
{
    title = t;
    price = p;
}
public String getTitle()
{
    return title;
}

public double getPrice() 
{
    return price;
}

}