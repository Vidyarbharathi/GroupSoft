package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		// Declare a list
		//List <Wrapperclass> listName = new ImplementationClass<>();
		List<String> studentNames = new ArrayList<String>();
		
		//add items into the list
		studentNames.add("Saurabh");
		studentNames.add("Deepali");
		studentNames.add("Vidhi");
		studentNames.add("Triveni");
		studentNames.add(1, "Abhishek");
		studentNames.add(0, "Mani");
		
		//to find the size of the list
		int size = studentNames.size();
		System.out.println("The total size of this list is : "+size);
		
		//print the list
		System.out.println(studentNames);
		
		//to retrive a particular item from the list
		String string = studentNames.get(3);
		System.out.println(string);
		
		//to remove a particular data from the list
		studentNames.remove(1);
		System.out.println(studentNames);
		System.out.println(studentNames.isEmpty());
		
		//to clear the list
		studentNames.clear();
		System.out.println(studentNames.isEmpty());
		
		
		
		
		
	}

}
