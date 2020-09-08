package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCategoryPage;
import util.BrowserFactoryPage;

public class AddCategoryTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactoryPage.init();

//			To the site
		driver.get("http://techfios.com/test/102/");
		System.out.println("Before Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		AddCategoryPage addCategory = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategory.UserShldBeAbleToAddText();
		System.out.println("After Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.close();
		driver.quit();
	}
}
