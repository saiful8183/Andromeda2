package com.qa.testCases;


import org.testng.annotations.Test;
import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;

public class TestBanking extends BaseClass {

	
	@Test(priority=1)
	public void openBankSite() {
		
		logger=report.createTest("Client creation Test");

	

		// creating an object of Homepage class
		HomePage home = new HomePage(driver);
		home.loginAsManager();
		logger.info("Logged in as a manager");
		home.addCustomer(excel.getStringData("Client", 1, 0), excel.getStringData("Client", 1, 1),
				excel.getStringData("Client", 1, 2));
		logger.info("Added a client");


	}
}
