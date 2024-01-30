package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase extends Reporter implements Browser,Element{
	
	public ChromeDriver driver;

	@Override
	public WebElement locateElement(String value) {
		return driver.findElement(By.id(value));

	}

	@Override
	public void locateElements() {
		driver.findElements(By.id("username"));

	}

	@Override
	public void loadURL() {
		driver.get("https:/");

	}

	@Override
	public void startApp() {
		driver=new ChromeDriver();


	}
	
	public void click() {
		locateElement("username").click();

	}

	@Override
	public void takeSnap() {
		driver.getScreenshotAs(OutputType.FILE);
		
	}




}
