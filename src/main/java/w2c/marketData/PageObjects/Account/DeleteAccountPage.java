package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.Common.BasePageObject;

public class DeleteAccountPage extends BasePageObject{
	
	//WebDriver driver;
	By Accountno  = By.name("accountno");
	By Submit = By.name("AccSubmit");
	By Reset = By.name("res");
	
	public DeleteAccountPage(WebDriver driver){
		this.driver= driver;
	}
	public void setAccountno(String accountno){
		assignValueWhenReady(Accountno, accountno, 3000);
	}
	public void ClickSubmit(){
		clickWhenReady(Submit, 3000);
	}
}
