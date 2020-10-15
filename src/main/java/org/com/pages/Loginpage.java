package org.com.pages;

import org.com.TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass{
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement Loginbutton;
	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement CRMlogo;

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public String FetchLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateCRMlogo() {
		return CRMlogo.isDisplayed();
	}
	public HomePage Login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbutton.click();
		return new HomePage();
	}
}
