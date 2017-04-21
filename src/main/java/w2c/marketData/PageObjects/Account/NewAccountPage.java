package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;

public class NewAccountPage {
	WebDriver driver;
	By AccountCustomerID = By.name("cusid");
	By AccountType = By.name("selaccount");
	By InitialDeposit = By.name("inideposit");
	By Submit = By.name("button2");
	public NewAccountPage(WebDriver driver) {
	this.driver= driver;
	}
	public void setCustomerID(String getRegisterCusID){
		driver.findElement(AccountCustomerID).sendKeys(getRegisterCusID);
	}
	public void setAccountType(String accType){
		driver.findElement(AccountType).click();
	}
	public void setInitialDeposit(String initialDeposit){
		driver.findElement(InitialDeposit).sendKeys(initialDeposit);
	}
	public RegisterdCustomerDetailPage setClickSubmit(){
		driver.findElement(Submit).click();
		 RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		 return regPage;
	}
}