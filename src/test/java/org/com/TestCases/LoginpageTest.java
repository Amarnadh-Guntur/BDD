package org.com.TestCases;

import org.com.TestBase.BaseClass;
import org.com.pages.HomePage;
import org.com.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageTest extends BaseClass {
	
	Loginpage loginpage;
	HomePage homepage;
	public LoginpageTest() {
		super();
	}
@BeforeMethod
public void Check() {
	initiaization();
	 loginpage = new Loginpage();
	
}
@Test 
public void CRMlogoTest() {
	boolean Flag=loginpage.ValidateCRMlogo();
	Assert.assertTrue(Flag);
}

@Test
public void CRMloginpageTitleTest() {
	String title=loginpage.FetchLoginPageTitle();
	Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
}

@Test
public void LoginValidationTest() {
	loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
}
@AfterMethod
public void teardown() {
	driver.quit();
}


}
