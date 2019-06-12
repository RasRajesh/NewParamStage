package com.param.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.param.qa.base.Base;

public class OnBoarding extends Base{
	
	@FindBy(css="div.cta")
	WebElement CompanyProfile;
	
	public OnBoarding() {
		PageFactory.initElements(driver, this);
	}
	
	public CompanyProfilePage clickOnCompanyProfile() {
		WebDriverWait wt  = new WebDriverWait(driver,40);
		wt.until(ExpectedConditions.elementToBeClickable(CompanyProfile));
		CompanyProfile.click();
		return new CompanyProfilePage();
	}

}
