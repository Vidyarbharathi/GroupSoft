package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	/**
	 * The return type of findElement() -> WebElement
	 * The return type of findElements() -> List<WebElement>
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en-gb.facebook.com/");
		
		//find the number of links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        //to find the size of the links in the webpage
        System.out.println("The total no: of links :"+links.size());
        
        //to retrieve the second link from the webpage
        System.out.println(links.get(1).getText());
        
        List<String> list = new ArrayList<String>();
        		
        //print all the links 
        for (int i = 0; i < links.size(); i++) {//0-46
			String text = links.get(i).getText();//links.get(1).getText(); Forgetten Password
			list.add(text);
		}
        Collections.sort(list);
        
        System.out.println(list);
	}

}
