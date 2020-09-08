package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class ToggleAllPage {

	WebDriver driver;

	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement ToggleAllPage;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement ToggleAllList;

	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type='checkbox']"))
	List<WebElement> checkboxes;

	public void ToToggleAllPage() {

		ToggleAllPage.click();
	}

	public boolean isToggleAllCheckBoxSelected() {
		return ToggleAllPage.isSelected();
	}

	public boolean checkAllBoxesIfSelected() {
		int NotCheckedBoxes = 0;
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected() == false) {
				NotCheckedBoxes++;
			}
		}
		if (NotCheckedBoxes > 0) {
			return false;
		} else {
			return true;
		}
	}
}
