package week3.day2;

public class Testcase1 {
	
	public static void main(String[] args) {
		SeleniumBase sb = new SeleniumBase();
		sb.loadURL();
		sb.startApp();
		sb.locateElement("username");
		sb.click();
		sb.takeSnap();
		
		
		
		Browser br = new SeleniumBase();
		br.loadURL();
		
	
		
	}

}
