package w2c.marketData.PageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import w2c.marketData.Common.BasePageObject;
import w2c.marketData.PageObjects.Customer.AddCustomerPage;

public class HomePageObject extends BasePageObject {

	int waitTime = 5000;
	By NewCustomer = By.linkText("New Customer");
	By EditCustomer = By.linkText("Edit Customer");
	By DeleteCustomer = By.linkText("Delete Customer");
	By NewAccount = By.linkText("New Account");
	By EditAccount = By.linkText("Edit Account");
	By DeleteAccount = By.linkText("Delete Account");
	By Deposit = By.linkText("Deposit");
	By Widthdrawal = By.linkText("Withdrawal");

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	/*public void setAddnewCustomer() {
		driver.findElement(NewCustomer).click();
	}*/
	public void addNewCustomer(){
		clickWhenReady(NewCustomer,waitTime);
	}

	public void setEditCustomer() {
		clickWhenReady(EditCustomer, waitTime);
	}

	public void setDeleteCustomer() {
		clickWhenReady(DeleteCustomer, waitTime);
	}

	public void setNewAccount() {
		clickWhenReady(NewAccount, waitTime);	
		}

	public void setEditAccount() {
		clickWhenReady(EditAccount, waitTime);	
		}

	public void setDeleteAccount() {
		clickWhenReady(DeleteAccount, waitTime);
	}

	public void deposit() {
		clickWhenReady(Deposit, waitTime);
	}

	public void withdrawal() {
		clickWhenReady(Widthdrawal, waitTime);
	}

}
