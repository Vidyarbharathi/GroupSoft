package week3.day2;

public class SBIBank implements RBI{
	
	public void goldLoan() {
		System.out.println("5% interest rate");

	}

	
	public void knowYourCustomer() {
		
		System.out.println("AADHAR");
		
	}

    
	public int withDrawalLimit() {
		
		return 25000;
	}


	@Override
	public void cibilScore() {
		System.out.println("8%");
		
	}
	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.cibilScore();
		sbi.knowYourCustomer();
		System.out.println(sbi.withDrawalLimit());
	}

}
