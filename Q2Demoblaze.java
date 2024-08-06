package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Demoblaze {

	WebDriver driver = new ChromeDriver();


	public Q2Demoblaze () {

		System.setProperty("webdriver.ChromeDriver.driver", "C:\\Users\\Admin\\Documents");
	}

	public void launchDemoblaze() {
		//launch the URL
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();

		//get title
		String title = driver.getTitle();
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page not landed on correct website");
		}	
	}

	public static void main(String[] args) {

		Q2Demoblaze db1 = new Q2Demoblaze();
		db1.launchDemoblaze();
	}
}
	