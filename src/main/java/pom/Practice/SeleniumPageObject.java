package pom.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObject {
	
	public  SeleniumPageObject(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText = "Download")
	public WebElement  lnkDownload;
	
	@FindBy(xpath="//div[@id='header']/h1/a")
	public WebElement lnkHome;
	
	public void ClickDownload(){
		lnkDownload.click();
	}
	public void ClickHome(){
		lnkHome.click();
	}
	
}
