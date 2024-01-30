package week3.day2;

public class AxisBank implements RBI{

	@Override
	public void knowYourCustomer() {
		System.out.println("PAN Card");
		
	}

	@Override
	public void cibilScore() {
		System.out.println("9%");
		
	}

	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.knowYourCustomer();
		ab.cibilScore();
	}
}
