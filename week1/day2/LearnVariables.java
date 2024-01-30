package week1.day2;

public class LearnVariables {

	public static void main(String[] args) {
		//Declaration of variables with datatype
		//syntax: dataType variableName=value;
		
		int x=0; //declaration
		
		String brandName="Honda"; //initializing a variable
		int cc=125;
		short gearNum=4;
		//byte, short ,int
		long engineNo=238792000123l;
		
		float kms=14.5f;		
		double price=23456.345677;
		
		char logo='H';		
		boolean isNew=true;
		
		
		//Class with UpperCase -->pascal notation
		//variables-->camelCase
		
		System.out.println("The brand name of the Vehicle : "+brandName);
		System.out.println(logo + " is the logo of the vehicle");
		System.out.println(cc +": " + gearNum);
		System.out.println(x);
		
		//Default values:
		//int -0
		//0.0
		//null
		//false

	}

}
