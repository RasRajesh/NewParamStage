package com.param.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.qa.base.Base;
import com.param.qa.pages.HomePage;
import com.param.qa.pages.LoginPage;
import com.param.qa.pages.OnBoarding;

public class LoginPageTestcase extends Base {

	HomePage homepage;
	LoginPage loginpage;
	
	public LoginPageTestcase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage =new HomePage();
		loginpage = new LoginPage();
	}
	
	@Test
	public void verifyLoginPageTitle() {
		homepage.clickonLogin();
		String str=loginpage.loginPageTitle();
		Assert.assertEquals(str,"Login | Discover, Engage and Hire Talent faster");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
