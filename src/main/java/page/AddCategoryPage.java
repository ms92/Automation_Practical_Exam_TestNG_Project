package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage extends BasePage {

	// find web elements
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='data' ]")
	WebElement ADD_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[1]")
	WebElement CATEGORY_DROPDOWN_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[2]")
	WebElement DUE_DATE_Day_DROPDOWN_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]")
	WebElement DUE_DATE_Month_DROPDOWN_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[4]")
	WebElement DUE_DATE_Year_DROPDOWN_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@type='text'and @name='categorydata']")
	WebElement ADD_CATEGORY_ELEMENT;

	@FindBy(how = How.XPATH, using = "//select[@name='colour' and @title='Select default color for this category']")
	WebElement ADD_CATEGORY_DROPDOWN_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Add category']")
	WebElement ADD_CATEGORY;

	public void enterValueInAddElement(String value) {
		ADD_ELEMENT.sendKeys(value + randomGenerator(999));
	}

	public void selectValueInCategoryDropdownElement(String value) {
		selectDropdown(CATEGORY_DROPDOWN_ELEMENT, value);

	}

	public void selectValueInDueDateDayDropdownElement(String value) {
		selectDropdown(DUE_DATE_Day_DROPDOWN_ELEMENT, value);
	}

	public void selectValueInDueDateMonthDropdownElement(String value) {
		selectDropdown(DUE_DATE_Month_DROPDOWN_ELEMENT, value);
	}

	public void selectValueInDueDateYearDropdownElement(String value) {
		selectDropdown(DUE_DATE_Year_DROPDOWN_ELEMENT, value);

	}

	public void enterValueInAddCategoryElement(String value) {
		ADD_CATEGORY_ELEMENT.sendKeys(value + randomGenerator(999));
	}

	public void selectFromAddCategoryDropdownElement(String value) throws Throwable {
		selectDropdown(ADD_CATEGORY_DROPDOWN_ELEMENT, value);
		Thread.sleep(2000);
	}

	public void addCategory() throws Throwable {
		ADD_CATEGORY.click();
		Thread.sleep(2000);
	}

	int n = 12;

	public void month() {

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };

		for (n = 0; n < 12; n++) {
			System.out.println(month[n]);
		}

	}
}
