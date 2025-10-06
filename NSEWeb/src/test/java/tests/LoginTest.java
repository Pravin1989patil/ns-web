package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.NSLoginPage;

public class LoginTest {

	@Test
	public void Login()
	{
		BaseTest.launchBrowser();
		BaseTest.openURL("http://azeunseqas006:7070/#/login");
		NSLoginPage.eneterUserName("TOSCA_DBA");
		NSLoginPage.eneterPassword("111111111");
		NSLoginPage.clickSignInButton();
	}
}
