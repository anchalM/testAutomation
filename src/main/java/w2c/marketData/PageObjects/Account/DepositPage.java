package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.PageObjects.Customer.RegisterdCustomerDetailPage;

public class DepositPage {
	WebDriver driver;
	By Accountno = By.name("accountno");
	By Ammount = By.name("ammount");
	By Description = By.name("desc");
	By Submit = By.name("AccSubmit");
	
	public DepositPage(WebDriver driver){
		this.driver= driver;
	}
	public void accountno(String accountno){
		driver.findElement(Accountno).sendKeys(accountno);
	}
	public void ammount(String ammount){
		driver.findElement(Ammount).sendKeys(ammount);
	}
	public void description(String desc){
		driver.findElement(Description).sendKeys(desc);
	}
	public  RegisterdCustomerDetailPage submit(){
		driver.findElement(Submit).click();
		RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		return regPage;
		
	}
}
