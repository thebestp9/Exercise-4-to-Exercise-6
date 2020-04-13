import java.util.Scanner;
public class TestMyFCStaff{
    public static void main(String []args){
    
    Scanner in = new Scanner (System.in);
    MyFCStaff r = new MyFCStaff();
   
    System.out.print("Staff's name\t\t\t\t: ");
        String name = in.next();
    System.out.print("Staff's ID\t\t\t\t\t: ");
        String staffID = in.next();
    System.out.print("Total hours\t\t\t\t\t: ");
        int thour = in.nextInt();
    System.out.print("Total sale\t\t\t\t\t: RM");
       double tsale = in.nextDouble();
       
    r.MyFCStaff(name, staffID, thour, tsale);
    r.calculateCommission();
    r.calculateSalary();
    r.displaySalary();
    }
}

class MyFCStaff{
    
    private String name, staffID;
    private int thour;
    private double tsale,commission,tsalary;
    
    public void MyFCStaff(String nm,String stID,int thours,double tsales){
    
        name = nm;
        staffID = stID;
        thour = thours;
        tsale = tsales;
    }
    
    public void calculateCommission(){
        if(tsale > 150 && tsale < 301)
            commission = 0.05;
        else if(tsale > 300 && tsale < 501)
           commission = 0.10;
        else if(tsale > 500)
           commission = 0.15;
    } 
    
    public void calculateSalary(){
        thour = thour * 8;
        tsalary = thour + (commission * tsale);
    } 
   
    public void displaySalary(){
        System.out.println("**************STAFF INFO************");
        System.out.println("Staff Name\t\t: "+ name);
        System.out.println("Staff ID\t\t\t: "+ staffID);
        System.out.println("Hours Work\t\t: "+ thour / 8);
        System.out.println("Total Sale\t\t: RM"+ tsale);
        System.out.println("Total Salary\t: RM"+ tsalary);  
    } 
}