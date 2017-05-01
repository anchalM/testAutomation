package w2c.marketData.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePageObject {

	public WebDriver driver;

	public void implicitWait(int timeInsec) {
		Reporter.log("waiting for Page to Load..");
		try {
			driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
			Reporter.log("Page is Loaded..");
		} catch (Throwable error) {
			System.out.println("Timeout for page load Request to complete after" + timeInsec + "second");
			Assert.assertTrue(false, "Timeout for page load request after " + timeInsec + "second");
		}
	}

	// User for buttons to click .
	public void expliciteWait(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Apply to button .
	public void clickWhenReady(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();

	}

	public void assignValueWhenReady(By locator, String value, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(value);
	}
	
	public String getValueWhenReady(By locator, int timeout){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element.getText();
	}

	// User this method when we are waiting for page load
	public void waitForPageToLoad(long timeOutInSeconds) {
		// anonymous class
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			System.out.println("Waiting for page to load...");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(expectation);
		} catch (Throwable error) {
			System.out.println(
					"Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
			Assert.assertFalse(true, "Timeout waiting for Page Load Request to complete.");

		}
	}
}
