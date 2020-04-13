import java.util.Scanner;
public class TestStaff {
    public static void main (String []args){
        
        Scanner in = new Scanner(System.in);
        Staff r = new Staff();
      
   
    System.out.print("enter the staff's name\t\t\t\t\t: ");
        String name=in.next();
    System.out.print("enter the staff's ID\t\t\t\t\t\t: ");
        String staffID=in.next();
    System.out.print("enter the staff's working per day\t: ");
        int workingDay=in.nextInt();
   
    r.setStaffInfo(name,staffID,workingDay);
    r.calculateSalary();
   
    System.out.println("\n**********STAFF INFO************\n");
   
    System.out.println("staff's name\t: "+r.getName());
    System.out.println("staff's ID\t\t: "+r.getStaffID());
    System.out.print("Staff's salary\t: RM"+r.getSalary());
   
   }
}
    
class Staff {
    private String name, staffID;
    private double salary;
    private int workingDay;
    public void setStaffInfo(String nm, String id, int wDay){
    
        name=nm;
        staffID=id;
        workingDay=wDay;
        
    }
	 public void calculateSalary(){
		 salary = workingDay * 35.0;
    }
	 public double getSalary(){
		 return salary;
    }
	 public String getName(){
		 return name;
    }
	 public String getStaffID(){
		 return staffID;
    }
}
