package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser {
	public static void main(String[] args) {
	
		//Instatiating the Browserdriver
		ChromeDriver driver =new ChromeDriver();
		//launch the application
		driver.get("https://www.google.com");
		
		EdgeDriver dr=new EdgeDriver();
		
		

	}

}
