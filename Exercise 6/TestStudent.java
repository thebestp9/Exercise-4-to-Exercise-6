import java.util.Scanner;
    public class TestStudent {  
    public static void main (String [] args) {

	 Scanner in = new Scanner(System.in);
   
    String matricNo;
	 double test1,test2;
	
	 Student [] studDegree = new Student[3];
   
	//complete your code here
   
    for(int i = 0;i < studDegree.length;i++)
    {   
    System.out.print("Matric No :");
        matricNo = in.next();
    System.out.print("Test 1 :");
        test1 = in.nextDouble();
    System.out.print("Test 2 :");
        test2 = in.nextDouble();
   
    studDegree[i] = new Student(matricNo,test1,test2);
    studDegree[i].calculateAverage();
    }
   
   
    System.out.println("**********************************");
    System.out.println("        STUDENT INFORMATION       ");
    System.out.println("**********************************\n");
   
    System.out.println("\tMatric No\t\tAverageMark");
        for(int i=0;i<studDegree.length;i++){
            System.out.println(studDegree[i].getStudentInfo());
    }
    }
}
   
class Student{
	//list of data members
private String matricNo;
	private double test1, test2, averageMark;
	
	//constructor
	public Student(String matric, double ts1, double ts2 ){
		matricNo = matric;
		test1 = ts1;
		test2 = ts2;	 
	}
	//method that returns some of students’ info
	public String getStudentInfo()
{
		return "\t"+matricNo+"\t\t\t\t"+averageMark;
	}
	//method that calculates the average of 2 tests
public void calculateAverage()
	{
		averageMark = (test1 + test2)/2;
	} 
  }//end of class Student
