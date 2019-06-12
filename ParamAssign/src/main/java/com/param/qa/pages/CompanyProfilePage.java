package com.param.qa.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.param.qa.base.Base;

public class CompanyProfilePage extends Base {
	
	@FindBy(css="form.ui.form>div:nth-child(2)>input[type=text]")
	WebElement CompanyWebSite;
	
	@FindBy(css="form.ui.form>div:nth-child(6)>textarea")
	WebElement AboutCompany;
	
	@FindBy(css="button.ui.green.button")
	WebElement Savebutton;
	
	@FindBy(xpath="//a[@href='/app/settings/offices']")
	WebElement OfficeLocation;
	
	@FindBy(css="div.twelve.wide.column.setting-form > div:nth-child(3) > div.no-offices > div")
	WebElement AddOfficeLocation;
	
	@FindBy(css="#content>div.ui.dimmer.modals.page.transition.visible.active > div > div.content > div > div.field > input[type=text]")
	WebElement LocationName;
		
	public CompanyProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String profileTitle() {
		return driver.getTitle();
	}
	public CompanyProfilePage companyProfileFill() {
		CompanyWebSite.clear();
		CompanyWebSite.sendKeys(prop.getProperty("companyurl"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		AboutCompany.clear();
		AboutCompany.sendKeys(prop.getProperty("aboutCompany"));
		Savebutton.click();
		return new CompanyProfilePage();
	}
	
	public void officeLocation() { 
		OfficeLocation.click();
		AddOfficeLocation.click();
		Set<String> WH= driver.getWindowHandles();
		for(String wind:WH) {
			driver.switchTo().window(wind);
		LocationName.sendKeys("HeadOffice");
		}
		
		}
}
