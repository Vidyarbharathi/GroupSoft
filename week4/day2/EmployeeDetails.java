package week4.day2;

/**
 * constructor name and the class name should be same
   constructor will not have any return type (void/any return type)
   It is used to initialize the state of an object
   Types of Constructor: 
   Default Constructor
   Parameterized Constructor 
   this: to differntiate between the local variable and global variable if it has the same name

   Can you call one constructor from another constructor? Yes -> It is called as Constructor Chaining
   using this()
   Constructor call must be the first statement in a constructor
 */

public class EmployeeDetails {

	int empId;
	String empName;
	boolean empStatus;

	public EmployeeDetails() {

		System.out.println("Default Constructor");


	}

	public EmployeeDetails(int empId, String empName, boolean empStatus) {
		//this();// constructor call
		System.out.println("Parameterized  Constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;

	}

	public static void main(String[] args) {

		EmployeeDetails ed = new EmployeeDetails();
		System.out.println(ed.empId+"\n"+ed.empName+"\n"+ed.empStatus);

		//		EmployeeDetails ed1 = new EmployeeDetails(3000, "S", true);
		//		System.out.println(ed1.empId+"\n"+ed1.empName+"\n"+ed1.empStatus);

	}




}
