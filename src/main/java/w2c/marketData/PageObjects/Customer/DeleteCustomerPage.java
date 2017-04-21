package w2c.marketData.PageObjects.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPage {

	WebDriver driver;
	By CustomerID = By.name("cusid");
	By Submit = By.name("AccSubmit");
	By Reset = By.name("res");
	
	public DeleteCustomerPage(WebDriver driver){
		this.driver= driver;
	}
	public void setCustomerid(String cid){
		driver.findElement(CustomerID).sendKeys(cid);
	}
	public void setSubmit(){
		driver.findElement(Submit).click();
	}
	public void setReset(){
		driver.findElement(Reset).click();
	}
}
