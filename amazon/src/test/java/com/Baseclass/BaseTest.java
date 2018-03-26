package com.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{
	// commiting
	public static WebDriver driver;
	@BeforeClass
	public static void openApp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shravan\\Desktop\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		System.out.println("Opened successfully");
	}
	@AfterClass
	public static void closebrowser()
	{
		driver.close();
		System.out.println("Browser closed");
	}
}
