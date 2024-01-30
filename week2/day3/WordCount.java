package week2.day3;

public class WordCount {

	public static void main(String[] args) {
		
		String s= "Learning String in Java";
		
		s.toCharArray();
		
		//[L,e,a,r,n,i,n,g, ,S,t,r,i,n,g]
		//[Learning,String,in,Java]
		
		
		String[] split = s.split("r"); //delimiter -->
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
	
		
	}

}
