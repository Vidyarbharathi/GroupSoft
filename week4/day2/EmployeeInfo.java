package week4.day2;

public class EmployeeInfo {
	
	int empId;
	String name;
	static String companyName="TestLeaf";
	
	static {
		System.out.println("I am a static block");
	}
	
	public void setValues(int empId, String name,String cName) {
		this.empId=empId;
		this.name=name;
		companyName=cName;

	}
	
	public static void add() {
		System.out.println("I am a static method");
	}
	
	public void printValues() {
		System.out.println(empId+ " "+name+"  "+companyName);

	}
	
	public static void main(String[] args) {
		
		System.out.println(companyName);
		add();
		System.out.println("I am inside main method");
		
		
		
//		EmployeeInfo e1 = new EmployeeInfo();
//		e1.setValues(200, "Subraja", "TestLeaf");
//		e1.printValues();
//		
//		EmployeeInfo e2= new EmployeeInfo();
//		e2.setValues(300, "Ramya", "TestLeaf");
//		e2.printValues();
//		
//		EmployeeInfo e3= new EmployeeInfo();
//		e3.setValues(400, "Vidhya", "Qeagle");
//		e1.printValues();
//		e3.printValues();
		
		
		
	}
	

}
