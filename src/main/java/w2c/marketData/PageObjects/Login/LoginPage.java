package w2c.marketData.PageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import w2c.marketData.Common.BasePageObject;

public class LoginPage  extends BasePageObject{
	//WebDriver driver;
	
	By UserID = By.name("uid");
	By Password = By.name("password");
	By Login = By.name("btnLogin");
	By Reset = By.name("btnReset");
// Page related Work only 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public HomePageObject Login() {
		driver.manage().window().maximize();
		setUserName("mngr75232");
		setPassword("etepaty");
		ClockOnSubmit();
		
		return new HomePageObject(this.driver);
	}
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean verifyLoginPageTitle() {
		String expectedTitle = "Guru99 Bank Home Page";
		return getLoginPageTitle().contains(expectedTitle);
	}
	public void setUserName(String userName) {
			assignValueWhenReady(UserID, userName, 3000);
	}
	public void setPassword(String password) {
		assignValueWhenReady(Password, password, 3000);
	}
	public void ClockOnSubmit() {
		clickWhenReady(Login, 3000);
	}
	public boolean LoginVerify() {
		Assert.assertTrue(driver.findElement(By.linkText("Manger Id")).isDisplayed());
		return false;
	}
}
