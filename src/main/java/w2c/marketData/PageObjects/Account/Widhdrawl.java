package w2c.marketData.PageObjects.Account;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import w2c.marketData.Common.BasePageObject;


public class Widhdrawl extends BasePageObject {
	By Accountno = By.name("accountno");
	By Ammount = By.name("ammount");
	By Description = By.name("desc");
	By Submit = By.name("AccSubmit");
	By Reset = By.name("res");

	public Widhdrawl(WebDriver driver) {
		this.driver = driver;
	}

	public void accountno(String accountno) {
		assignValueWhenReady(Accountno, accountno, 3000);
	}

	public void ammount(String ammount) {
		assignValueWhenReady(Ammount, ammount, 3000);
	}

	public void description(String desc) {
		assignValueWhenReady(Description, desc, 3000);
	}
	/*
	 * public RegisterdCustomerDetailPage submit(){
	 * driver.findElement(Submit).click(); RegisterdCustomerDetailPage regPage =
	 * new RegisterdCustomerDetailPage(driver); return regPage;
	 */

	public void submit() {
		clickWhenReady(Submit, 3000);
	}
}
