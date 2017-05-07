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
		assignValueWhenReady(DOB, dob, 3000);
	}

	public void setAddress(String Add) {
		assignValueWhenReady(Address, Add, 3000);
	}

	public void setCity(String city) {
		assignValueWhenReady(City, city, 3000);
	}

	public void setState(String state) {
		assignValueWhenReady(State, state, 3000);
	}

	public void setPin(String pin) {
		assignValueWhenReady(PIN, pin, 3000);
	}

	public void setMobileNumber(String mnumber) {
		assignValueWhenReady(MobileNumber, mnumber, 3000);
	}

	public void setEmail(String email) {
		assignValueWhenReady(Email, email, 2000);
	}

	public void setPassword(String password) {
		assignValueWhenReady(Password, password, 3000);
	}

	public RegisterdCustomerDetailPage ClickSubmit() {
		clickWhenReady(Submit, 3000);
		RegisterdCustomerDetailPage regPage = new RegisterdCustomerDetailPage(driver);
		return regPage;
	}

}
