package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllPage;
import util.BrowserFactoryPage;

public class ToggleAllTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {

		driver = BrowserFactoryPage.init();
		driver.get("http://techfios.com/test/102/");


		ToggleAllPage toggleAll = PageFactory.initElements(driver, ToggleAllPage.class);

		toggleAll.ToToggleAllPage();

		Boolean result = toggleAll.isToggleAllCheckBoxSelected();
		System.out.println("All select boxes are checked" + result);
		
		if (!result) {
			toggleAll.ToToggleAllPage();
			Assert.assertTrue(result);
		}
		
		Assert.assertTrue(toggleAll.checkAllBoxesIfSelected());
		WebElement checkbox = driver.findElement(By.name("allbox"));

		Assert.assertEquals(true, checkbox.isSelected());

	}

}