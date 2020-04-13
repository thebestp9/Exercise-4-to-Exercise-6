import java.util.Scanner;
public class Average {
    public static void main (String [] args){
    
        Scanner in = new Scanner(System.in);
        
        double num1,num2,num3,num4;
        
        System.out.println("Enter your first 3 integers: ");
        
        System.out.print("first integer: ");
            num1 = in.nextDouble();
        System.out.print("\nsecond integer: ");
            num2 = in.nextDouble();
        System.out.print("\nthird integer: ");
            num3 = in.nextDouble();
            
        System.out.println("\nAverage for the first 3 integers is: " + average(num1, num2, num3));

        System.out.println("\nEnter another input :");
        
        System.out.print("fourth integer: ");
            num4 = in.nextDouble();
            
        System.out.println("\nAverage for all integers is: " + average(num1, num2, num3, num4));

    }

    public static double average(double num1, double num2, double num3){
        double avr = (num1 + num2 + num3) / 3;
        return avr;
    }

    public static double average(double num1, double num2, double num3, double num4){
        double avr = (num1 + num2 + num3 + num4) / 4;
        return avr;
    }

}
        
        