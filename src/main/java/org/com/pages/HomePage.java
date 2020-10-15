package org.com.pages;

import org.com.TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	@FindBy(xpath="//td[containstext(),'User: Demo User']")
	WebElement Usernamelabel;
	@FindBy(xpath="//td[containstext(),'Contacts']")
	WebElement Contactslink;
	@FindBy(xpath="//td[containstext(),'Deals']")
	WebElement Dealslink;
	@FindBy(xpath="//td[containstext(),'Tasks']")
	WebElement Taskslink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean verifyUserName() {
		return Usernamelabel.isDisplayed();
	}
	
	public Contactspage ClickonContactslink() {
		Contactslink.click();
		return new Contactspage();
	}
	public DealsPage ClickonDealslink() {
		Dealslink.click();
		return new DealsPage();
	}
	public TasksPage ClickonTaskslink() {
		Taskslink.click();
		return new TasksPage();
	}
}
