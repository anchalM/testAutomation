package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAccountPage {
	WebDriver driver;
	By Accountno = By.name("accountno");
//	By CustomerID = By.name("cusid");
//	By AccountType = By.name("selaccount");
//	By InitialDeposit = By.name("inideposit");
	By Submit = By.name("AccSubmit");
	
	public EditAccountPage(WebDriver driver){
		this.driver= driver;
	}
	public void accountNo(String accountno){
		driver.findElement(Accountno).sendKeys(accountno);
	}
	public void clickSubmit(){
		driver.findElement(Submit).click();
	}

	
}
