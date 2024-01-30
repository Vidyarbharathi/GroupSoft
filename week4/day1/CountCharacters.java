package week4.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {
	
	public static void main(String[] args) {
		
		String company = "TestLeaf Software Solutions Pazhavanthangal"; 
		company = company.toLowerCase();
		// output : = 3 , a=7, ........
		
		//convert the String toCharArray
		char[] ch = company.toCharArray();
		
		// Declare a Map
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		
		// Approach 1:
		//Loop through each Character
		 /* for (int i = 0; i < ch.length; i++) {
			 // Before adding to the map -> Check if the character is already present or not
			 if (map.containsKey(ch[i])) {
				 // if it is already present , update the character(key) with its value  with its existing count
				 Integer value = map.get(ch[i]);
				 map.put(ch[i], value+1);
				
			}else {
				map.put(ch[i], 1);
			}
			 
			
		}*/
		
		
		// Approach 2:
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		
		System.out.println(map);
		
		// print only single occuring character
		
		for (Entry<Character, Integer> eachEntry : map.entrySet()) {
			if (eachEntry.getValue()== 1) {
				System.out.println(eachEntry.getKey());
			}
		}
		
		
		// find out the max occuring character
		int maxOccur = 0 ;
		char maxCharOccur = 0;
		
		for (Entry<Character, Integer> eachEntry: map.entrySet()) {
			if (eachEntry.getValue()> maxOccur) {
				maxOccur=eachEntry.getValue();
				maxCharOccur = eachEntry.getKey();
			}
		}
		System.out.println("Max occuring charcter is : "+maxCharOccur +" and the value is : "+maxOccur);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
