package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundWebdriverMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.id("Login"));
		String attribute = login.getAttribute("value"); // get the value of the attribute of the targeted element
		System.out.println(attribute);

		Point location = login.getLocation();
		System.out.println(location);

		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	
		
		driver.close();
	}

}
