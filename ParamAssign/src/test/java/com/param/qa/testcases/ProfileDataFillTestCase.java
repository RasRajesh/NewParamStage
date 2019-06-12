package com.param.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.qa.base.Base;
import com.param.qa.pages.CompanyProfilePage;
import com.param.qa.pages.HomePage;
import com.param.qa.pages.LoginPage;
import com.param.qa.pages.OnBoarding;

public class ProfileDataFillTestCase extends Base {
	HomePage homepage;
	LoginPage loginpage;
	OnBoarding onboarding;
	CompanyProfilePage companyprofile;
	
	
	public ProfileDataFillTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage =new HomePage();
		loginpage = new LoginPage();
		loginpage= homepage.clickonLogin();
		onboarding = new OnBoarding();
		onboarding= loginpage.login();
		companyprofile = new CompanyProfilePage();
		companyprofile=onboarding.clickOnCompanyProfile();
	}
	
	@Test(priority=1)
	public void profileFillTest() {
		companyprofile =companyprofile.companyProfileFill();
		Assert.assertEquals(companyprofile.profileTitle(), "Param.ai");
	}
	
	@Test(priority=2)
	public void officeLocationfill() {
	companyprofile.officeLocation();
	Assert.assertEquals(companyprofile.profileTitle(), "Param.ai");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
