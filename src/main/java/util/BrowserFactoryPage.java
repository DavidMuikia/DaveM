package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactoryPage {

static WebDriver driver;
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://techfios.com/test/102/");
		
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
