package week2.day3;

public class LearnString {

	public static void main(String[] args) {
		
		String name="Testleaf" ; //literal dec
		
		String cName="Testleaf";
		
		String name1=new String("testleaf");
		
		//differed in the way of memory allocation
		
		if(name==name1) { //compares the memory address(location) 100 ==101
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
		
		
		
		if(name==cName) { //comparing two literals comparsion is done with address
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
		

		
		//to compare actual values of string -->.equals() for both literal and instance dec
		
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("Values are same");
		}else {
			System.out.println("Values are not same");
		}
		
		
		
	}

}
