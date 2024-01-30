package week2.day1;

public class PrintOddnumbers {

	public static void main(String[] args) {
	
	//print all odd number between 10 to 20	
		
		for(int i=10;i<=20;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		
		//print the numbers form 20 to 10
		System.out.println("Reversing the loop");
		
		for(int i=20;i>=10;i--) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		
	}

}
