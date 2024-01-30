package week3.day1;

public class Auto extends Vehicle{
	
	public void applyMeter() {
		System.out.println("Meter Turned On -> From Auto ");

	}
	
	public static void main(String[] args) {
		Auto aut = new Auto();
		aut.applyBrake();
		aut.soundHorn();
		aut.applyMeter();
	}
	
	

}
