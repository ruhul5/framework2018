package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myfirsttest {

	@Test 
	public void testingFirstName() {



		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","//Users//ruhulalam//framework2018//drivers//chromedriver");
		driver.get ("http://www.facebook.com");

		//new test	
	}
}	//