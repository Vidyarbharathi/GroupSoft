package week3.day1;

public class Bajaj extends Auto{
	
	public void selfStart() {
		System.out.println("Done -> From Bajaj");

	}
	
	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		bj.applyBrake();
		bj.applyMeter();
		bj.selfStart();
	}

}
