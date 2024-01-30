package week2.day3;

public class StringMethods {

	public static void main(String[] args) {
		
		String price="Rs.5000r";
		
		System.out.println(price+10);
		
		//convert the Rs.5000 -->int 5000
		
		String replace = price.replace("Rs.","");
		System.out.println(replace);
		
		String pr = price.replaceAll("[^0-9]", "");
		System.out.println(pr +10);
		
		//parse the string into integer
		int parseInt = Integer.parseInt(pr);
		System.out.println(parseInt+10);
		
		//Float.parseFloat(pr)
		
		
		String substring = price.substring(3,5);
		System.out.println(substring);
		
		
		
		
	}

}
