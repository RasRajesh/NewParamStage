package com.param.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.param.qa.base.Base;

public class LoginPage extends Base {
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="btn")
	WebElement loginbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public OnBoarding login() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
		return new OnBoarding();
	}
	
	public String onBoardingTitle() {
		return driver.getTitle();
	}

}
