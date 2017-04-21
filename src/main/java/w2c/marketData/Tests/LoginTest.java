package w2c.marketData.Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import w2c.marketData.Common.DriverSetup;
import w2c.marketData.PageObjects.Login.LoginPage;

//why DriverSetup Because we need drivers in LoginTest.
public class LoginTest extends DriverSetup {
	// calling process use this page
	@Test
	public void testPageTitle() {
		Reporter.log("testPageTitle");
		LoginPage loginPage = new LoginPage(getDriver());
		// Assert.assertEquals(loginPage.getLoginPageTitle(), "Guru99 Bank Home
		// Page");
		Assert.assertEquals(loginPage.verifyLoginPageTitle(), true);

	}

	@Test
	public void loginTest() {
		Reporter.log("loginTest");
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.setUserName("mngr75232");
		loginPage.setPassword("etepaty");
		loginPage.ClockOnSubmit();
		Assert.assertEquals(loginPage.LoginVerify(), true);
	}
}
