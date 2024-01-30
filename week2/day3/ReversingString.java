package week2.day3;

public class ReversingString {

	public static void main(String[] args) {
		String s="Testleaf";
		
		//to reverse the string-->breakdown into char
		//faeltseT
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean contains = lowerCase.contains("test");
		System.out.println(contains);

	}

	//if(ch[i]='e')
	
	
}
