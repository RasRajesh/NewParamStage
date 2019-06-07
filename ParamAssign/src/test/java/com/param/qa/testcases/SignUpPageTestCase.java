package com.param.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.qa.base.Base;
import com.param.qa.pages.HomePage;
import com.param.qa.pages.SignUpPage;

public class SignUpPageTestCase extends Base{
	HomePage homepage;
	SignUpPage signuppage;
	
	public SignUpPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage=new HomePage();
		signuppage=new SignUpPage();
	}
	
	/*  @Test(priority=1)
	public void verifySignUpPage() {
		//To validate the title of signup page to verify that we are on signup page
		homepage.clickonSignUp();
		String str=signuppage.signUpPageTitle();
		Assert.assertEquals(str,"Signup | Discover, Engage and Hire Talent faster");
	} */
	
	@Test
	public void entertheData() {
		//Just to enter the data not for validation
		homepage.clickonSignUp();
		signuppage.enterData();
	}
	
	
	@AfterMethod
	public void tearDown(){
		//We are not calling driver.quit(),because we want to see the data which we entered
	}
}
