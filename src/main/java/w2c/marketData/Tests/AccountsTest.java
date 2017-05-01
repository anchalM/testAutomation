package w2c.marketData.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import w2c.marketData.Common.Alert_Screenshot;
import w2c.marketData.Common.DriverSetup;
import w2c.marketData.PageObjects.Account.DeleteAccountPage;
import w2c.marketData.PageObjects.Account.DepositPage;
import w2c.marketData.PageObjects.Account.EditAccountPage;
import w2c.marketData.PageObjects.Account.NewAccountPage;
import w2c.marketData.PageObjects.Account.Widhdrawl;
import w2c.marketData.PageObjects.Customer.AddCustomerPage;
import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;
import w2c.marketData.PageObjects.Login.HomePageObject;
import w2c.marketData.PageObjects.Login.LoginPage;

public class AccountsTest extends DriverSetup {
	WebDriver driver;
	LoginPage loginPage;
	HomePageObject home;
	String getRegisterCusID = "";
	String getRegAccountID = "";

	@Test(priority= 1)
	public void newCustomerTest() throws InterruptedException {
		loginPage = new LoginPage(getDriver());
		Reporter.log("newcustomerTest");
		home = loginPage.Login();
		// Assert.assertTrue(true, "User login Succesfully");
		// Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		// Assert.assertEquals(driver.findElement(By.partialLinkText("Welcome To
		// Manager's Page")),
		// "Welcome To Manager's");
		home.addNewCustomer();
		AddCustomerPage addnewCustomerPage = new AddCustomerPage(getDriver());
		addnewCustomerPage.setCustomername("Anchal Tiwari");
		addnewCustomerPage.setGender();
		addnewCustomerPage.setDOB("03/12/2017");
		addnewCustomerPage.setAddress("SaiKripa");
		addnewCustomerPage.setCity("Bangalore");
		addnewCustomerPage.setState("Karnataka");
		addnewCustomerPage.setPin("556035");
		addnewCustomerPage.setMobileNumber("552489780");
		addnewCustomerPage.setEmail("yx@gmail.com");
		addnewCustomerPage.setPassword("demo123");
		// implicitWait(driver);
		RegisterdCustomerDetailPage custDetail = addnewCustomerPage.ClickSubmit();
		// Assert.assertTrue(true, "Customer fill all details..");
		// Assert.assertTrue(driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[1]/td/p")).getText()
		// .contains("Customer Registered Successfully!!!"));
		// implicitWait(driver);
		getRegisterCusID = custDetail.getRegisterCusID();
		// alt_screenshot.takeScreenShot("RegSussesfully5");
		// alt_screenshot.captureAlertText();

	}

	@Test(priority = 2)
	public void newAccountTest() throws Throwable {
		Reporter.log("NewAccount");
		if (home != null)
			home.setNewAccount();

		NewAccountPage newAccount = new NewAccountPage(getDriver());
		Alert_Screenshot alt_screenshot = new Alert_Screenshot(getDriver());
		newAccount.setCustomerID(getRegisterCusID);
		newAccount.setAccountType("Saving");
		newAccount.setInitialDeposit("5000");
		if (newAccount != null) {
			alt_screenshot.captureAlertText();
		}
		RegisterdCustomerDetailPage accountDetail = newAccount.setClickSubmit();
		// implicitWait(3000);
		getRegAccountID = accountDetail.getRegAccountID();

		// alt_screenshot.captureAlertText();
		// alt_screenshot.takeScreenShot("Account Generated Sussessfully");

	}

	/*
	 * @Test(priority = 3) public void editAccount() throws Throwable {
	 * Reporter.log("EditAccount"); home.setEditAccount(); //implicitWait(3000);
	 * EditAccountPage editAccount = new EditAccountPage(getDriver());
	 * editAccount.accountNo(getRegAccountID); editAccount.clickSubmit();
	 * //implicitWait(3000); }
	 * 
	 * @Test(priority = 4) public void deleteAccoutn() throws Exception {
	 * Reporter.log("DeleteAccount"); home.setDeleteAccount(); DeleteAccountPage
	 * deleteAcc = new DeleteAccountPage(getDriver()); Alert_Screenshot
	 * alt_screenshot = new Alert_Screenshot(getDriver()); //implicitWait(3000);
	 * deleteAcc.setAccountno(getRegAccountID); // deleteAcc.ClickSubmit(); //
	 * alt_screenshot.captureAlertText();
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void deposit() throws Throwable {
	 * Reporter.log("Deposit"); home.deposit(); DepositPage depositamount = new
	 * DepositPage(getDriver()); //implicitWait(3000);
	 * depositamount.accountno(getRegAccountID); depositamount.ammount("8000");
	 * depositamount.description("Amount Deposited"); //implicitWait(3000);
	 * RegisterdCustomerDetailPage accountnumber = depositamount.submit();
	 * getRegAccountID = accountnumber.getRegAccountID();
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void widthdrawl() throws Throwable {
	 * Reporter.log("Widthdraw"); home.withdrawal(); Widhdrawl widthdrawl = new
	 * Widhdrawl(getDriver()); //implicitWait(3000);
	 * widthdrawl.accountno(getRegAccountID); widthdrawl.ammount("5000");
	 * widthdrawl.description("Widthdrawl"); //implicitWait(3000);
	 * widthdrawl.submit(); }
	 */

}