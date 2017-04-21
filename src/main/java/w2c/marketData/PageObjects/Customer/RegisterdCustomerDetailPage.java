package w2c.marketData.PageObjects.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterdCustomerDetailPage {
	WebDriver driver;
	By CustomerID = By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]");
	By AccountID =  By.xpath("//*[@id='account']/tbody/tr[4]/td[2]");
	//By AccountNumber =  By.xpath("//*[@id='deposit']/tbody/tr[7]/td[2]");
	
	public RegisterdCustomerDetailPage(WebDriver driver){
		this.driver = driver;
	}
	public String getRegisterCusID(){
		return driver.findElement(CustomerID).getText();
	}
	public String getRegAccountID(){
		return driver.findElement(AccountID).getText();
	}
	/*public String getAccountNumber(){
		return driver.findElement(AccountNumber).getText();
	}*/
	
}
