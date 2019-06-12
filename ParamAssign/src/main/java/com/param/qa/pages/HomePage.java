package com.param.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.param.qa.base.Base;

public class HomePage extends Base {
	

	@FindBy(xpath="//*[@id=\"cta\"]/button")
	WebElement Singup;
	
	@FindBy(css="a.right.item.big-menu>button")
	WebElement Login;
	
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
	
	public LoginPage clickonLogin() {
		WebDriverWait wt= new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.elementToBeClickable(Login));
		Login.click();
		return new LoginPage();
	}
	
}