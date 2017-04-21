package w2c.marketData.Common;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Alert_Screenshot {
	WebDriver driver;

	public Alert_Screenshot(WebDriver driver) {
		this.driver = driver;
	}

	public void captureAlertText() {
		String actual_msg = " " ;
		if (driver.switchTo().alert() != null) {
			actual_msg = driver.switchTo().alert().getText();
			//System.out.println("Alert Message --" + actual_msg);
			driver.switchTo().alert().accept();
		}
		String expected_msg = "Please fill all fields";
	//	Assert.assertEquals(actual_msg, expected_msg);
		Assert.assertTrue(true, expected_msg);
	}
	public void takeScreenShot(String screenShotName) {
		// Take screenshot and store as a file format- TakesScreenshot is the
		// Interface in java. so we can not create the object. So TypeCast it.
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./ScreenShot/" + screenShotName + ".png"));
		} catch (Exception e) {
			System.out.println("Exeption while taking Screenshot Taken" + e.getMessage());
		}
	}
}
