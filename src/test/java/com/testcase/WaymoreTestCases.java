package com.testcase;
import org.testng.annotations.*;

import com.pages.ContactInsightPage;
import com.pages.LoginPage;

public class WaymoreTestCases extends basePackage.Baseclass{
	
	@BeforeTest
	public void launchWebsite() {
		browserLanuch();
		
	}
	
//	@AfterTest
//	public void tearDown() {
//		closeBrowser();
//	}
		
	
	@Test (priority = 1)
	public void loginPageTestCase() {
		LoginPage lp =new LoginPage(driver);
		lp.login();
		
	}
	
	
	@Test(priority = 2)
	public void contactInsightTestCase() {
		ContactInsightPage contacts = new ContactInsightPage(driver);
		contacts.addNewContact();
		contacts.searchContact();
		
	}

}
