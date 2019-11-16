package com.leafBot.pages;

import org.openqa.selenium.Keys;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeLoginPage extends ProjectSpecificMethods
{
	public AcmeLoginPage enterEmail()
	{
		clearAndType(locateElement("id", "email"), "kumar.testleaf@gmail.com");
		//driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		return this;
	}
	
	public AcmeLoginPage enterPassword()
	{
		clearAndType(locateElement("id", "password"), "leaf@12");
		//driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}

	public AcmeHomePage clickLogin()
	{
		click(locateElement("id","buttonLogin"));
		//driver.findElementById("buttonLogin").click();
		return new AcmeHomePage();
	}
}
