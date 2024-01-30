package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateValues {
	public static void main(String[] args) {
		int[] nums = {2,5,4,2,7,6,7,5,3};
		
		// Output = [2,5,7]
		
		Set<Integer> unique = new TreeSet<>();
		Set<Integer> duplicates = new TreeSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			boolean add = unique.add(nums[i]);//nums[1]=5
			if (!add) {
				duplicates.add(nums[i]);
			}
		}
		System.out.println(unique);
		System.out.println(duplicates);
		
		
	}

}
