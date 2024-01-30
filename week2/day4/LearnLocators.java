package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		//Instantiate the browserdriver 
		//shortcut -->ctrl shift o -->import the packages of the classes
		ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the application
		driver.manage().window().maximize();
		
		//identifying the elements
		WebElement user = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		user.clear();
		user.sendKeys("DemoCSR");
		//NoSuchelement
		
	//	driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement crm = driver.findElement(By.partialLinkText("CRM"));
		String text = crm.getText();
		System.out.println(text);		
		crm.click();		
		String title = driver.getTitle(); //to verify the landingpage 
		System.out.println(title);
		
		//Locators		
		//id,name,classname,linktext
		//getTitle(); page verification
		//sendkeys -->typing
		//click()

	}

}
