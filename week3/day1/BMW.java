package week3.day1;

public class BMW extends Car{
	
	public void turnONAC() {
		System.out.println("AC Turned ON -> From BMW");

	}
	
	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.applyBrake();
		bm.soundHorn();
		bm.applyAccelarator();
		bm.turnONAC();
	}

}
