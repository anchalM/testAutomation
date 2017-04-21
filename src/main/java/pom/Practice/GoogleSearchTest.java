package pom.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	public WebDriver driver;
	
	@Test
	
	public void googleSearchTest(){
	System.setProperty("webdriver.gecko.driver","C:\\TestAutomation\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	driver.navigate().to("https://www.google.co.in/");
	GoogleHomePageObject page = new GoogleHomePageObject(driver);
	page.SearchGoogle("Selenium");
	page.ClickSelenium();
	
	SeleniumPageObject seleniumPage = new SeleniumPageObject(driver);
	seleniumPage.ClickDownload();
	seleniumPage.ClickHome();
}
}