package lib.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.locators.Contact;
import lib.pages.ContactPage;

public class ContactPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public ContactPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait	= wait;
	}
	
	public ContactPage verifyContactPageTitle(String title) {
		String pageTitle = driver.getTitle();
		assertEquals(pageTitle, title);
		return this;
	}
	
	private ContactPage enterFirstName(String firstName) {
		driver.findElement(By.name(Contact.FIRST_NAME)).sendKeys(firstName);
		assertEquals(driver.findElement(By.name(Contact.FIRST_NAME)).getAttribute("value"), firstName);
		return this;
	}
	
	private ContactPage enterLastName(String lastName) {
		driver.findElement(By.name(Contact.LAST_NAME)).sendKeys(lastName);
		assertEquals(driver.findElement(By.name(Contact.LAST_NAME)).getAttribute("value"), lastName);
		return this;
	}
	
	private ContactPage enterEmail(String email) {
		driver.findElement(By.name(Contact.EMAIL)).sendKeys(email);
		assertEquals(driver.findElement(By.name(Contact.EMAIL)).getAttribute("value"), email);
		return this;
	}
	
	private ContactPage enterCompany(String company) {
		driver.findElement(By.cssSelector(Contact.COMPANY)).sendKeys(company);
		assertEquals(driver.findElement(By.cssSelector(Contact.COMPANY)).getAttribute("value"), company);
		return this;
	}
	
	private ContactPage enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.name(Contact.PHONE)).sendKeys(phoneNumber);
		assertEquals(driver.findElement(By.name(Contact.PHONE)).getAttribute("value"), phoneNumber);
		return this;
	}
	
	private ContactPage enterComments(String comments) {
		driver.findElement(By.xpath(Contact.COMMENTS)).sendKeys(comments);
		assertEquals(driver.findElement(By.xpath(Contact.COMMENTS)).getAttribute("value"), comments);
		return this;
	}
	
	public ContactPage enterContactPageDetails(String firstName, String lastName, String email, String company, String phoneNumber, String comments) {
		this.enterFirstName(firstName);
		this.enterLastName(lastName);
		this.enterEmail(email);
		this.enterCompany(company);
		this.enterPhoneNumber(phoneNumber);
		this.enterComments(comments);
		return this;
	}
}