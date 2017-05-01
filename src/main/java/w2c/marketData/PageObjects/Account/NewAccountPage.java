package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.Common.BasePageObject;
import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;

public class NewAccountPage extends BasePageObject {

	By AccountCustomerID = By.name("cusid");
	By AccountType = By.name("selaccount");
	By InitialDeposit = By.name("inideposit");
	By Submit = By.name("button2");

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setCustomerID(String getRegisterCusID) {
		assignValueWhenReady(AccountCustomerID, getRegisterCusID, 3000);
	}

	public void setAccountType(String accType) {
		assignValueWhenReady(AccountType, accType, 3000);
	}

	public void setInitialDeposit(String initialDeposit) {
		assignValueWhenReady(InitialDeposit, initialDeposit, 3000);
	}

	public RegisterdCustomerDetailPage setClickSubmit() {
		clickWhenReady(Submit, 3000);
		// driver.findElement(Submit).click();
		RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		return regPage;
	}
}