package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeInvoicePage extends ProjectSpecificMethods
{
	public AcmeInvoicePage enterVendorID() 
	{
		driver.findElementById("vendorTaxID").sendKeys("DE763212");
		return this;
	}
	
	public AcmeSearchResultPage clickSearchButton()
	{
		driver.findElementById("buttonSearch").click();
		return new AcmeSearchResultPage();
		
	}
}
