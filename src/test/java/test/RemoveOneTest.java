package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveOnePage;
import util.BrowserFactoryPage;

public class RemoveOneTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactoryPage.init();

//			On to the site
		driver.get("http://techfios.com/test/102/");

		System.out.println("Before deleting " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		RemoveOnePage onechechBox = PageFactory.initElements(driver, RemoveOnePage.class);
		onechechBox.UserShldBeAbleToDeleteOne();
		System.out.println("After deleting " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
