package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {
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
		//click show button
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm')]/following::span")).click();
		// confirm dialog box appears
		Alert confirmAlert = driver.switchTo().alert();
		// get the text of the alert
		System.out.println(confirmAlert.getText());
		// dismiss the alert
		confirmAlert.dismiss();
		// confirm the msg
		String text = driver.findElement(By.id("result")).getText();
		if (text.contains("Cancel")) {
			System.out.println("Alert is dismissed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
