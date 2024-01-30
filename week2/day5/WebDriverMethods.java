package week2.day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;



public class WebDriverMethods {

	public static void main(String[] args) {
		
		
	//	WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		
		ChromeDriver driver = new ChromeDriver(opt);
		//driver.setBinary("115");
		 Result driverPath = SeleniumManager.getInstance().getDriverPath(opt, false);
    System.out.println(driverPath);
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

		// driver.close();
	}

}
