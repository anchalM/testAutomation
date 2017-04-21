package w2c.marketData.PageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import w2c.marketData.PageObjects.Customer.AddCustomerPage;

public class HomePageObject {
	WebDriver driver;
	
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
	public void setAddnewCustomer(){
		driver.findElement(NewCustomer).click();
	}
	public void setEditCustomer(){
		driver.findElement(EditCustomer).click();
	}
	public void setDeleteCustomer(){
		driver.findElement(DeleteCustomer).click();
	}
	public void setNewAccount(){
		driver.findElement(NewAccount).click();
	}
	public void setEditAccount(){
		driver.findElement(EditAccount).click();
	}
	public void setDeleteAccount(){
		driver.findElement(DeleteAccount).click();
	}
	public void deposit(){
		driver.findElement(Deposit).click();
	}
	public void withdrawal(){
		driver.findElement(Widthdrawal).click();
	}
	
	}
	
