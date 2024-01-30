package week3.day3;

public class Student {

	//	   - The class should have at least two private variables (e.g., `name` and `age`).
	private String name;
	private int age;
	//	   - Provide getter and setter methods for each private variable.
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//	   - Ensure that the setter methods include validation (e.g., `age` should not be negative).
	public void	setAge(int age) {
		if (age>0) {
			this.age=age;
		}
		else {
			System.out.println("Age is invalid: It should not hold negative values");
		}

	}
	
	public int getAge() {
		return age;
	}
	//	   - Write a `main` method to create an instance of the `Student` class.
	public static void main(String[] args) {
		Student se = new Student();
		se.setAge(31);
		System.out.println(se.getAge());
		
		se.setName("Subraja");
		System.out.println(se.getName());
	}
	//	   - Set values to the instance using the setter methods.
	//	   - Retrieve and print the values using the getter methods.
	//	   - Demonstrate validation by attempting to set an invalid value.

}
