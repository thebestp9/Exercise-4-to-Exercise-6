import java.util.Scanner;
public class TestMyFCStaffModified{
    public static void main(String []args){
    
    Scanner in = new Scanner (System.in);
   
    System.out.print("Staff's name\t\t\t\t: ");
        String name = in.next();
    System.out.print("Staff's ID\t\t\t\t\t: ");
        String staffID = in.next();
    System.out.print("Total hours\t\t\t\t\t: ");
        int thour = in.nextInt();
    System.out.print("Total sale\t\t\t\t\t: RM");
       double tsale = in.nextDouble();
       
    MyFCStaffModified r = new MyFCStaffModified(name, staffID, thour, tsale);
    System.out.println(r.toString());
    }
}

class MyFCStaffModified{
    
    private String name, staffID;
    private int thour;
    private double tsale,commission,tsalary;
    
    public MyFCStaffModified(String nm,String stID,int thours,double tsales){
    
        name = nm;
        staffID = stID;
        thour = thours;
        tsale = tsales;
    }
    
    public double calculateCommission(){
        {
        if(tsale > 150 && tsale < 301)
            commission = (0.05) * tsale;
        else if(tsale > 300 && tsale < 501)
            commission = (0.10) * tsale;
        else if(tsale > 500)
            commission = (0.15) * tsale;
        }
        return commission;
    } 
    
    public double calculateSalary(){
        tsalary = (thour * 8) + calculateCommission();
            return tsalary;
    } 
   
    public String toString(){
            
            System.out.println("\n**************STAFF INFO************");
            String nm = String.format("\nStaff Name\t\t: "+ name);
            String stID = String.format("\nStaff ID\t\t\t: "+ staffID);
            String thours = String.format("\nHours Work\t\t: "+ thour);
            String tsales = String.format("\nTotal Sale\t\t: RM"+ tsale);
            String tsalary = String.format("\nTotal Salary\t: RM"+ calculateSalary());
                
                return nm + stID + thours + tsales + tsalary;
    } 
}