package w2c.marketData.PageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	
	By UserID = By.name("uid");
	By Password = By.name("password");
	By Login = By.name("btnLogin");
	By Reset = By.name("btnReset");
// Page related Work only 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public HomePageObject Login(){
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
			driver.findElement(UserID).sendKeys(userName);
	}
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	public void ClockOnSubmit() {
		driver.findElement(Login).click();
	}
	public boolean LoginVerify() {
		Assert.assertTrue(driver.findElement(By.linkText("Manger Id")).isDisplayed());
		return false;
	}
}
