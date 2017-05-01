package w2c.marketData.PageObjects.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import w2c.marketData.Common.BasePageObject;

public class AddCustomerPage extends BasePageObject {
	By CustomerName = By.name("name");
	By Gender = By.xpath("//input[@value='f']");
	By DOB = By.name("dob");
	By Address = By.name("addr");
	By City = By.name("city");
	By State = By.name("state");
	By PIN = By.name("pinno");
	By MobileNumber = By.name("telephoneno");
	By Email = By.name("emailid");
	By Password = By.name("password");
	By Submit = By.name("sub");
	By Continue = By.linkText("Continue");

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// set customer name in text box
	public void setCustomername(String customername) {
		assignValueWhenReady(CustomerName, customername, 5000);
	}

	public void setGender() {
		driver.findElement(Gender).click();
	}

	public void setDOB(String dob) {
		driver.findElement(DOB).sendKeys(dob);
	}

	public void setAddress(String Add) {
		driver.findElement(Address).sendKeys(Add);
	}

	public void setCity(String city) {
		driver.findElement(City).sendKeys(city);
	}

	public void setState(String state) {
		driver.findElement(State).sendKeys(state);
	}

	public void setPin(String pin) {
		driver.findElement(PIN).sendKeys(pin);
	}

	public void setMobileNumber(String mnumber) {
		driver.findElement(MobileNumber).sendKeys(mnumber);
	}

	public void setEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}

	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}

	public RegisterdCustomerDetailPage ClickSubmit() {
		clickWhenReady(Submit, 3000);
		// driver.findElement(Submit).click();
		RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		return regPage;
	}
	/*
	 * public void ClickContinue(){ driver.findElement(Continue).click(); }
	 */
}
