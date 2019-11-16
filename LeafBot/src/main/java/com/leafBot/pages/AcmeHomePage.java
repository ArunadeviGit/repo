package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeHomePage extends ProjectSpecificMethods
{
	public AcmeHomePage selectinvoiceOption() 
	{
		Actions builder = new Actions(driver);
		WebElement invoiceOption = driver.findElementByXPath("//button[text()[normalize-space()='Invoices']]");
		builder.moveToElement(invoiceOption).perform();
		return this;
	}
	
	public AcmeInvoicePage selectSearchforInvoice()
	{
		driver.findElement(By.linkText("Search for Invoice")).click();
		return new AcmeInvoicePage();
		
	}
}
