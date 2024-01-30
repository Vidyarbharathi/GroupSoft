package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {

	public RemoteWebDriver driver;

	public void startApp() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}


	public void startApp(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
		}

	}

	public void startApp(String url,String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.get(url);
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.get(url);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(url);
			driver.quit();
		}

	}



	public static void main(String[] args) {
		LaunchBrowser lb = new LaunchBrowser();
		//lb.startApp();
		lb.startApp("firefox");
		lb.startApp("edge", "http://leaftaps.com/opentaps/control/main");
	}

}
