package com.testScripts;

import org.testng.annotations.Test;

import com.Baseclass.BaseTest;
import com.Pages.LoginPage;



public class Login_Test extends BaseTest
{
	@Test
	public void loginma()
	{
		BaseTest.openApp();
		LoginPage a=new LoginPage(driver);
		a.filluserid("Kondameedianji");
		a.next();
		BaseTest.closebrowser();
		
	}
}
