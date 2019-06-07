package com.param.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.param.qa.base.Base;

public class SignUpPage extends Base{
	
	@FindBy(id="id_first_name")
	WebElement firstname;
	
	@FindBy(id="id_last_name")
	WebElement lastname;
	
	@FindBy(id="id_email")
	WebElement workemail;
	
	@FindBy(id="id_password")
	WebElement password;
	
	@FindBy(id="id_company_name")
	WebElement companyname;
	
	@FindBy(id="id_team_type")
	WebElement companytype;
	
	@FindBy(xpath="//*[@classname=\"field\"]/button")
	WebElement signupbutton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
		
	public String signUpPageTitle(){
		return driver.getTitle();
	}
	
	public void enterData() {
		firstname.sendKeys("Test1");
		lastname.sendKeys("lastTest");
		workemail.sendKeys("fymexeho@getnada.com");
		password.sendKeys("Test@123");
		companyname.sendKeys("Temporary");
		Select st= new Select(companytype);
				st.selectByVisibleText("Company");
		signupbutton.click();
	}

}
