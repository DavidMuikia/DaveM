package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.RemoveAllPage;
import util.BrowserFactoryPage;

public class RemoveAllTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() {

		driver = BrowserFactoryPage.init();

		driver.get("http://techfios.com/test/102/");

		RemoveAllPage itemsList = PageFactory.initElements(driver, RemoveAllPage.class);
		itemsList.UserShldBeAbleToRemoveAllItems();

		Boolean result = itemsList.checkIfAllBoxesSelected();
		System.out.println("All Selected" + result);
		if (!result) {
			itemsList.UserShldBeAbleToRemoveAllItems();
			Assert.assertTrue("All Deleted", itemsList.checkIfAllBoxesSelected());

			driver.close();
			driver.quit();
		}

	}

}
