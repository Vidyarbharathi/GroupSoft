package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ChromeDriver driver;
	
	
	public void launchBrowser() {
		driver= new ChromeDriver();

	}
	
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

}
