package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //once applied applicable all findElement

		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Force@123");
		
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();		
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		Thread.sleep(3000); //explicit wait of java
		System.out.println(driver.getTitle());
		
		
		driver.close();
	}

}
