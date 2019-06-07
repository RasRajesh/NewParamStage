package com.param.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.qa.base.Base;
import com.param.qa.pages.HomePage;
import com.param.qa.pages.SignUpPage;

public class HomePageTestcase extends Base {
	
	HomePage homepage;
	SignUpPage singuppage;
	
	public HomePageTestcase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage =new HomePage();
	}
	
	@Test
	public void verifyHomePageTitle() {
		String str=homepage.homePageTitle();
		Assert.assertEquals(str,"Param.ai - Discover, Engage and Hire Talent faster","Wrong Message");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
