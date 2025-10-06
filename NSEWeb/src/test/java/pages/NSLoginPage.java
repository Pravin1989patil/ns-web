package pages;

import base.BaseTest;
public class NSLoginPage extends BaseTest{
	//username
	public static void eneterUserName(String userName)
	{
		enterText(findElementByID("username"), userName);
	}

	public static void eneterPassword(String password)
	{
		enterText(findElementByID("password"), password);
	}
	
	public static void clickSignInButton()
	{
		click(findElementByXPath("//button[text()='Sign In ']"));
	}
	
	
}
