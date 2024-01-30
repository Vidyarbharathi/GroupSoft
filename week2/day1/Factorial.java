package week2.day1;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		// 5! = 5*4*3*2*1=120
		int factorial = 1;
		System.out.println("Factorial with for loop");
		for (int i = 1; i <= input; i++) {

			// 1*1
			// 1*2 1=1*2
			// 2*3 result =result*i
			// 6*4
			// 24*5
			// 120

			factorial = factorial * i;
			// System.out.println(factorial);
		}

		System.out.println(factorial);
		
		System.out.println("Factorial with while loop");
		int i = 1;
		int fact=1;
		while (i <= input) {
			fact = fact * i;
			i++;
		}

		System.out.println(factorial);

	}

}
