package w2c.marketData.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//Driver related implementation only.
public class DriverSetup {
	private WebDriver driver;
	private final String GECKO_PATH = "C:\\TestAutomation\\geckodriver-v0.11.1-win64\\geckodriver.exe";
	private final String GECKO_Driver = "webdriver.gecko.driver";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		System.setProperty(GECKO_Driver, GECKO_PATH);
		
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser :" + browserType + "invalid");
			driver = initFirefoxDriver(appURL);
		}
		driver.navigate().to(appURL);
	}

	private WebDriver initChromeDriver(String appURL) {
		Reporter.log("Creating Chrome driver ");
		return new ChromeDriver();
	}

	private WebDriver initFirefoxDriver(String appURL) {
		Reporter.log("Creating firefox driver ");
		return new FirefoxDriver();
	}

/*	public void implicitWait(int timeInsec) {
		Reporter.log("waiting for Page to Load..");
		try {
			driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
			Reporter.log("Page is Loaded..");
		} catch (Throwable error) {
			System.out.println("Timeout for page load Request to complete after" + timeInsec + "second");
			Assert.assertTrue(false, "Timeout for page load request after " + timeInsec + "second");
		}
	}*/
	
	public void explicitWait(){
		Reporter.log("waiting for Page to Load..");
		WebDriverWait wait = new WebDriverWait(driver,3000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable();
	}

	/*public void driverwait() throws InterruptedException {
		Thread.sleep(5000);
	}*/

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);
		} catch (Exception e) {
			System.out.println("Error:" + e.getStackTrace());
		}
	}
	
	public void handelCaptureText(){
		String actual_msg = driver.switchTo().alert().getText();
		System.out.println("Alert Message --" + actual_msg);
		driver.switchTo().alert().accept();
		String expected_msg = "please fill all fields";
		Assert.assertEquals(actual_msg, expected_msg);
		}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
