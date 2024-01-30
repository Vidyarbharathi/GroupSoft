package week2.day3;

public class CountOfChars {

	public static void main(String[] args) {
		
		String s="Testleaf";
		
		char expCharacter='f';
		
		int count=0;
		
		char[] ch = s.toCharArray();		
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==expCharacter) {
				count++;
			}
		}
		
		System.out.println("Count of  "+expCharacter+" is " +count);
		
	}

}
