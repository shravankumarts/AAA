package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	By uid=By.id("identifierId");
	By next=By.xpath("//DIV[contains(@id, 'identifierNext')]");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void filluserid(String d)
	{
		driver.findElement(uid).sendKeys(d);
		
	}
	public void next()
	{
		driver.findElement(next).click();
	}
	

}
