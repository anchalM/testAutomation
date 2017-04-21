package w2c.marketData.PageObjects.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditCustomerPage {
	WebDriver driver;
	By CustomerID = By.name("cusid");
	By Submit = By.name("AccSubmit");
	By Reset = By.name("res");
	//By TitleText = By.className(" ");
	
	public EditCustomerPage(WebDriver driver){
		this.driver = driver;
	}
	public void setCustomerid(String getRegisterCusID){
		driver.findElement(CustomerID).sendKeys(getRegisterCusID);
	}	
	public void setSubmit(){
		driver.findElement(Submit).click();
	}
	public void setReset(){
		driver.findElement(Reset).click();
	}
	//Get the title of Edit Page
  /*  public String getLoginTitle(){
     return driver.findElement(TitleText).getText();
*/
	
	public void handelCaptureText(){
	String actual_msg = driver.switchTo().alert().getText();
	System.out.println("Alert Message --" + actual_msg);
	driver.switchTo().alert().accept();
	String expected_msg = "please fill all fields";
	Assert.assertEquals(actual_msg, expected_msg);
	}
    }

