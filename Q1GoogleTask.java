package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1GoogleTask {

	WebDriver driver = new FirefoxDriver();

	public Q1GoogleTask() {
		////Set the path of browser driver 
		System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\Admin\\Documents");
	}


	public void launchGoogle() throws InterruptedException {
		//Launch the Url
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();

		// Getting URL
		String title = driver.getTitle();
		System.out.println("The Titel is: " +title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The currentUrl is: "+currentUrl);

		//Reload Page
		driver.navigate().refresh();
		Thread.sleep(3000);

		//close the browser
		driver.close();


	}
	public static void main(String[] args) throws InterruptedException {

		Q1GoogleTask google  = new Q1GoogleTask();
		google.launchGoogle();
	}
}

