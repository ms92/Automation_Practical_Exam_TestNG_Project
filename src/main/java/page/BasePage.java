package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(boundaryNumber);
		return randomNumber;
	}

	public void selectDropdown(WebElement CATEGORY_DROPDOWN_ELEMENT, String visibleText) {
		Select sel = new Select(CATEGORY_DROPDOWN_ELEMENT);
		sel.selectByVisibleText(visibleText);

	}

	public void waitForElement(WebDriver driver, int timeInSecond, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

}
