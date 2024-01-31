package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
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
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following::span")).click();
		//switch the focus to the alert
		Alert promptAlert = driver.switchTo().alert();
		//get the text of the alert
		String text = promptAlert.getText();
		//print the text
		System.out.println(text);
		// pass input to the prompt alert
		promptAlert.sendKeys("Subraja");
		//accept the alert
		promptAlert.accept();
		//verify the msg
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		if (text2.contains("Subraja")) {
			System.out.println("Input is entered successfully");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
