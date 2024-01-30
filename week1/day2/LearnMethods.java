package week1.day2;

public class LearnMethods {

	int a;//instance variable -->need obj reference
	String s;
	//Heap memory
	public void greet() {
		System.out.println("Learning Methods");
	}
	
	private int add(int x, int y) {		
		int z=x+y;
		//System.out.println(z);
		return z; //at the end of the method -->return the value to the calling method
	}	
	
	protected void cal() {
		System.out.println("Arithmetic functions");
	}
	
	
	/*
	 * void sub() { //default definition int s=25-add(); }
	 */
	 
	public static void main(String[] args) { //class memory
		
		//to use the methods of the class for execution
		//create a reference for the class to call the methods
		
		//Instantiate a class/create object for the class
		
		//classname objectName =new classname();
		
		LearnMethods function=new LearnMethods();
		int add = function.add(10,10);
		int add2 = function.add(15, 20);
		
		function.greet();
		System.out.println(add);		
		System.out.println(add2);
		
	}

}
