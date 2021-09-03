package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;

	String name = "momoshrsth";

	@Test
	public void userShould_Be_AbleToAddCategory() throws Throwable {
		driver = BrowserFactory.init();

		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.enterValueInAddElement("HappyPlaceMamataS");
		addCategoryPage.selectValueInCategoryDropdownElement("autoTest264");
		addCategoryPage.selectValueInDueDateDayDropdownElement("11");
		addCategoryPage.selectValueInDueDateMonthDropdownElement("Jan");
		addCategoryPage.selectValueInDueDateYearDropdownElement("2022");
		addCategoryPage.enterValueInAddCategoryElement(name);
		addCategoryPage.selectFromAddCategoryDropdownElement("Blue");
		addCategoryPage.addCategory();
		addCategoryPage.month();
		while (name.equalsIgnoreCase(name)) {
			System.out.println("The category you want to add already exists: <duplicated category name>.");
			break;
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
