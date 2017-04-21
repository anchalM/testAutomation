/*package w2c.marketData.Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import w2c.marketData.Common.Alert_Screenshot;
import w2c.marketData.Common.DriverSetup;
import w2c.marketData.PageObjects.Customer.AddCustomerPage;
import w2c.marketData.PageObjects.Customer.DeleteCustomerPage;
import w2c.marketData.PageObjects.Customer.EditCustomerPage;
import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;
import w2c.marketData.PageObjects.Login.HomePageObject;
import w2c.marketData.PageObjects.Login.LoginPage;

public class CustomerTest extends DriverSetup {
	LoginPage loginPage;
	HomePageObject home;
	String getRegisterCusID = "";
	@Test(priority = 1)
	public void newCustomerTest() throws InterruptedException {
		loginPage = new LoginPage(getDriver());
		Reporter.log("newcustomerTest");
		home = loginPage.Login();
		Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		implicitWait(3000);
		home.setAddnewCustomer();
		AddCustomerPage addnewCustomerPage = new AddCustomerPage(getDriver());
		implicitWait(3000);
		addnewCustomerPage.setCustomername("Anchal T");
		addnewCustomerPage.setGender();
		addnewCustomerPage.setDOB("03/12/2017");
		addnewCustomerPage.setAddress("SaiKripa");
		addnewCustomerPage.setCity("Bangalore");
		addnewCustomerPage.setState("Karnataka");
		addnewCustomerPage.setPin("556035");
		addnewCustomerPage.setMobileNumber("1122334455");
		addnewCustomerPage.setEmail("ym@gmail.com");
		addnewCustomerPage.setPassword("demo123");
		implicitWait(3000);
		RegisterdCustomerDetailPage custDetail = addnewCustomerPage.ClickSubmit();
		getRegisterCusID = custDetail.getRegisterCusID();
		alt_screenshot.takeScreenShot("RegSussesfully3");
		alt_screenshot.captureAlertText();
		implicitWait(3000);
	}

	@Test(priority = 2)
	public void editCustomerTest() throws Throwable {
		System.out.println("Edit Customer Stared");
		Reporter.log("editcustomerTest");
		implicitWait(3000);
		Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		if (home != null)
			home.setEditCustomer();
		EditCustomerPage editPage = new EditCustomerPage(getDriver());
		implicitWait(3000);
		editPage.setCustomerid(getRegisterCusID);
		implicitWait(3000);
		editPage.setSubmit();
		// alt_screenshot.captureAlertText();
		alt_screenshot.takeScreenShot("editScreenshot");
	}
	@Test (priority= 3)
	public void deleteCustomerTest() throws Throwable {
		Reporter.log("deletecustomerTest"); 
		implicitWait(3000);
		Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		if(home != null)
			home.setDeleteCustomer(); 
		DeleteCustomerPage deletePage = new DeleteCustomerPage(getDriver()); 
		deletePage.setCustomerid(getRegisterCusID);
		deletePage.setSubmit();
		alt_screenshot.takeScreenShot("DeleteScreenshot");
	}
}*/