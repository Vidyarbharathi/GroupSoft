package week2.day1;

public class LearnSwitch {

	public static void main(String[] args) {
		String browserType = "ie";

		switch (browserType) {
		case "edge": {
			System.out.println("Launch the app in Edge browser");
			break;
		}
		case "firefox": {
			System.out.println("Launch the app in Firefox browser");
			break;
		}

		case "Opera": {
			System.out.println("Launch the app in Opera browser");
			break;
		}
		case "chrome": {
			System.out.println("Launch the app in Chrome browser");
			break;
		}
		default: {
			System.out.println("App launches in default browser");
		}

		}
	}

}
