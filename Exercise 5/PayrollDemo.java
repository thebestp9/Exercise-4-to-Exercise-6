import java.util.Scanner;
public class PayrollDemo{
    public static void main(String []args){
    
    Employee info = new Employee();
    info.input();
    
    Payroll check = new Payroll(info.gpay, info.stateTax, info.fedTax);
        System.out.printf("\nNet pay is : %.2f", check.printOutput());
    }
}
class Employee{
    
    Scanner in = new Scanner(System.in);
    
    int employID;
    double gpay, stateTax, fedTax;
    
    public void input(){
        System.out.print("Enter the employee's ID : ");
            employID = in.nextInt();
        System.out.print("Enter their gross pay\t: RM ");
            gpay = in.nextDouble();
        System.out.print("Enter their state tax\t: RM ");
            stateTax = in.nextDouble();
        System.out.print("Enter their federal tax : RM ");
            fedTax = in.nextDouble();
    }
 
}

class Payroll{

    double gpay, stateTax, fedTax, netPay;
    
    public Payroll(double grosspay, double Statetax, double Fedtax)
    {
        gpay = grosspay;
        stateTax = Statetax;
        fedTax = Fedtax;
    }
    
    public double calculateNetPay()
    {
        netPay = gpay - stateTax - fedTax;
        return netPay;
    }
    
    public double printOutput()
    {
        return calculateNetPay();
    }
}
    