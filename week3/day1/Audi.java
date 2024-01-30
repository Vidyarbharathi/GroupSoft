package week3.day1;

public class Audi extends Car{
	
	public void applyGear() {
		System.out.println("change as reverse gear - > From audi class");
	}
	
	public void reverseGear() {
	System.out.println("Reverse Gear applied: -> From Audi");

	}
	
	public static void main(String[] args) {
		
		Audi au = new Audi();
		au.applyBrake();
		au.applyAccelarator();
		au.reverseGear();
		au.applyGear();
		
		Car car = new Car();
		car.applyGear();
	}

}
