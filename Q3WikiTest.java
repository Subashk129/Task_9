package Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Task16.WikiTest;

public class Q3WikiTest {
	
WebDriver driver = new ChromeDriver();
	
	public Q3WikiTest() {
		// set path to chromeDriver	
		System.setProperty("webdriver.ChromeDriver.driver", "C:\\Users\\Admin\\Documents");

	}
	
	public void launchWiki() {
		//Launch the URL
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		//searching
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
		driver.findElement(By.xpath("//span[normalize-space()='History']")).click();
		//Printing section Title
		String title = driver.getTitle();
		System.out.println("The Title of the Section is: " +title);
		
		
		
	}

	public static void main(String[] args) {
		
		Q3WikiTest wiki = new Q3WikiTest();
		
		wiki.launchWiki();
		
	}
}

