package requirements;

import org.testng.annotations.Test;

import configuration.Configuration;
import lib.data.CommonData;
import lib.data.ContactData;
import lib.data.HomeData;
import lib.pages.ContactPage;
import lib.pages.HomePage;
import lib.sharedModule.Shared;

public class OneTrustAutomation extends Configuration {

	@Test(description = "Fill all fields in Contact page and take screenshot")
	
	public void fillAllFieldsAndTakeScreenshot() throws Exception {

		// Creating page objects
		Shared shared = new Shared(driver, wait);
		HomePage homePage = new HomePage(driver, wait);
		ContactPage contactPage = new ContactPage(driver, wait);

		// Creating data object
		ContactData contactData = new ContactData();

		//Actual scenario starts
		shared.launchURL(CommonData.ONE_TRUST_URL);

		homePage.verifyHomePageTitle(HomeData.HOME_PAGE_TITLE);
		shared.navigateToContact(CommonData.CONTACT_URL);

		contactPage.verifyContactPageTitle(ContactData.CONTACT_PAGE_TITLE)
				.enterContactPageDetails(contactData.firstName, contactData.lastName, contactData.email, 
						ContactData.COMPANY, contactData.phone, contactData.comments);

		shared.takeScreenShot();
	}
}