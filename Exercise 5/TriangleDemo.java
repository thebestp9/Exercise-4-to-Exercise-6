import java.util.Scanner;
public class TriangleDemo{
    public static void main(String[] args){
    
      //create a Scanner object
    Scanner in = new Scanner(System.in);

      // Create a Triangle object.
    Triangle shape = new Triangle();
      // Prompt user to input value for height and base      
    System.out.println("Enter a height: ");
        double height = in.nextDouble();
    System.out.println("Enter a base: ");
        double base = in.nextDouble();
      //Set the height and base (use mutator) 
    shape.set(height, base);
      // Display the height, base and area (use accessor)
    
    System.out.println("The pyramid's height is "
                         + shape.getHeight());
    System.out.println("The pyramid's base is "
                         + shape.getBase());
      
    System.out.println("The pyramid's area is "
                         + shape.getArea());
      
   }
}


