package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
	
	WebDriver driver;
	By Accountno  = By.name("accountno");
	By Submit = By.name("AccSubmit");
	By Reset = By.name("res");
	
	public DeleteAccountPage(WebDriver driver){
		this.driver= driver;
	}
	public void setAccountno(String accountno){
		driver.findElement(Accountno).sendKeys(accountno);
	}
	public void ClickSubmit(){
		driver.findElement(Submit).click();
	}
}
