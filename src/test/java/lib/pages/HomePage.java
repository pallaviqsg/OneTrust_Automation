package lib.pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.pages.HomePage;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait	= wait;
	}
	
	public HomePage verifyHomePageTitle(String title) {
		String homePagetitle = driver.getTitle();
		assertEquals(homePagetitle, title);
		return this;
	}
}