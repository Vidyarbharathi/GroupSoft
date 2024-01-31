package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	/**
	 * 
	 * NoAlertPresentException
	 * UnHandledAlertException
	 * Alert -> Interface
	 * accept()
	 * dismiss()
	 * getText()
	 * sendKeys()
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/alert.xhtml");
		//click Show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the driver focus to the alert
		Alert simpleAlert = driver.switchTo().alert();
		//get the text of the alert
		String text = simpleAlert.getText();
		//print the alert message
		System.out.println("Alert message is : "+text);
		// accept the alert
		simpleAlert.accept();
		//verify the success message
		String verifyMsg = driver.findElement(By.id("simple_result")).getText();
		System.out.println(verifyMsg);
	}

}
