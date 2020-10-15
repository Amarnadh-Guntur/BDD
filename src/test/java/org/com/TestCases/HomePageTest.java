package org.com.TestCases;

import org.com.TestBase.BaseClass;
import org.com.Utility.CommonUtil;
import org.com.pages.HomePage;
import org.com.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
	Loginpage loginpage;
	HomePage homepage;
	CommonUtil commonUtil;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
public void Gameon() {
	initiaization();
	commonUtil=new CommonUtil();
	loginpage=new Loginpage();
	
	homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));	
}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
	String homepagetitle=homepage.verifyHomePageTitle();
	Assert.assertEquals(homepagetitle, "CRMPRO - CRM software for customer relationship management, sales, and support.","Home Page title not matched");
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		commonUtil.switchToFrame();
		Assert.assertTrue(homepage.verifyUserName());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
