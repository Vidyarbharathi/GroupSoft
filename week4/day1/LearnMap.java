package week4.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	/**
	 * List,Set -> Sub Interface of Collection
	 * Single Dimension
	 * 
	 * Map -> Key-Value pair
	 * Map -> Interface
	 * Implementation classes: HashMap, TreeMap, LinkedHashMap
	 * HashMap -> Random order
	 * TreeMap -> ASCII order
	 * LinkedHashMap -> Insertion order
	 * 
	 * (Key,value)  -> Pair -> Entry
	 * Key -> No Duplicates
	 * Value -> Can hold Duplicates
	 * 
	 */
	public static void main(String[] args) {
	

		// Declare a Map
		// employee id - key , Employee name - value
		Map<Integer, String> employeeDetails = new LinkedHashMap<Integer, String>();

		//add entries into the map
		//                  key      value
		employeeDetails.put(10021, "Amruta");
		employeeDetails.put(10023, "Deepali");
		employeeDetails.put(10022, "Vidhi");
		employeeDetails.put(10020, "Abhishek");
		employeeDetails.put(10024, "Triveni");
		employeeDetails.put(10025, "Mani");
		employeeDetails.put(10024, "Saurab");

		// print the size of Map
		System.out.println(employeeDetails.size());
		// print the map
		System.out.println(employeeDetails);

		//to get the value
		String value = employeeDetails.get(10024);
		System.out.println(value);

		//to remove a value 
		employeeDetails.remove(10022);
		System.out.println(employeeDetails);
		
		//to check whether a key is present or not
		boolean containsKey = employeeDetails.containsKey(10021);
		System.out.println(containsKey);
		
		//to check whether a value is present or not
		boolean containsValue = employeeDetails.containsValue("Vidhi");
		System.out.println(containsValue);
		
		//to print the keys in a Map
		Set<Integer> keySet = employeeDetails.keySet();
		System.out.println(keySet);
		
		//to print all the entries of the map
		Set<Entry<Integer, String>> entrySet = employeeDetails.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> eachEntry : entrySet) {
			Integer key = eachEntry.getKey();
			System.out.print(key+" -> ");
			String value2 = eachEntry.getValue();
			System.out.println(value2);
		}
		
		
















	}

}
