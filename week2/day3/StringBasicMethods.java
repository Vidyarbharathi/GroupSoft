package week2.day3;

public class StringBasicMethods {

	public static void main(String[] args) {
		
		String s="Testleaf";
		
		
	//	s= {t,e,s,t,l,e,a,f} -->array in the form of character
		
		
		char[] ch = s.toCharArray();//converts the string into char [] -->access the value using position
		
		System.out.println(ch[2]);
		
		//to find the count of characters in a string
		int length = s.length();
		System.out.println(length);
		
		
		char charAt = s.charAt(length-1);
		System.out.println(charAt);
		

	}

}
