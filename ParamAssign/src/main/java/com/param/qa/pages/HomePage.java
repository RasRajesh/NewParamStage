package com.param.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.param.qa.base.Base;

public class HomePage extends Base {
	

	@FindBy(xpath="//*[@id=\"cta\"]/button")
	WebElement Singup;
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);	
		}
	
	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public SignUpPage clickonSignUp() {
		Singup.click();
		return new SignUpPage();
	}
	
	
}