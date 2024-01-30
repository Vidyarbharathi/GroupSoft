package week3.day1;

public class Car extends Vehicle{
	
	public void applyGear() {
		System.out.println("Gear Applied - > From Car class");
	}
	
	public void applyAccelarator() {
		System.out.println("Accelerator  -> From Car class");

	}
	
	public static void main(String[] args) {
	
		Car car = new Car();
		car.applyBrake();
		car.soundHorn();
		car.applyGear();
		car.applyAccelarator();
		
		
	}

}
