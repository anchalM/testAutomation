package pom.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObject {

		public GoogleHomePageObject(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		@FindBy(name ="q")
		public WebElement txtSearch;
		
		@FindBy(name = "btnG")
		public WebElement btnSearch;
		
		@FindBy(linkText = "Selenium - Web Browser Automation")
		public WebElement linkSelenium;
		
		
		public void SearchGoogle(String searchText){
			txtSearch.sendKeys(searchText);
			btnSearch.click();
					}
		
		public void ClickSelenium(){
			linkSelenium.click();
		}
}
