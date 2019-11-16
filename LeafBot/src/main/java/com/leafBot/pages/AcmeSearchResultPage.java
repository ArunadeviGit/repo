package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeSearchResultPage extends ProjectSpecificMethods 
{
	public AcmeSearchResultPage getInvoiceNumber()
	{
		List<WebElement> invoiceNumberElement = driver.findElementsByXPath("(//td[text()='IT Support'])/preceding-sibling::td[2]");
		for(WebElement num: invoiceNumberElement)
		{
			String invoiceNumber = num.getText();
			System.out.println(invoiceNumber);
		}
		return this;
	}
	
	public AcmeLoginPage clickLogOut()
	{
		driver.findElementByLinkText("Log Out").click();
		return new AcmeLoginPage();
	}
	
}
