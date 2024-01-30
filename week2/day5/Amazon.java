package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys" ,Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[text()='Brand']/following::i")).click();
		
		//second brand
	
		
		//getting the informatin of first bag
		
		String bagName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
		System.out.println(bagName);
		
		
		
		//to print the (price% off) - //span[@class='a-letter-space']/following-sibling::span
	}

}
