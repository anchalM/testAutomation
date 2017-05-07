package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.Common.BasePageObject;

public class EditAccountPage extends BasePageObject{
	
	By Accountno = By.name("accountno");
//	By CustomerID = By.name("cusid");
//	By AccountType = By.name("selaccount");
//	By InitialDeposit = By.name("inideposit");
	By Submit = By.name("AccSubmit");
	
	public EditAccountPage(WebDriver driver){
		this.driver= driver;
	}
	public void setAccountNo(String accountID){
		assignValueWhenReady(Accountno, accountID, 3000);
		}
	
	public void clickSubmit(){
		clickWhenReady(Submit,3000);
	}
}
