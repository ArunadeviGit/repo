package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.AcmeLoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC_ACME_GetInvoiceNumber extends ProjectSpecificMethods

{
	
	@BeforeTest
	public void setData() {
		testcaseName="ACME";
		testcaseDec = "get value of IT support";
		author="Arunadevi";
		category="smoke";
	}
	@Test
	public void getInvoiceNumber() 
	{
		new AcmeLoginPage()
		.enterEmail()
		.enterPassword()
		.clickLogin()
		.selectinvoiceOption()
		.selectSearchforInvoice()
		.enterVendorID()
		.clickSearchButton()
		.getInvoiceNumber()
		.clickLogOut();
	}

}
