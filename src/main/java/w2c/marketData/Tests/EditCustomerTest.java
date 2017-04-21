package w2c.marketData.Tests;

/*import org.testng.Reporter;
import org.testng.annotations.Test;

import w2c.marketData.Common.Alert_Screenshot;
import w2c.marketData.Common.DriverSetup;
import w2c.marketData.PageObjects.Customer.EditCustomerPage;
import w2c.marketData.PageObjects.Login.HomePageObject;
import w2c.marketData.PageObjects.Login.LoginPage;

public class EditCustomerTest extends DriverSetup {
	LoginPage loginPage;
	
	 @Test
	public void editCustomerTest() throws InterruptedException {
		 loginPage = new LoginPage(getDriver()); 
		Reporter.log("editcustomerTest");
		HomePageObject home= loginPage.Login();
		Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		//HomePageObject home= new HomePageObject(getDriver());
		implicitWait(3000);
		home.setEditCustomer();
		EditCustomerPage editPage = new EditCustomerPage(getDriver());
		implicitWait(3000);
		editPage.setCustomerid("98610");
		editPage.setSubmit();
		//alt_screenshot.captureAlertText();
		alt_screenshot.takeScreenShot("editScreenshot");
		
	}
}*/
