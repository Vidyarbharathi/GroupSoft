package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		String uname = driver.findElement(By.xpath("//label[@for='username']")).getText();
		System.out.println(uname);
		
		
		String cusDomain = driver.findElement(By.xpath("(//label[@class='label'])[2]")).getText();
		System.out.println(cusDomain);
		
		
		
	}

}
