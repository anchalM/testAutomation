package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.Common.BasePageObject;
import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;

public class DepositPage extends BasePageObject {
	// WebDriver driver;
	By Accountno = By.name("accountno");
	By Ammount = By.name("ammount");
	By Description = By.name("desc");
	By Submit = By.name("AccSubmit");

	public DepositPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setDepositAccountno(String getRegAccountID) {
		assignValueWhenReady(Accountno, getRegAccountID, 3000);
	}

	public void ammount(String ammount) {
		assignValueWhenReady(Ammount, ammount, 3000);
	}

	public void description(String desc) {
		assignValueWhenReady(Description, desc, 3000);
	}

	public RegisterdCustomerDetailPage submit() {
		clickWhenReady(Submit,3000);
		RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		return regPage;
	}
}
