package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {
	
	/**
	 * frame1
	 *    button
	 *   frame2
	 *     button
	 *     frame3
	 *       button
	 *       frame4
	 *        button
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/frame.xhtml");
		//switch to the parent frame by using index
		driver.switchTo().frame(2);
		//switch to the child frame by using id/name
		driver.switchTo().frame("frame2");
		//click the button 
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		//to switch to the immediate parent frame
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
