package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/frame.xhtml");
		//switch the driver focus to the frame by using index
		//driver.switchTo().frame(0);
		// swithc the driver focus to the frame by using WebElement
		WebElement eleFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following::iframe"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		//will come out of all frames and switch back to the main webpage
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		//switch to the child frame by using id/name
		driver.switchTo().frame("frame2");
		//click the button 
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
